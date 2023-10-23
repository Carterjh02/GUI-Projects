package Pck1;

import java.util.Arrays;
import java.util.ArrayList;

public class Vehicle {

	String make;
	String model;
	String year;
	
	public Vehicle(String make, String model, String year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	static String[] Array1 = {"Nissan", "Altima", "2019"};
	static String[] Array2 = {"Hyundai", "Tuscon", "2023"};
	static String[] Array3 = {"Honda", "Accord", "2021"};
	static String[] Array4 = {"Toyota", "Prius", "2019"};
	
	static ArrayList<String> vehicleList1 = new ArrayList<>(Arrays.asList(Array1));
	static ArrayList<String> vehicleList2 = new ArrayList<>(Arrays.asList(Array2));
	static ArrayList<String> vehicleList3 = new ArrayList<>(Arrays.asList(Array3));
	static ArrayList<String> vehicleList4 = new ArrayList<>(Arrays.asList(Array4));
	
	public String year2 = "2019";
	
	public void find2019() {
		if(vehicleList1.indexOf(year2) != -1) {
			System.out.println(vehicleList1); }
	    if(vehicleList2.indexOf(year2) != -1) {
	    	System.out.println(vehicleList2); }
	    if(vehicleList3.indexOf(year2) != -1) {
	    	System.out.println(vehicleList3);
	    if(vehicleList4.indexOf(year2) != -1 ) {
	    	System.out.println(vehicleList4);
	    }
	    }
		}
	
	
	public static void displayData() {
		
		System.out.println("Here is a list of vehicles: ");
		System.out.println(vehicleList1);
		System.out.println(vehicleList2);
		System.out.println(vehicleList3);
		System.out.println(vehicleList4);
		System.out.println();
		System.out.println("These vehicles are 2019 models: ");
		System.out.println(vehicleList1);
		System.out.println(vehicleList4);
	}
	}

