
public class Test {
	
	public static void main(String[] args) {
		int number = 123456;

		System.out.printf("Average of %d: %.3f", number, 
				Number.calculateAverage(number));
		System.out.printf("\nGeometric average of %d: %.3f", number, 
				Number.calculateGeomAverage(number));
	}
}
