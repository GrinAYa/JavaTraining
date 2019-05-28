
public class Number {
	
	public static boolean checkIncrSequence(int number) {
		int fourthDigit = number % 10;
		number /= 10;
		int thirdDigit  = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		int firstDigit  = number % 10;
		
		return firstDigit < secondDigit && secondDigit < thirdDigit  && thirdDigit < fourthDigit;
	}
	
	public static boolean checkDescSequence(int number) {
		int fourthDigit = number % 10;
		number /= 10;
		int thirdDigit  = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		int firstDigit  = number % 10;
		
		return firstDigit > secondDigit && secondDigit > thirdDigit  && thirdDigit > fourthDigit;
	}
}
