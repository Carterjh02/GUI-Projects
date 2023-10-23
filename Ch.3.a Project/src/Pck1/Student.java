//Carter Howell
//COP2800 T/Th AM

package Pck1;

import java.util.ArrayList;

public class Student extends Person {

	public String id;
	public String major;
	public String gpa;
	
	public Student() {
		
	}
	
	public Student(String id, String firstName, String lastName, String major, String gpa) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.gpa = gpa;
	}
	
	public static void displayData(ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			
		Student temp = list.get(i);
		System.out.println("Id:" + temp.id + " Name:" + temp.firstName + " " + temp.lastName + " Major:" + temp.major + " GPA:" + temp.gpa);
		
		}
		
}
}	
