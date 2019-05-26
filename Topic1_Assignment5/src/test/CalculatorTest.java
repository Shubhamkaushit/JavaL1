package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test
	void test() {

		Calculator test = new Calculator();
		int output = test.Count(1234);
		assertEquals(4, output);
		
		int output1 = test.Operation(1234);
		assertEquals(10, output1);
	}

}
