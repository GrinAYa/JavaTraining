
public class Geometry {
	public static double calculateCircleArea(double r) {
		return Math.PI * r * r;
	}
	
	public static double calculateRingArea(double r1, double r2) {
		double firstCircleArea  = calculateCircleArea(r1);
		double secondCircleArea = calculateCircleArea(r2);

		return firstCircleArea - secondCircleArea;
	}
}

