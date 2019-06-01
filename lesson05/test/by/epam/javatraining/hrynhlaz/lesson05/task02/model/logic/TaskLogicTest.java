package by.epam.javatraining.hrynhlaz.lesson05.task02.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskLogicTest {

	@Test
	public void testCheckVowel() {
		boolean condition = TaskLogic.checkVowel('U');
		assertTrue(condition);
		
		condition = TaskLogic.checkVowel('t');
		assertFalse(condition);
	}

}
