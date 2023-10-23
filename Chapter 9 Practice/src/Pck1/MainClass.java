package Pck1;

public class MainClass {

	public static void main(String[] args) {
		
		Person[] peopleAry = new Person[6];
		peopleAry[0] = new Person("Carter", "Howell", 1);
		peopleAry[1] = new Person("Stacey", "Howell", 2);
		peopleAry[2] = new Person("Kelsey", "Howell", 3);
		peopleAry[3] = new Person("Fabiana", "Hernandez", 4);
		peopleAry[4] = new Person("Marko", "Hernandez", 5);
		peopleAry[5] = new Person("Carolina", "Hernandez", 6);
		
		displayData(peopleAry);
		

	}
	

	public static void displayData(Person[] pAry)
	

{
	for (int i = 0; i < pAry.length; i++)
	{
		if (pAry[i] != null)
		{
	pAry[i].displayData();
		}
		}
	}
}