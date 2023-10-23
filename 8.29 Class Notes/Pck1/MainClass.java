package Pck1;

public class MainClass {

	public static void main(String[] args ){
		
		//Chapter 9
		
		Person p1 = new Person("Fabiana", "Hernandez", 1);
		
		Person p2 = new Person("Carter", "Howell", 2);
		
		Person p3 = new Person("Marko", "Hernandez", 3);
		
		Person p4 = new Person("Stacey", "Howell", 4);
		
		Person p5 = new Person("Carolina", "Hernandez", 5);
		
		Person p6 = new Person("Kelsey", "Howell", 6);
		
		
		Person[] peopleAry = new Person[6];
		peopleAry[0] = new Person("Fabiana", "Hernandez", 1); //save time instead of double typing code
		peopleAry[1] = p2;
		
		
		displayData(p1);
		displayData(p2);
		displayData(p3);
		displayData(p4);
		displayData(p5);
		p6.displayData();
		
		displayData(peopleAry[0]);
		displayData(peopleAry[1]);
		
		//displayData(peopleAry); to display a whole array
		
	}

	public static void displayData(Person p)
	
	//if display whole array, switch Person for people (array name)
	//public static void displayData(Person[] pAry)
	
	{
		//to display all of an array, use - for (int i = 0; i< pAry.length; i++)
		p.displayData();
	}
	//if(pAry[i] != null) new bracket for empty data / not enough people in array
	//pAry[i].displayData();
}
