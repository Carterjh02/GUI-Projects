package Pck1;

import java.util.ArrayList;

public class MainClass {
	
	public ArrayList<Student> list = new ArrayList<Student>(2);
	
	public Student student1 = new Student("12987", "Carter", "Howell", "Computer Programming", "3.7");
	public Student student2 = new Student("18273", "Fabiana", "Hernandez", "Bio Medical", "3.9");
	public Student student3 = new Student("40983", "Holger", "Findling", "Computer Science", "4.0");
	public Student student4 = new Student("48937", "Billy", "Bob", "Religious Studies", "2.1");

	public static void main(String[] args) {
		
		Student student1 = new Student("12987", "Carter", "Howell", "Computer Programming", "3.7");
		Student student2 = new Student("18273", "Fabiana", "Hernandez", "Bio Medical", "3.9");
		Student student3 = new Student("40983", "Holger", "Findling", "Computer Science", "4.0");
		Student student4 = new Student("48937", "Billy", "Bob", "Religious Studies", "2.1");
		
		ArrayList<Student> list = new ArrayList<Student>(2);
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);	
		
		Student.displayData(student1);
			
		Student.displayData(list);
		}
	}

