package by.epam.javatraining.hrynhlaz.lesson06.task01.model.logic;

import java.util.Random;

public class HeadsOrTailsLogic {

	final static Random random = new Random();
	private static final int HEAD = 1;

	public static int flipCoin() {
		
		return random.nextInt(2);
	}

	public static int[] calculate(int attempt) {
		int[] result = new int[2];

		for (int i = 0; i < attempt; i++) {
			if (flipCoin() == HEAD) {
				result[0]++;		// number of heads
			} else {
				result[1]++;		// number of tails
			}
		}
		return result;
	}
}
