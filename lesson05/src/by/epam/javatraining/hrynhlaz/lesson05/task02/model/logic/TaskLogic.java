package by.epam.javatraining.hrynhlaz.lesson05.task02.model.logic;

public class TaskLogic {
	
	public static boolean checkVowel(char symbol) {
		char[] vowels = {'a', 'e', 'o', 'u'};
		
		symbol = Character.toLowerCase(symbol);
		for (char letter : vowels) {
			if (letter == symbol) {
				return true;
			}
		}
		return false;
	}
}


