package by.epam.javatraining.hrynhlaz.lesson05.task02.model.logic;

public class TaskLogic {
	public static boolean checkVowel(char symbol) {
		char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'o', 'u'};
		boolean result = false;
		
		for (char letter : vowels) {
			if (letter == symbol) {
				result = true;
				break;
			}
		}
		return result;
	}
}
