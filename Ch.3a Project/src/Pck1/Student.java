package Pck1;

import java.util.ArrayList;

public class Student extends Person{

	public Student student1;
	public String gpa;
	public String major;
	
	public Student() {
	}
	
	public Student(String id, String firstName, String lastName, String major, String gpa) {
		super();
		this.major = major;
		this.gpa = gpa;
		
	}
	public String toString() {
		
		return("Id: " + id + " Name: " + firstName + " " + lastName + 
				" Major: " + major + " GPA: " + gpa);
	}

	public void displayData(Student ) {
		System.out.println(Student + "\n");
		
	}
}

	//public void displayData() {
	//	for (int i = 0; i < list.size(); i++) {
	//		System.out.println(list + "\n");
	//	}
	}
//}


