package by.epam.javatraining.hrynhlaz.lesson05.task03.controller.manage;

import java.util.Random;

import by.epam.javatraining.hrynhlaz.lesson05.task03.model.logic.MoodSensorLogic;
import by.epam.javatraining.hrynhlaz.lesson05.task03.view.ui.MoodSensorView;

public class MoodSensorController {
	private static final int MAXRANDOM = 5;
	
	public static void main(String[] args) {
		final Random random = new Random();

		MoodSensorView.printFace(MoodSensorLogic.getSimpleFace(
				random.nextInt(MAXRANDOM)));
	}

}
