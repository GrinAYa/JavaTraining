package by.epam.javatraining.hrynhlaz.lesson06.task03.model.logic;

public class FactorialLogic {
	
	public static int calculateFactorial(int number) {
		if (number < 0) {
			return -1;		//error message
		}
		
		int result = 1;
		for (int i = 1; i <= number; i++) {
			 result *= i;
		}
		return result;
	}

}
