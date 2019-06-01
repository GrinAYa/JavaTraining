package by.epam.javatraining.hrynhlaz.lesson05.task04.controller.manage;

import by.epam.javatraining.hrynhlaz.lesson05.task04.model.logic.CalendarLogic;
import by.epam.javatraining.hrynhlaz.lesson05.task04.view.ui.CalendarView;

public class Calendar {

	public static void main(String[] args) {
		int[] enteredDate = {31, 5, 2019};		
		int[] nextDate = CalendarLogic.returnNewDate(enteredDate);
		
		CalendarView.printDate("The next day is: " + nextDate[0]);
		CalendarView.printDate("." + nextDate[1]);
		CalendarView.printDate("." + nextDate[2]);
	}

}
