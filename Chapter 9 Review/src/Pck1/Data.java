package Pck1;

import java.util.Arrays;
import java.util.Random;

public class Data {

	int[]ary;
	int max;
	
	public Data() {
		
	}
	
	public void createArray(int size, int nbr) {
		ary = new int[size];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = nbr;
		}
		findMax();
	}
	
	public void storeRndNbr() {
		Random rndGen = new Random(-1);
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rndGen.nextInt(101);
		}
		findMax();
	}
	
	public int findMax() {
		int max = ary[0];
		for (int i = 0; i < ary.length; i++){
			if(ary[i] > max) {
				max = ary[i];
			}
		}
		return max;
	}
	
	public void displayData() {
		String buf = Arrays.toString(ary);
		System.out.println(buf);
		System.out.println("Max = " + max);
	}
	
}
