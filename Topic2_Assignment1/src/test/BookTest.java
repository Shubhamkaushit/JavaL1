package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Book;

class BookTest {

	@Test
	void test() {

		Book test = new Book();
		
		test.Book("String", "author", 350);
		double output = test.discountedprice(10);r
		assertEquals(315, output);
		
	}

}
