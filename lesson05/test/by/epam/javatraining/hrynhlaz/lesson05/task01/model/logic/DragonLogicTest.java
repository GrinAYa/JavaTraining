package by.epam.javatraining.hrynhlaz.lesson05.task01.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class DragonLogicTest {

	@Test
	public void testGetHeadCount() {
		int year = 0;
		int expected = 3;
		assertEquals(expected, DragonLogic.getHeadCount(year));
		
		year = 1;
		expected = 6;
		assertEquals(expected, DragonLogic.getHeadCount(year));
		
		year = 200;
		expected = 603;
		assertEquals(expected, DragonLogic.getHeadCount(year));
		
		year = 300;
		expected = 803;
		assertEquals(expected, DragonLogic.getHeadCount(year));
		
		year = 350;
		expected = 853;
		assertEquals(expected, DragonLogic.getHeadCount(year));
	}

	@Test
	public void testGetEyeCount() {
		int year = 250;
		int expected = 1406;
		assertEquals(expected, DragonLogic.getEyeCount(year));
	}
	
	@Test (expected = Exception.class)
	public void testGetDragonAge() throws Exception {
		String age = "-154";
		
		DragonLogic.getDragonAge(age);
	}

}
