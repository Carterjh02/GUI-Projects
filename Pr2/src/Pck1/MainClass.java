//Carter Howell
//COP2800 T/Th
//October 1st, 2023

package Pck1;

import java.util.ArrayList;
import java.util.List;

public class MainClass extends Vehicle{

	public MainClass(String make, String model, String year) {
		super(make, model, year);
	}

	public static void main(String[] args) {
		
		ArrayList<String> vehicleList = new ArrayList<>();
		
		vehicleList.add(array1);
		vehicleList.add(array2);
		vehicleList.add(array3);
		vehicleList.add(array4);
		
		System.out.println(vehicleList.toString());
		
		
		//vehicleList.add("Nissan", "Altima", 2019);
		//vehicleList.add("Hyundai", "Tuscon", 2023);
		//vehicleList.add("BMW", "X3", 2021);
		//vehicleList.add("BMW", "X1", 2019);
		
		//System.out.println(vehicleList.toString());
		
		
		
		
		
		
		//ArrayList<Vehicle> list = new ArrayList<Vehicle>(4);
		
		//ArrayList<Vehicle> p = list;
		
		//list.add(new Vehicle ("Nissan", "Altima", 2019));
		//list.add(new Vehicle ("Hyundai", "Tuscon", 2023));
		//list.add(new Vehicle ("BMW", "X3", 2021));
		//list.add(new Vehicle ("BMW", "X1", 2019));
		
		//p = list;
		
		//while (true) {
			//System.out.println(list);
			//Vehicle.displayData();
			
		//if (p.pNext == null) {
			//break;
		}
		
		//else {
			//p = p.pNext;
		//}
		//}
	}

//}
