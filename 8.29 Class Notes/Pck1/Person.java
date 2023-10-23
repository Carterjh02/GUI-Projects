package Pck1;

public class Person {

	String firstName; 
	String lastName; 
	int id;
	
	
	public Person(String firstName, String lastName, int id) 
	{
	
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public void displayData()
	
	{
	System.out.println(id);
	System.out.println(firstName + " " + lastName + "\n");
	
	}
	
}