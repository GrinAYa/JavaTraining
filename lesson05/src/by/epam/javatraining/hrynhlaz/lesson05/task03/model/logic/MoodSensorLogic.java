package by.epam.javatraining.hrynhlaz.lesson05.task03.model.logic;

import java.util.Random;

public class MoodSensorLogic {
	private static final int MAXRANDOM = 5;
	private static final Random RANDOM = new Random();

	public static final String INDIFFERENCE = ":-|";
	public static final String SADNESS  = ":-(";
	public static final String GLADNESS = ":-)";
	public static final String SURPRISE = ":-O";
	public static final String LAUGH    = ":-D";

	public static String returnSimpleFace() {
		String simpleFace = INDIFFERENCE;

		switch (RANDOM.nextInt(MAXRANDOM)) {
		case 0:
			simpleFace = SADNESS;
			break;
		case 1:
			simpleFace = GLADNESS;
			break;
		case 2:
			simpleFace = SURPRISE;
			break;
		case 3:
			simpleFace = LAUGH;
		}
		return simpleFace;
	}
}
