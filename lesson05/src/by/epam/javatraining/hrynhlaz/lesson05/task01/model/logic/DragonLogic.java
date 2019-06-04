package by.epam.javatraining.hrynhlaz.lesson05.task01.model.logic;

public class DragonLogic {	
	private static final int NUMHEADATBIRTH = 3;
	private static final int NUMEYEATHEAD = 2;
	private static final int NUMHEADATYANG = 3;
	private static final int NUMHEADATMIDDLE = 2;
	private static final int NUMHEADATOLD = 1;
	private static final int MIDDLEAGE = 200;
	private static final int OLDAGE = 300;
	
	public static int getHeadCount(int age) {
		int headCount = NUMHEADATBIRTH;
		if (age <= MIDDLEAGE) {
			headCount += age * NUMHEADATYANG;
		} else if (age <= OLDAGE) {
			headCount += MIDDLEAGE * NUMHEADATYANG 
					- MIDDLEAGE * NUMHEADATMIDDLE
					+ NUMHEADATMIDDLE * age;
		} else {
			headCount += MIDDLEAGE * NUMHEADATYANG
					+ (OLDAGE - MIDDLEAGE) * NUMHEADATMIDDLE
					- OLDAGE * NUMHEADATOLD
					+ NUMHEADATOLD * age;
		}
		return headCount;
	}
	
	public static int getEyeCount(int age) {	
		return getHeadCount(age) * NUMEYEATHEAD;
	}
	
	public static int getDragonAge(String stringInput) throws Exception {
		int age = Integer.parseInt(stringInput);

		if (age < 0) {	
			throw new Exception();
		}
		return age;
	}	

}
