package main;

import java.util.Scanner;

public class FTrigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		Finder f = new Finder();
		
		int a[] = new int[20];
		
		System.out.println("Enter the no no elements");
		int n = s.nextInt();
		
		System.out.println("Enter the elements");
		for (int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		
		int res = f.Finder(a);
		
		System.out.println("Your Array");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+"\t");
		}
		
		System.out.println();
		
		System.out.println("Max = "+res);

	}

}
