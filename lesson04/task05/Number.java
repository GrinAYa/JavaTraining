
public class Number {
	
	public static int rotate(int number) {
		int result = 0;
		int digit = 0;

		digit = number % 10;
		result = (result + digit) * 10;
		number /= 10;
		digit = number % 10;
		result = (result + digit) * 10;
		number /= 10;
		digit = number % 10;
		result = (result + digit) * 10;
		number /= 10;
		digit = number % 10;
		result = (result + digit) * 10;
		number /= 10;
		digit = number % 10;
		result = (result + digit) * 10;
		number /= 10;
		digit = number % 10;
		result = (result + digit) * 10;
		number /= 10;
		digit = number % 10;
		result += digit;

		return result;
	}
}
