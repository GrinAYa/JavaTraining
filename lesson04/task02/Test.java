
public class Test {
	public static void main(String[] args) {
		double r1 = 4;
		double r2 = 2;
		
		System.out.printf("The ring area with r1= %.2f and r2= %.2f is %.2f", r1, r2,
				Geometry.calculateRingArea(r1, r2));
	}
}
