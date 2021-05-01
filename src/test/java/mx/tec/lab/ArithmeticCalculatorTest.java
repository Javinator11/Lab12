package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticCalculatorTest {

	@Test
	void give_5And7_when_sum_then_12() {
		// Given 5 and 7
		int a = 5;
		int b = 7;
		int expectedResult = 12;
		
		// When operation is sum
		int actualResult = ArithmeticCalculator.sum(a, b);
		
		// Then result is 12
		assertEquals(expectedResult, actualResult);
	}

}
