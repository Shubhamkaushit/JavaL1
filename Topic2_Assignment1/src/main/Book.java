package main;

public class Book {
	
	String title;
	String author;
	double price;
	double dp;
	double perc;
	
	public void Book(String title, String author, double price) {
		
		this.author=author;
		this.price=price;
		this.title=title;
	}
	
	public void displayDetails() {
		
		System.out.println("Title of the Book: "+title);
		System.out.println("Author of the Book: "+author);
		System.out.println("Price of the Book: "+price);
		System.out.println("Discount on the Book: "+perc+"%");
		discountedprice(perc);
		System.out.println("Discounted Price of the Book: "+dp);
		
	}
	
	public double discountedprice(double perc) {
		
		this.perc = perc;
		
		dp = price-((price/100)*perc);
		
		return dp;
	}
	
}
