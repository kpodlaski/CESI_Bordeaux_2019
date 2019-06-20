package accesrules.javaElements.application;

import accesrules.javaElements.database.DataBase;
import accesrules.javaElements.model.Person;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		DataBase dBase = new DataBase();
		
		//Start with Administrator account
		Person admin = dBase.getAdministrator();
		
		//Asking as admin
		Person p = dBase.getPersonBySurname("Doug", admin);
		System.out.println(p);
		
		//Asking as normal user for person in the same department
		Person p2 = dBase.getPersonBySurname("Bond", p);
		System.out.println(p2);
		
		//Asking as normal user for person in other department
		p2 = dBase.getPersonBySurname("Driver", p);
		System.out.println(p2);
		
		p = dBase.getPersonBySurname("Bond", admin);
		
		//Asking as department head for person in the same department
		p2 = dBase.getPersonBySurname("Hod", p);
		System.out.println(p2);
	}

}
