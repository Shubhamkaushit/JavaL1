package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Factorial;

class FactorialTest {

	@Test
	void test() {
		Factorial test = new Factorial();
		int output= test.Operation(5);
		assertEquals(120,output);
	}

}
