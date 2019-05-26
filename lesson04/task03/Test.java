
public class Test {
	public static void main(String[] args) {
		int number = 1357;
		
		System.out.printf("Do digits of a number %d form an increasing sequence? ", number);
		System.out.println(Number.checkIncrSequence(number));
		
		number = 8531;
		System.out.printf("Do digits of a number %d form an decreasing sequence? ", number);
		System.out.println(Number.checkDescSequence(number));
	}
}
