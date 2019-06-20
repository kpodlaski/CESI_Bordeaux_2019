package accesrules.aspectElements;

import accesrules.javaElements.database.DataBase;
import accesrules.javaElements.model.Person;

/*
 * In our example we would like to imply access rules
 * 1. Administrator can see everything
 * 2. Department can see all data of people in his/her department
 * 3. User can see name,surname,department of people in its department (can't see salary)
 * 4. User cannot see people in other departments
 */

privileged  aspect DataBaseAccessRules {

	//The only method of getting data is getPersonBySurname
	//define appropriate  pointcut
	
	pointcut personBySurname(String name,Person client) : 
				execution(* DataBase.getPersonBySurname(..)) &&
				args(name,client);
	Person around(String name, Person client, DataBase dbase) : 
				personBySurname(name,client) && 
				target(dbase)
	{
		Person p = proceed(name,client,dbase);
		Person admin = dbase.administrator;

		//1. Administrator can see everything
		if (client.equals(admin) )  
				return p;

		//2. Department can see all data of people in his/her department
		if (p.getDepartment().getHeadPerson().equals(client))
				return p;
		
		//3. User can see name,surname of pepole in his/her department
		if (p.getDepartment().equals( client.getDepartment() ))
		{
			//Hiding unaviable data using temporary similar Person object
			//Hiding salary
			Person temp = new Person(p.getName(), p.getSurname(), -1.0);
			temp.setDepartment(p.getDepartment());
			return 	temp;		
		}
		
		return null;
	}
	
	pointcut printing() : execution (* DataBase.g*(..));
	
	before(): printing()
	{
		System.out.println("ASPECT" + thisJoinPoint.getSignature());
		Object[] o = thisJoinPoint.getArgs();
		for (Object arg : o)
		{
			System.out.println(arg.getClass()+ " :: "+arg);
		}
	}
}
