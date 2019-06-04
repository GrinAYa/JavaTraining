package by.epam.javatraining.hrynhlaz.lesson05.task04.model.logic;

import static by.epam.javatraining.hrynhlaz.lesson05.task04.model.logic.CalendarDescription.*;

public class CalendarLogic {
	
	private static final int[] NUM_DAYS_IN_MONTH = {NUM_OF_DAYS_IN_JANUARY, 
			NUM_OF_DAYS_IN_FEBRUARY, NUM_OF_DAYS_IN_MARCH, NUM_OF_DAYS_IN_APRIL,
			NUM_OF_DAYS_IN_MAY, NUM_OF_DAYS_IN_JUNE, NUM_OF_DAYS_IN_JULY, 
			NUM_OF_DAYS_IN_AUGUST, NUM_OF_DAYS_IN_SEPTEMBER, 
			NUM_OF_DAYS_IN_OCTOBER, NUM_OF_DAYS_IN_NOVEMBER, 
			NUM_OF_DAYS_IN_DECEMBER};
	
	
	public static boolean checkLeapYear(int year) {
		boolean leapYear = false;
		if (year % 400 == 0) {
			leapYear = true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			leapYear = true;
		} else if (year % 100 == 0) {
			leapYear = false;
		} 
		return leapYear;
	}
	
	public static int returnLastDay(int month, int year) {
		boolean leapYear = checkLeapYear(year);	
		int lastDay = NUM_DAYS_IN_MONTH[month - 1];
		
		if (month == FEBRUARY && leapYear ) {
			lastDay = NUM_OF_DAYS_IN_FEBRUARY + 1;
		} 
		return lastDay;
	}
	
	public static int[] returnNewDate(int day, int month, int year) {
		final int FIRST_DAY_MONTH = 1; 
		int[] newDate = new int[3];
		
		if (day == returnLastDay(month, year)) {
			day = FIRST_DAY_MONTH;
			if (month == DECEMBER) {
				month = JANUARY;
				year++;
			} else {
				month++;
			}
		} else {
			day++;
		}
		
		newDate[0] = day;
		newDate[1] = month;
		newDate[2] = year;
		
		return newDate;
	}
}
