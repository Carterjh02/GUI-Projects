package Pck1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Type A if the missing variable is F, type B if the missing variable is Q)");
		Scanner intScanner = new Scanner(System.in);
		String num = intScanner.next();
		boolean A1 = parseBoolean(num);
		
		if(A1 = A);
		System.out.println("What is the value of Q1?");
		Scanner intScanner0 = new Scanner(System.in);
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

	private static boolean parseBoolean(String num) {
		// TODO Auto-generated method stub
		return false;
	}

}
