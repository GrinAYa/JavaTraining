package by.epam.javatraining.hrynhlaz.lesson06.task01.controller.manage;

import by.epam.javatraining.hrynhlaz.lesson06.task01.model.logic.HeadsOrTailsLogic;
import by.epam.javatraining.hrynhlaz.lesson06.task01.view.ui.HeadsOrTailsView;

public class HeadsOrTails {

	public static void main(String[] args) {
		int numAttempts = 1000;
		int[] result = new int[2];
		
		result = HeadsOrTailsLogic.calculate(numAttempts);
		
		HeadsOrTailsView.printMessage("Coin flip " + numAttempts + " times");
		HeadsOrTailsView.printMessage("The head dropped " + result[0] + " times");
		HeadsOrTailsView.printMessage("The tail dropped " + result[1] + " times");
	}

}
