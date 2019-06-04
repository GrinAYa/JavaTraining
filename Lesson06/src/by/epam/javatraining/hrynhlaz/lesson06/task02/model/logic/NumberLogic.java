package by.epam.javatraining.hrynhlaz.lesson06.task02.model.logic;

public class NumberLogic {

	public static boolean checkIncrSequence(int number) {
		boolean result = true;
		int previousDigit = 10;
		
		while (result == true && number > 0) {
			int digit = number % 10;
			number /= 10;
			result = digit < previousDigit;
			previousDigit = digit;
		}	
		return result;
	}

	public static boolean checkDescSequence(int number) {
		boolean result = true;
		int previousDigit = 0;
		
		while (result == true && number > 0) {
			int digit = number % 10;
			number /= 10;
			result = digit > previousDigit;
			previousDigit = digit;
		}	
		return result;	
	}

}
