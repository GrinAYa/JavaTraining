
public class Number {	
	public static int takeDigit(int num, int pos) {
		num = num % (int) Math.pow(10, pos);
		return num / (int) Math.pow(10, pos-1);
	}
	
	public static boolean checkIncrSequence(int number) {
		int first   = takeDigit(number, 1);
		int second   = takeDigit(number, 2);
		int third = takeDigit(number, 3);
		int fourth  = takeDigit(number, 4);
		
		return (fourth < third) && (third < second)  && (second < first);
	}
	
	public static boolean checkDescSequence(int number) {
		int first   = takeDigit(number, 1);
		int second   = takeDigit(number, 2);
		int third = takeDigit(number, 3);
		int fourth  = takeDigit(number, 4);
		
		return (fourth > third) && (third > second)  && (second > first);
	}

}
