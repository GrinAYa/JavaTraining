package by.epam.javatraining.hrynhlaz.maintask01.model.logic;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class SimpleVectorLogicTest {
	
	@Test
	public void testCreateVector() {
		byte[] actuals;
		actuals = SimpleVectorLogic.createVector(9);
		Random random = new Random(10);
		byte[] expecteds = new byte[9];
		random.nextBytes(expecteds);
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testUpdateVector() {
 		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		SimpleVectorLogic.updateVector(actuals);
		byte[] expecteds = new byte[9];
		random.nextBytes(expecteds);
		assertArrayEquals(expecteds, actuals);
	}
 
	@Test
	public void testRotateVector() {
		byte[] actuals = {1, 2, 3, 4, 5};
		byte[] expecteds = {5, 4, 3, 2, 1};
		SimpleVectorLogic.rotateVector(actuals);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testFindeMaxElement() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		byte expected = 122;
		int actual = SimpleVectorLogic.findeMaxElement(actuals);
		assertEquals(expected, actual);
	}

	@Test
	public void testFindeMinElement() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		byte expected = -70;
		int actual = SimpleVectorLogic.findeMinElement(actuals);
		assertEquals(expected, actual);
	}

	@Test
	public void testFindLocalMin() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		int expected = 3;
		int actual = SimpleVectorLogic.findLocalMin(actuals);
		assertEquals(expected, actual);
	}

	@Test
	public void testFindLocalMax() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		int expected = 1;
		int actual = SimpleVectorLogic.findLocalMax(actuals);
		assertEquals(expected, actual);
	}

	@Test
	public void testCheckIncrSequence() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		assertFalse(SimpleVectorLogic.checkIncrSequence(actuals));
		
		byte[] incrArray = {1, 2, 3, 4, 5};
		assertTrue(SimpleVectorLogic.checkIncrSequence(incrArray));
	}

	@Test
	public void testCheckDescSequence() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		assertFalse(SimpleVectorLogic.checkDescSequence(actuals));
		
		byte[] descArray = {5, 4, 3, 2, 1};
		assertTrue(SimpleVectorLogic.checkDescSequence(descArray));
	}

	@Test
	public void testFindAverage() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		double expected = 23.33;
		double delta = 0.004;
		double actual = SimpleVectorLogic.findAverage(actuals);
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testFindGeomAverage() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		double expected = 31.296;
		double delta = 0.0001;
		double actual = SimpleVectorLogic.findGeomAverage(actuals);
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testSeqSearch() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		int expected = 4;
		int actual = SimpleVectorLogic.seqSearch((byte) -8, actuals);
		assertEquals(expected, actual);
		
		expected = -1;
		actual = SimpleVectorLogic.seqSearch((byte) 23, actuals);
		assertEquals(expected, actual);
	}

	@Test
	public void testBinarySearch() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		int expected = 7;
		int actual = SimpleVectorLogic.seqSearch((byte) 114, actuals);
		assertEquals(expected, actual);
		
		expected = -1;
		actual = SimpleVectorLogic.seqSearch((byte) -4, actuals);
		assertEquals(expected, actual);
	}

	@Test
	public void testInsertSortByteArray() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		SimpleVectorLogic.insertSort(actuals);
		byte[] expecteds = {-70, -46, -8, -3, 21, 22, 58, 114, 122};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testInsertSortByteArrayString() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		SimpleVectorLogic.insertSort(actuals, "desc");
		byte[] expecteds = {122, 114, 58, 22, 21, -3, -8, -46, -70};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testInsertSortSimpleObjectList() {
		//fail("Not yet implemented");
	}

	@Test
	public void testInsertSortSimpleObjectListString() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSelectionSortByteArray() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		SimpleVectorLogic.selectionSort(actuals);
		byte[] expecteds = {-70, -46, -8, -3, 21, 22, 58, 114, 122};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testSelectionSortByteArrayString() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		SimpleVectorLogic.selectionSort(actuals, "desc");
		byte[] expecteds = {122, 114, 58, 22, 21, -3, -8, -46, -70};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testBubbleSortByteArray() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		SimpleVectorLogic.bubbleSort(actuals);
		byte[] expecteds = {-70, -46, -8, -3, 21, 22, 58, 114, 122};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testBubbleSortByteArrayString() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		SimpleVectorLogic.bubbleSort(actuals, "desc");
		byte[] expecteds = {122, 114, 58, 22, 21, -3, -8, -46, -70};
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testQuickSort() {
		Random random = new Random(10);
		byte[] actuals = new byte[9];
		random.nextBytes(actuals);
		SimpleVectorLogic.quickSort(0, actuals.length - 1, actuals);
		byte[] expecteds = {-70, -46, -8, -3, 21, 22, 58, 114, 122};
		assertArrayEquals(expecteds, actuals);
	}

}
