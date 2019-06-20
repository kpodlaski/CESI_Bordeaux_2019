package accesrules.javaElements.model;

import java.util.ArrayList;

public class Department {
	private ArrayList<Person> personel = new ArrayList<Person>();
	private String name;
	private Person headPerson;
	
	
	
	public Department(String name, Person headPerson) {
		super();
		this.name = name;
		this.headPerson = headPerson;
		headPerson.setDepartment(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person getHeadPerson() {
		return headPerson;
	}
	public void setHeadPerson(Person headPerson) {
		this.headPerson = headPerson;
	}
	
	
	public void addPerson(Person p)
	{
		personel.add(p);
		p.setDepartment(this);
	}
	
	public void removePerson(Person p)
	{
		personel.remove(p);
		p.setDepartment(null);
	}
	
	public String toString()
	{
		return name;
	}
}
