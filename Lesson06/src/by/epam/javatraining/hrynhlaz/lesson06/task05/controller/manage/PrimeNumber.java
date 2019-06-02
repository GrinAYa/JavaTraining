package by.epam.javatraining.hrynhlaz.lesson06.task05.controller.manage;

import by.epam.javatraining.hrynhlaz.lesson06.task05.model.logic.PrimeNumberLogic;
import by.epam.javatraining.hrynhlaz.lesson06.task05.view.ui.PrimaNumberView;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 19;

		PrimaNumberView.printMessage("Is " + number + " a prime number?");
		PrimaNumberView.printMessage("" + PrimeNumberLogic.checkPrime(number));
	}

}
