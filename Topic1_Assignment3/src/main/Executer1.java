package main;

import java.util.Scanner;

public class Executer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the Minutes");
		double x= s.nextDouble();
		MinsToDays mtd = new MinsToDays();
		MinsToYears mty = new MinsToYears();
		double d= mtd.MinsToDays(x);
		double y = mty.MinsToYears(x);
		System.out.println("Days = "+d);
		System.out.println("Years = "+y);
	}

}
