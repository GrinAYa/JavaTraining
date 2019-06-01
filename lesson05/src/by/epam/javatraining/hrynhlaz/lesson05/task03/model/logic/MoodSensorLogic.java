package by.epam.javatraining.hrynhlaz.lesson05.task03.model.logic;

public class MoodSensorLogic {
	
	public static String getSimpleFace(int number) {
		String simpleFace;
		
		switch (number) {
			case 0:
				simpleFace = ":-)";
				break;
			case 1:
				simpleFace = ":-S";
				break;
			case 2:
				simpleFace = ":-{}";
				break;
			case 3:
				simpleFace = ":-O";
				break;
			case 4:
				simpleFace = ":-|";
				break;
			default:
				simpleFace = ":-(";
		}
		return simpleFace;
	}
}
