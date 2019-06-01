package by.epam.javatraining.hrynhlaz.lesson05.task03.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodSensorLogicTest {

	@Test
	public void testGetSimpleFace() {
		int faceNumber = 0;
		String expectedFace = ":-)";
		assertEquals(expectedFace, MoodSensorLogic.getSimpleFace(faceNumber));
	
		faceNumber = 1;
		expectedFace = ":-S";
		assertEquals(expectedFace, MoodSensorLogic.getSimpleFace(faceNumber));
		
		faceNumber = 2;
		expectedFace = ":-{}";
		assertEquals(expectedFace, MoodSensorLogic.getSimpleFace(faceNumber));
		
		faceNumber = 3;
		expectedFace = ":-O";
		assertEquals(expectedFace, MoodSensorLogic.getSimpleFace(faceNumber));
		
		faceNumber = 4;
		expectedFace = ":-|";
		assertEquals(expectedFace, MoodSensorLogic.getSimpleFace(faceNumber));
		
		faceNumber = 5;
		expectedFace = ":-(";
		assertEquals(expectedFace, MoodSensorLogic.getSimpleFace(faceNumber));
	}

}
