package by.epam.javatraining.hrynhlaz.lesson05.task04.model.logic;

public class CalendarLogic {
	private static final int[] daysInMonth = 
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean checkLeapYear(int year) {
		boolean leapYear = false;
		if (year % 400 == 0) {
			leapYear = true;
		} else if (!(year % 4 == 0)) {
			leapYear = false;
		} else if (year % 100 == 0) {
			leapYear = false;
		} else {
			leapYear = true;
		}
		return leapYear;
	}
	
	public static int getLastDay(int month, int year) {
		boolean leapYear = checkLeapYear(year);	
		int lastDay = 0;
		
		if (month == 2 && leapYear ) {
			lastDay = 29;
		} else if (month == 2) {
			lastDay = 28;
		} else {
			lastDay = daysInMonth[month - 1];
			}
		return lastDay;
	}
	
	public static int[] returnNewDate(int[] date) {
		int[] newDate = new int[3];
		int day = date[0];
		int month = date[1];
		int year = date[2];
		
		if (day == getLastDay(month, year)) {
			day = 1;
			if (month == 12) {
				month = 1;
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
