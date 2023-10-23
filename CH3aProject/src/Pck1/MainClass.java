//Carter Howell
//COP 2800 T/Th
//October , 2023

package Pck1;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Person(12398, "Carter", "Howell"));
		list.add(new Person(20678, "Fabiana", "Hernandez"));
		list.add(new Person(31987, "Billy", "Bob"));
		list.add(new Person(43726, "Holger", "Findling"));
		
		System.out.println(list);
		
	}

}
