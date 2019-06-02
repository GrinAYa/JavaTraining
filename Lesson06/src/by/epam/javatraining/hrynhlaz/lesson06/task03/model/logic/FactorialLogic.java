package by.epam.javatraining.hrynhlaz.lesson06.task03.model.logic;

public class FactorialLogic {
	
	public static int getFactorial(int number) {
		int result = 1;
		
		do {
			int digit = number % 10;
			number /= 10;
			result *= digit;
		} while (number > 0);
		
		return result;
	}

}
