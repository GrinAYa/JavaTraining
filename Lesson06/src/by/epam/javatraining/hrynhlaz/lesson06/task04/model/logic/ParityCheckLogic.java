package by.epam.javatraining.hrynhlaz.lesson06.task04.model.logic;

public class ParityCheckLogic {
	
	public static boolean checkEvenSequence(int number) {
		boolean result = true;
		
		while (result == true && number > 0) {
			int digit = number % 10;
			number /= 10;
			result = digit % 2 == 0;
		}		
		return result;
	}
	
	public static boolean checkOddSequence(int number) {
		boolean result = true;
		
		while (result == true && number > 0) {
			int digit = number % 10;
			number /= 10;
			result = digit % 2 != 0;
		}		
		return result;
	}

}
