
public class Comparator {
	
	// the first variant of the algorithm
	public static boolean checkThatDifferent1( double a, double b, double c) {
		return (a !=b) && (b !=c) && (a!=c);
	}
	
	// the second variant of the algorithm
	public static boolean checkThatDifferent2( double a, double b, double c) {
		return !((a == b) || (b == c) || (c == a));
	}
}
