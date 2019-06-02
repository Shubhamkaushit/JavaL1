package main;

import java.util.Scanner;

public class BookTrigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Book b = new Book();
		b.Book("Harry Potter", "J.K.Rowling", 350.00);
		b.discountedprice(10);
		b.displayDetails();
	}

}
