
public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		double a = 5;
		double b = 7;
		double c = 9.7;	
		test.compareNumbers(a, b, c);
		
		a = 5; 
		b = 5; 
		c = 9.7;
		test.compareNumbers(a, b, c);
		
		a = 5; 
		b = 7; 
		c = 7;
		test.compareNumbers(a, b, c);
		
		a = 9.7; 
		b = 7; 
		c = 9.7;
		test.compareNumbers(a, b, c);	
	}
	
	private void compareNumbers(double a, double b, double c) {
		System.out.print("The first algorithm");
		System.out.printf("\nAre numbers %.3f, %.3f and %.3f different? %b", a, b, c, 
				Comparator.checkThatDifferent1(a, b, c));
		System.out.print("\nThe second algorithm");
		System.out.printf("\nAre numbers %.3f, %.3f and %.3f different? %b", a, b, c, 
				Comparator.checkThatDifferent2(a, b, c));
		System.out.println("\n-----------------------");
	}
}
