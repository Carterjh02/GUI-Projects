package Pck1;

import java.util.Arrays;
import java.util.ArrayList;

public class Stats extends Data { //stats class can see Data but not vice versa

	
	int size;
	
	Data d;
	
	public Stats() {
		size = 15;
	}
	
	public void displayData() {
		System.out.println("Size = " + size);
		String buffer = Arrays.toString(ary);
		System.out.println(buffer);
	}
}
