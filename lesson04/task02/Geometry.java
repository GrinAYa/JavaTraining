
public class Geometry {
	public static double calculateCircleArea(double r) {
		return Math.PI * Math.pow(r, 2);
	}
	
	public static double calculateRingArea(double r1, double r2) {
		double firstCircleArea;
		double secondCircleArea;
		
		firstCircleArea  = calculateCircleArea(r1);
		secondCircleArea = calculateCircleArea(r2);
		
		return firstCircleArea - secondCircleArea;
	}
}

