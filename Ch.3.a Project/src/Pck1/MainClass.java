//Carter Howell
//COP2800 T/Th AM

package Pck1;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("19283", "Carter", "Howell", "Computer Programming", "3.6"));
		list.add(new Student("93810", "Fabiana", "Hernandez", "Bio Medical", "3.9"));

		Student.displayData(list);
		
	}

}
