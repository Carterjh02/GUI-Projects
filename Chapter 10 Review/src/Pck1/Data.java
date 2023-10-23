package Pck1;

import java.util.Arrays;
import java.util.Random;

public class Data {

	public int size;
	public int range;
	public int[] ary;
	
	public Data pNext;
	
	public Data(int size, int range) {
		this.size = size;
		this.range = range;
		pNext = null;
	}
		
	public void createArray() {
		ary = new int [size];
		storeRndNbr();
	}
	
	public void storeRndNbr() {
		Random rndGen = new Random(-1);
			for(int i = 0; i < ary.length; i++) {
				ary[i] = rndGen.nextInt(101);
			}
			
	}
	
	public void displayData() {
		String buffer = Arrays.toString(ary);
		System.out.println(buffer);
		
	}
}
