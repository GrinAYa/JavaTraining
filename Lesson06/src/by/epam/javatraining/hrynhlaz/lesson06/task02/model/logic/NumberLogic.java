package by.epam.javatraining.hrynhlaz.lesson06.task02.model.logic;

public class NumberLogic {

	public static boolean checkIncrSequence(int number) {
		boolean result = false;
		int previousDigit = 10;
		
		do {
			int digit = number % 10;
			number /= 10;
			result = digit < previousDigit;
			previousDigit = digit;
		} while (result == true && number > 0);
		
		return result;
	}

	public static boolean checkDescSequence(int number) {
		boolean result = false;
		int previousDigit = 0;
		
		do {
			int digit = number % 10;
			number /= 10;
			result = digit > previousDigit;
			previousDigit = digit;
		} while (result == true && number > 0);
		
		return result;	
	}

}
