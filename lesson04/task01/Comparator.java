
public class Comparator {
	
	public static boolean checkThatDifferent( double a, double b, double c) {
		return a != b && b != c && a != c;
	}

	public static boolean checkThatSame( double a, double b, double c) {
		return a == b && b == c;
	}
}
