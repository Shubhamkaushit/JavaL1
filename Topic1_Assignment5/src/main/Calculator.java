package main;

public class Calculator {
	
	int count = 0;
	
	public int Count(int n) {
		
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
	
	int sum=0;
	
	public int Operation(int n) {
		
		for(int i=0;i<count;i++) {
			int r = n%10;
			sum+= r;
			n=n/10;
		}
		
		return sum;
	}

}
