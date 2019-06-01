package by.epam.javatraining.hrynhlaz.lesson05.task01.controller.manage;

import java.io.*;
import by.epam.javatraining.hrynhlaz.lesson05.task01.model.logic.DragonLogic;
import by.epam.javatraining.hrynhlaz.lesson05.task01.view.ui.DragonView;

public class DragonController {
	
	public static void main(String[] args) {
		int dragonAge = 0;
		try {
		dragonAge = DragonLogic.getDragonAge(
				getUserInput("Please enter dragon age: "));
		DragonView.printMessage("The dragon has "
				+ DragonLogic.getHeadCount(dragonAge) 
				+ " heads");
		DragonView.printMessage("and the dragon has "
				+ DragonLogic.getEyeCount(dragonAge) 
				+ " eyes");
		} catch (Exception e){
			DragonView.printMessage("Incorrectly entered dragon age! " + e);
		} 	
	}
	
	public static String getUserInput(String prompt) {
		String inputLine = null;
		
		DragonView.printMessage(prompt);
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) {
				return null;
			}
		} catch (IOException e) {
			DragonView.printMessage("IOException: " + e);
		}
		return inputLine;
	}
}
