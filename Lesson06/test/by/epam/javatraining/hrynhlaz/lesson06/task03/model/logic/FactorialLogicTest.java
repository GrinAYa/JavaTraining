package by.epam.javatraining.hrynhlaz.lesson06.task03.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialLogicTest {

	@Test
	public void testGetFactorial() {
		int expected = 4;
		int number = 22;
		int actual = FactorialLogic.getFactorial(number);
		assertEquals(expected, actual);
	}

}
