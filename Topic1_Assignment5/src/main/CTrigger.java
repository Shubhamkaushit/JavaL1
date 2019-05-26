package main;

import java.util.Scanner;

public class CTrigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner (System.in);
		
		System.out.println("Enter a number");
		
		Calculator c = new Calculator();
		
		int n= s.nextInt();
		
		c.Count(n);
		c.Operation(n);
		
		System.out.println("Sum of Digits = "+c.sum );

	}

}
