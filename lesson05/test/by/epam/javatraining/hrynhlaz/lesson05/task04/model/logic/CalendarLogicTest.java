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
	public void testReturnLastDay() {
		int expected = 31;
		int actual = CalendarLogic.returnLastDay(8, 2019);
		assertEquals(expected, actual);
		
		expected = 28;
		actual = CalendarLogic.returnLastDay(2, 2019);
		assertEquals(expected, actual);
		
		expected = 29;
		actual = CalendarLogic.returnLastDay(2, 2016);
		assertEquals(expected, actual);
	}

	@Test
	public void testReturnNewDate() {
		int[] expecteds = {1,6,2019};
		int[] actuals = CalendarLogic.returnNewDate(31,5,2019);
		assertArrayEquals(expecteds, actuals);
		
		int[] expecteds2 = {29,2,2016};
		int[] actuals2 = CalendarLogic.returnNewDate(28,2,2016);
		assertArrayEquals(expecteds2, actuals2);
		
		int[] expecteds3 = {1,1,2019};
		int[] actuals3 = CalendarLogic.returnNewDate(31,12,2018);
		assertArrayEquals(expecteds3, actuals3);
	}

}
