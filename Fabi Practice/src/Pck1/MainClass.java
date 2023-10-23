package Pck1;

import java.util.Scanner;  
	
import java.lang.Math; 

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("What is the value of Q1?");
		Scanner intScanner = new Scanner(System.in);
			String Q = intScanner.next();
		System.out.println("What is the value of Q2?");
		Scanner intScanner1 = new Scanner(System.in);
			String W = intScanner1.next();
		System.out.println("What is the value of R?");
		Scanner intScanner2 = new Scanner(System.in);
			String R = intScanner.next();
		
		double A = Double.parseDouble(Q);
		double B = Double.parseDouble(W);
		double C = Double.parseDouble(R);
		
		
		double K = 8.99e9;
		
		double value = Math.abs(A);
		double value1 = Math.abs(B);
		
		double F = K * (A * B) / (C * C);
		System.out.println("F = " + F);
		
		
				
				
		
		
		
		
		
		
	}

}
