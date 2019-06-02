package by.epam.javatraining.hrynhlaz.lesson06.task05.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberLogicTest {

	@Test
	public void testCheckPrime() {
		int number = 13;
		assertTrue(PrimeNumberLogic.checkPrime(number));
		number = 17;
		assertTrue(PrimeNumberLogic.checkPrime(number));
		number = 148;
		assertFalse(PrimeNumberLogic.checkPrime(number));
	}

}
