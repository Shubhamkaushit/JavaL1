package main;

import java.util.Scanner;

public class FactTrigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial f = new Factorial();
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number for Factorial");
		int n = s.nextInt();
		int factorial= f.Operation(n);
		System.out.println("Factorial of the number is:"+factorial);

	}

}
