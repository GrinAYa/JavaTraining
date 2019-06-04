package by.epam.javatraining.hrynhlaz.lesson06.task03.controller.manage;

import by.epam.javatraining.hrynhlaz.lesson06.task03.model.logic.FactorialLogic;
import by.epam.javatraining.hrynhlaz.lesson06.task03.view.ui.FactorialView;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		
		FactorialView.printMessage("Factorial next number: " + number);
		FactorialView.printMessage(" = " 
				+ FactorialLogic.calculateFactorial(number));

	}

}
