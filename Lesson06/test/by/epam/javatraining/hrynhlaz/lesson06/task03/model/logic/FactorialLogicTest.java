package by.epam.javatraining.hrynhlaz.lesson06.task03.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialLogicTest {

	@Test
	public void testGetFactorial() {
		int expected = 120;
		int number = 5;
		int actual = FactorialLogic.calculateFactorial(number);
		assertEquals(expected, actual);
		
		expected = 1;
		number = 0;
		actual = FactorialLogic.calculateFactorial(number);
		assertEquals(expected, actual);
		
		expected = 1;
		number = 1;
		actual = FactorialLogic.calculateFactorial(number);
		assertEquals(expected, actual);
		
		expected = -1;
		number = -561;
		actual = FactorialLogic.calculateFactorial(number);
		assertEquals(expected, actual);
	}

}
