
public class Test {
	
	public static void main(String[] args) {
		int number = 1234;
		
		System.out.printf("Do digits of a number %d form an increasing sequence? ", number);
		System.out.println(Number.checkIncrSequence(number));
		
		number = 4321;
		System.out.printf("Do digits of a number %d form an decreasing sequence? ", number);
		System.out.println(Number.checkDescSequence(number));
	}
}
