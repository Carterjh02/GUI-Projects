package Pck1;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<String> Chicken = new ArrayList<String>();

		Chicken.add("Chicken Piccata");
		Chicken.add("Sesame Chicken");
		Chicken.add("Orange Chicken");
		Chicken.add("Chicken Nuggets");
		Chicken.add("Grilled Chicken");
		Chicken.add("Chicken Rice Bowl");
		Chicken.add("Chicken Sandwhich");
		Chicken.add("Chicken Enchilada");
		Chicken.add("Chicken Parmesean");
		Chicken.add("Chicken Fried Rice");
		Chicken.add("Chicken Alfredo");
		Chicken.add("Chicken Quesadilla");
		
		
		ArrayList<String> Beef = new ArrayList<String>();
		
		Beef.add("Stuffed Pepper");
		Beef.add("Burgers");
		Beef.add("Beef Enchiladas");
		Beef.add("Tacos");
		Beef.add("Picadillo");
		Beef.add("Lasagna");
		Beef.add("Spaghetti Casserole");
		Beef.add("Meatballs");
		Beef.add("Beef Roast");
	
		ArrayList<String> Pork = new ArrayList<String>();
		
		Pork.add("Tacos");
		Pork.add("Porkchop");
		Pork.add("Ribs");
		Pork.add("Pork Roast");
		
		ArrayList<String> Sides = new ArrayList<String>();
		
		Sides.add("Green Beans");
		Sides.add("Mashed Potato");
		Sides.add("French Fries");
		Sides.add("Tortilla Chips");
		Sides.add("Scallop Potatoes");
		Sides.add("Rice");
		Sides.add("Asparagus");
		
		MainClass obj = new MainClass();
		System.out.println("Chicken Option " + obj.getRandomElement(Chicken)); 
		
		MainClass obj1 = new MainClass();
		System.out.println("Beef Option: " + obj1.getRandomElement(Beef));
		
		MainClass obj2 = new MainClass();
		System.out.println("Pork Option: " + obj2.getRandomElement(Pork));
		
		MainClass obj3 = new MainClass();
		System.out.println("Sides Options: " + obj3.getRandomElement(Sides)); 
		System.out.println("or " + obj3.getRandomElement(Sides)); }
		
		public String getRandomElement(ArrayList<String> Chicken) {
			Random rand = new Random();
			return Chicken.get(rand.nextInt(Chicken.size()));
		
	}
		}

	

