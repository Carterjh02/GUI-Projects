package Pck1;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		Data pData = new Data(); //make a new object with reference to data type data
		
		ArrayList<Data> list = new ArrayList(5); //array lists can grow dynamically as needed, so (5) is not important - can't be zero
		
		list.add(new Data());
		list.add(new Data());
		list.add(new Data());
		list.add(new Data());
		list.add(new Data());
		list.add(new Data());
		list.add(new Data());
		list.add(new Data()); // store reference directly in the list
		//list.add(pData); store the object in the list directly 
		
		Data pAccess = list.get(1);

	}

}
