package by.epam.javatraining.hrynhlaz.lesson06.task01.model.logic;

import java.util.Random;

public class HeadsOrTailsLogic {

	private static final Random RANDOM = new Random();

	public static boolean flipCoin() {
		
		return RANDOM.nextBoolean();
	}

	public static int[] calculate(int attempt) {
		int numOfHeads = 0;
		int numOfTails = 0;
		int[] result = new int[2];
		
		for (int i = 0; i < attempt; i++) {
			if (flipCoin()) {
				numOfHeads++;		
			} else {
				numOfTails++;	
			}
		}
		result[0] = numOfHeads;
		result[1] = numOfTails;
		return result;
	}
}
