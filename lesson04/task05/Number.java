
public class Number {
	public static int takeDigit(int num, int pos) {
		return num % (int) Math.pow(10, pos) / (int) Math.pow(10, pos-1);
	}
	
	public static int rotate(int number) {
		int result = 0;
		result += takeDigit(number, 1) * Math.pow(10, 6);
		result += takeDigit(number, 2) * Math.pow(10, 5);
		result += takeDigit(number, 3) * Math.pow(10, 4);
		result += takeDigit(number, 4) * Math.pow(10, 3);
		result += takeDigit(number, 5) * Math.pow(10, 2);
		result += takeDigit(number, 6) * Math.pow(10, 1);
		result += takeDigit(number, 7) * Math.pow(10, 0);
		return result;
	}
}
