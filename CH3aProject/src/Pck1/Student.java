package Pck1;

public class Student extends Person {
	
	public double gpa;
	public String major;
	
	public Student() {
	}

	public Student(double gpa, String major) {
		super();
		this.major = major;
		this.gpa = gpa;
		
	}
}
