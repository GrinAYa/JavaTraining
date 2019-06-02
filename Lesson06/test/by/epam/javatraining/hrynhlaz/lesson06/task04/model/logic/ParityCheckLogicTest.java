package by.epam.javatraining.hrynhlaz.lesson06.task04.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParityCheckLogicTest {

	@Test
	public void testCheckEvenSequence() {
		int number = 2468;
		assertTrue(ParityCheckLogic.checkEvenSequence(number));
		number = 2458;
		assertFalse(ParityCheckLogic.checkEvenSequence(number));
	}

	@Test
	public void testCheckOddSequence() {
		int number = 7593;
		assertTrue(ParityCheckLogic.checkOddSequence(number));
		number = 2458;
		assertFalse(ParityCheckLogic.checkOddSequence(number));
	}

}
