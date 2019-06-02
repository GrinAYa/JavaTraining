package by.epam.javatraining.hrynhlaz.lesson06.task02.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberLogicTest {

	@Test
	public void testCheckIncrSequence() {
		int number = 123456;
		assertTrue(NumberLogic.checkIncrSequence(number));
		number = 123056;
		assertFalse(NumberLogic.checkIncrSequence(number));
	}

	@Test
	public void testCheckDescSequence() {
		int number = 987654;
		assertTrue(NumberLogic.checkDescSequence(number));
		number = 55555;
		assertFalse(NumberLogic.checkDescSequence(number));
	}

}
