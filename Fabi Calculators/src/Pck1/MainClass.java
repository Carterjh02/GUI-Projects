package Pck1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	
		System.out.println("Type 1 if the missing variable is F, type 2 if the variable is Q or type 3 if the variable is R.");
		Scanner stringScanner = new Scanner(System.in);
			String U = stringScanner.next();
			
		boolean J = Boolean.parseBoolean(U);
		boolean F = (U.equals(1));
		boolean Z = (U.equals(2));
		boolean Y = (U.equals(3));
		
		if (J = F) {
		
		
		System.out.println("What is the value of Q1?");
			Scanner intScanner = new Scanner(System.in);
			String Q = intScanner.next();
		
		System.out.println("What is the value of Q2?");
			Scanner intScanner0 = new Scanner(System.in);
			String P = intScanner0.next();
			
		System.out.println("What is the value of R?");
			Scanner intScanner1 = new Scanner(System.in);
			String R = intScanner1.next();
			
			double A = Double.parseDouble(Q);
			double B = Double.parseDouble(P);
			double C = Double.parseDouble(R);
			
			
			double K = 8.99e9;
			
			double value = Math.abs(A);
			double value1 = Math.abs(B);
			
			double D = K * (A * B) / (C * C);
			System.out.println("F = " + D);
			
	} else {
		
		if (J = Z) {
			
		System.out.println("What is the value of F?");
		Scanner intScanner2 = new Scanner(System.in);
		String R = intScanner2.next();
	
	System.out.println("What is the value of Q1?");
		Scanner intScanner3 = new Scanner(System.in);
		String T = intScanner3.next();
		
	System.out.println("What is the value of R?");
		Scanner intScanner4 = new Scanner(System.in);
		String P = intScanner4.next();
		
		double E = Double.parseDouble(R);
		double I = Double.parseDouble(T);
		double G = Double.parseDouble(P);
		
		double K = 8.99e9;
		
		double value2 = Math.abs(E);
		double value3 = Math.abs(I);

		double H = E * (G * G) / (K * I);
		System.out.println("Q = " + H);	
			
	} else {
			if (J = Y) {
				System.out.println("What is the value of Q1?");
				Scanner intScanner5 = new Scanner(System.in);
				String W = intScanner5.next();
				
			System.out.println("What is the value of Q2?");
				Scanner intScanner6 = new Scanner(System.in);
				String V = intScanner6.next();
				
			System.out.println("What is the value of F?");
				Scanner intScanner7 = new Scanner(System.in);
				String S = intScanner7.next();
				
				double M = Double.parseDouble(W);
				double N = Double.parseDouble(V);
				double O = Double.parseDouble(S);
				
				double K = 8.99e9;
				
				double value4 = Math.abs(M);
				double value5 = Math.abs(N);
				
				double L = K * (M * N) / O;
				double X = java.lang.Math.sqrt(L);
				System.out.println("R = " + X);
			}
		}
			
	}

}
}
