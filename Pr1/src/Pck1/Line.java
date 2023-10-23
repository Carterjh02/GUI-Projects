package Pck1;

import java.util.Arrays;
import java.util.Random;

public class Line {

	int[]ary;
	int length;
	int x;
	int y;
	
	public void line() {
		
	}
	
	public void createArray(int size, int nbr) {
	
	ary = new int[size];
	for (int i = 0; i < ary.length; i++) {
		ary[i] = nbr; }
	}
	public void storeRndNbr() {
		Random RndGen = new Random(2);
		
	for (int i = 0; i < ary.length; i++) {
		ary[i] = RndGen.nextInt(20); }
		}
	
	public int findLength() {
		
		int length = 0;
		
		if (ary.length == 0) {
			return -1;
		}
		int diff = 0;
		for (int i = 0; i < ary.length; i++) {
			
			diff = Math.abs(ary[i] - ary[i+1]);
			if (length < diff);
			length = diff;
			
		}
	return findLength();
	
	}

	public void displayData() {
	
	String buf = Arrays.toString(ary);
	
	System.out.println("The coordinates are " + buf);
	System.out.println("The length of the line is " + length);
	}
	
	}

