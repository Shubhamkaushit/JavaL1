package main;

public class Factorial {

	int fact=1;
	public int Operation(int n)
	{
		if(n>0) {
			fact*=n;
			n-=1;
			
			Operation(n);
			
		}
		return fact;
	}
}
