package Testcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.CalculatorAdd;

public class TestCalculatorAdd {
	CalculatorAdd c = new CalculatorAdd();

	@Test
	public void test() {
		assertEquals(5, c.add(2, 3));
	}

}
