
public class Number {
	
	private static final double NUMLENGTH = 6.0;

	public static double calculateAverage(int number) {
		int sixthDigit  = number % 10;
		number /= 10;
		int fifthDigit  = number % 10;
		number /= 10;
		int fourthDigit = number % 10;
		number /= 10;
		int thirdDigit  = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		int firstDigit  = number % 10;

		return (firstDigit + secondDigit + thirdDigit + fourthDigit 
				+ fifthDigit + sixthDigit) / NUMLENGTH;
	}

	public static double calculateGeomAverage(int number) {
		int sixthDigit  = number % 10;
		number /= 10;
		int fifthDigit  = number % 10;
		number /= 10;
		int fourthDigit = number % 10;
		number /= 10;
		int thirdDigit  = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		int firstDigit  = number % 10;

		double mult = (firstDigit * secondDigit * thirdDigit * fourthDigit 
				* fifthDigit * sixthDigit);
		return Math.exp(Math.log(mult) / NUMLENGTH);
	}
}
