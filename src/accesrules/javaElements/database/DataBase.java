package accesrules.javaElements.database;

import java.util.ArrayList;

import accesrules.javaElements.model.Department;
import accesrules.javaElements.model.Person;



public class DataBase {

	private ArrayList<Department> organization = new ArrayList<Department>(); 
	private ArrayList<Person> persons = new ArrayList<Person>();
	private Person administrator;
	
	public Person getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Person administrator) {
		this.administrator = administrator;
	}

	public DataBase()
	{
		Person p = new Person("Alexander", "Godweel", 2460);
		Department d =  new Department("IT", p);
		organization.add(d);
		persons.add(p);
		
		p= new Person("Tamara","Olejnik",1200);
		d.addPerson(p);
		administrator = p;
		
		p= new Person("John","Driver",1140);
		d.addPerson(p);
		persons.add(p);
		
		p = new Person("Stefan", "Bond", 3460);
		d =  new Department("Accounting", p);
		organization.add(d);
		persons.add(p);
		
		
		p= new Person("Elaine","Hod",2200);
		d.addPerson(p);
		persons.add(p);
		
		p= new Person("Jimme","Doug",1660);
		d.addPerson(p);
		persons.add(p);
	}
	
	public Person getPersonBySurname(String name, Person askingPerson )
	{
		for (Person p : persons)
		{
			if (p.getSurname().equalsIgnoreCase(name))
				return p;			
		}
		return null;
	}
}
