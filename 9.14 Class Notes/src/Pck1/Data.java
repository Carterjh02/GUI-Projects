package Pck1;

import java.util.Random;
import java.util.Arrays;

public class Data {

	int[]ary;
	int size;
	
	
	public Data() {
	size = 15;
	ary = new int[size];
	}
	
	public void storeRndNbrs() { 
		
		Random rndGen = new Random(-1);
		for (int i = 0; i < ary.length; i++)
		ary[i] = rndGen.nextInt(101);
		
	}
	
	public void displayData() {
		String buf = (Arrays.toString(ary));
		System.out.println(buf);
		
	}
	
	
}
