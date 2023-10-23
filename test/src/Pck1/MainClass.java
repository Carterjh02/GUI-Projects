package Pck1;

import java.util.Scanner; 

import java.lang.Math;

public class MainClass { 

	public static void main(String[] args) {
		
		System.out.println("Type 1 if the missing variable is F, type 2 if the variable is Q or type 3 if the variable is R.");
		Scanner stringScanner = new Scanner(System.in);
			String U = stringScanner.next();
			
		boolean J = Boolean.parseBoolean(U);
		boolean A = (U.equals(1));
		boolean B = (U.equals(2));
		
		if (J = A) {
		
		
		System.out.println("What is the value of Q1?");
			Scanner intScanner = new Scanner(System.in);
			String C = intScanner.next();
		
		System.out.println("What is the value of Q2?");
			Scanner intScanner0 = new Scanner(System.in);
			String D = intScanner0.next();
			
		System.out.println("What is the value of R?");
			Scanner intScanner1 = new Scanner(System.in);
			String E = intScanner1.next();
			
			double F = Double.parseDouble(C);
			double G = Double.parseDouble(D);
			double H = Double.parseDouble(E);
			
			
			double I = 8.99e9;
			
			double value = Math.abs(F);
			double value1 = Math.abs(G);
			
			double L = I * (F * G) / (H * H);
			System.out.println("F = " + D);
			
	} else {
		
		if (J = B) {
			
		System.out.println("What is the value of F?");
		Scanner intScanner2 = new Scanner(System.in);
		String M = intScanner2.next();
	
	System.out.println("What is the value of Q1?");
		Scanner intScanner3 = new Scanner(System.in);
		String N = intScanner3.next();
		
	System.out.println("What is the value of R?");
		Scanner intScanner4 = new Scanner(System.in);
		String O = intScanner4.next();
		
		double P = Double.parseDouble(M);
		double Q = Double.parseDouble(N);
		double R = Double.parseDouble(O);
		
		double S = 8.99e9;
		
		double value2 = Math.abs(P);
		double value3 = Math.abs(Q);

		double H = S * (P * Q) / (Q * R);
		System.out.println("Q = " + H);	
		}
		
		
	}

} }
