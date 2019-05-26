package main;

import java.util.Scanner;

public class MIWTrigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a month");
		
		int n = s.nextInt();
		MonthInWords miw = new MonthInWords(n);

	}

}
