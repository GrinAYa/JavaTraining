
public class Number {
	public static int takeDigit(int num, int pos) {
		num = num % (int) Math.pow(10, pos);
		return num / (int) Math.pow(10, pos-1);
	}
	
	public static double calculateAverage(int number) {
		double average = (takeDigit(number, 1) + takeDigit(number, 2) + takeDigit(number, 3) +
				takeDigit(number, 4) + takeDigit(number, 5) + takeDigit(number, 6)) / 6.0;
		return  average;
	}
	
	public static double calculateGeomAverage(int number) {
		double mult = takeDigit(number, 1) * takeDigit(number, 2) * takeDigit(number, 3) *
				takeDigit(number, 4) * takeDigit(number, 5) * takeDigit(number, 6);
		return Math.exp(Math.log(mult)/6);
	}
}
