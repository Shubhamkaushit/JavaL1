package main;

public class Finder {
	
	public int Finder(int a[]) {
		
		int max = 0;
		
		
		
		for(int i=0;i<a.length-1;i++) {
				if(max<a[i]) {
					max=a[i];
					
				
				}
				
		}
		return max;
		
	}

}
