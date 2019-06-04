package by.epam.javatraining.hrynhlaz.lesson05.task03.controller.manage;


import by.epam.javatraining.hrynhlaz.lesson05.task03.model.logic.MoodSensorLogic;
import by.epam.javatraining.hrynhlaz.lesson05.task03.view.ui.MoodSensorView;

public class MoodSensorController {
	
	public static void main(String[] args) {
		MoodSensorView.printFace(MoodSensorLogic.returnSimpleFace());
	}
}
