package by.epam.javatraining.hrynhlaz.lesson05.task02.controller.manage;

import java.io.*;
import by.epam.javatraining.hrynhlaz.lesson05.task02.model.logic.TaskLogic;
import by.epam.javatraining.hrynhlaz.lesson05.task02.view.ui.TaskView;

public class TaskController {
	
	public static void main(String[] args) {
		String userInput = getUserInput("Enter vowel, please: ");
		
		if(userInput == null || userInput.length() > 1) {
			TaskView.printMessage("You entered incorrect data!!!");
			return;
		}
		
		boolean chack = TaskLogic.checkVowel(userInput.charAt(0));
		if (chack) {
			TaskView.printMessage("It is vîwel!!!");
		} else {
			TaskView.printMessage("It is not vîwel!!!");
		}
	}
		
	
	public static String getUserInput(String prompt) {
		String inputLine = null;
		
		TaskView.printMessage(prompt);
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) {
				return null;
			}
		} catch (IOException e) {
			TaskView.printMessage("IOException: " + e);
		}
		return inputLine;
	}
}
