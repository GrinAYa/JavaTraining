package by.epam.javatraining.hrynhlaz.lesson05.task04.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalendarLogicTest {

	@Test
	public void testCheckLeapYear() {
		assertTrue(CalendarLogic.checkLeapYear(2000));
		assertTrue(CalendarLogic.checkLeapYear(2016));
		assertFalse(CalendarLogic.checkLeapYear(1800));
		assertFalse(CalendarLogic.checkLeapYear(2019));
	}

	@Test
	public void testGetLastDay() {
		int expected = 31;
		int actual = CalendarLogic.getLastDay(8, 2019);
		assertEquals(expected, actual);
		
		expected = 28;
		actual = CalendarLogic.getLastDay(2, 2019);
		assertEquals(expected, actual);
		
		expected = 29;
		actual = CalendarLogic.getLastDay(2, 2016);
		assertEquals(expected, actual);
	}

	@Test
	public void testReturnNewDate() {
		int[] expecteds = {1,6,2019};
		int[] testDate = {31, 5, 2019};
		int[] actuals = CalendarLogic.returnNewDate(testDate);
		assertArrayEquals(expecteds, actuals);
		
		int[] expecteds2 = {29,2,2016};
		int[] testDate2 = {28, 2, 2016};
		int[] actuals2 = CalendarLogic.returnNewDate(testDate2);
		assertArrayEquals(expecteds2, actuals2);
		
		int[] expecteds3 = {1,1,2019};
		int[] testDate3 = {31, 12, 2018};
		int[] actuals3 = CalendarLogic.returnNewDate(testDate3);
		assertArrayEquals(expecteds3, actuals3);
	}

}
