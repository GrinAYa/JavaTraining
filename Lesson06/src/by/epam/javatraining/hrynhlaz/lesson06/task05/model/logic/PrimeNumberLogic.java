package by.epam.javatraining.hrynhlaz.lesson06.task05.model.logic;

public class PrimeNumberLogic {
	
	public static boolean checkPrime(int number) {
		boolean result = true;
		
		for (int i = 2; result == true && i <= Math.round(Math.sqrt(number)); i++) {
			result = number % i != 0;
		}
		
		return result;
	}
}
