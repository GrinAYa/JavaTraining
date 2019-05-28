
public class Test {
	
	public static void main(String[] args) {
		Test test = new Test();
		double a = 5;
		double b = 7;
		double c = 9.7;	
		test.compareNumbers(a, b, c);
		
		a = 9.7; 
		b = 9.7; 
		c = 9.7;
		test.compareNumbers(a, b, c);	
	}
	
	private void compareNumbers(double a, double b, double c) {
		System.out.print("Check that the three numbers are different:");
		System.out.printf("\nAre numbers %.3f, %.3f and %.3f different? %b", a, b, c, 
				Comparator.checkThatDifferent(a, b, c));
		System.out.print("\nCheck that the three numbers are the same:");
		System.out.printf("\nAre numbers %.3f, %.3f and %.3f the same? %b", a, b, c, 
				Comparator.checkThatSame(a, b, c));
		System.out.println("\n-----------------------------------------------------");
	}
}
