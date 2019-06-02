package by.epam.javatraining.hrynhlaz.lesson06.task02.controller.manage;

import by.epam.javatraining.hrynhlaz.lesson06.task02.model.logic.NumberLogic;
import by.epam.javatraining.hrynhlaz.lesson06.task02.view.ui.NumberView;

public class Number {

	public static void main(String[] args) {
		int number = 1234567;
		
		NumberView.printMessage("Check sequence next number: " + number);
		NumberView.printMessage(
				"Do digits of a number form an increasing sequence? "
				+ NumberLogic.checkIncrSequence(number));
		NumberView.printMessage(
				"Do digits of a number form an decreasing sequence? "
				+ NumberLogic.checkDescSequence(number));
	}

}
