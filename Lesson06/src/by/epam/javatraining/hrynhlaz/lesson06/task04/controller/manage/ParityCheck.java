package by.epam.javatraining.hrynhlaz.lesson06.task04.controller.manage;

import by.epam.javatraining.hrynhlaz.lesson06.task04.model.logic.ParityCheckLogic;
import by.epam.javatraining.hrynhlaz.lesson06.task04.view.ui.ParityCheckView;

public class ParityCheck {

	public static void main(String[] args) {
		int number = 3579;
		
		ParityCheckView.printMessage("Check parity sequence for number " + number);
		ParityCheckView.printMessage(
				"Do digits of a number are all even? " 
				+ ParityCheckLogic.checkEvenSequence(number));
		ParityCheckView.printMessage(
				"Do digits of a number are all odd? " 
				+ ParityCheckLogic.checkOddSequence(number));
	}

}
