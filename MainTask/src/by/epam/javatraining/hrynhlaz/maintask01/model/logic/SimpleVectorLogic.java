
package by.epam.javatraining.hrynhlaz.maintask01.model.logic;

import java.util.Random;

/**
 * Class contains methods for working with byte arrays and dynamic
 * containers of SimpleObjectList type  
 * 
 * @version		1.01 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public class SimpleVectorLogic {
	private static final Random RANDOM = new Random(10);
	
	/**
	 * creates a byte vector of size length and fills it with
	 * random numbers.
	 * @param	length sets the size of the vector
	 * @return	byte vector of size length
	 */
	public static byte[] createVector(int length) {
		byte[] vector = new byte[length];
		RANDOM.nextBytes(vector);
		return vector;
	}
	
	/**
	 * updates the vector with new random numbers.
	 * @param vector	byte array
	 */
	public static void updateVector(byte[] vector) {
		RANDOM.nextBytes(vector);
	}
	
	/**
	 * reverses all elements of the vector
	 * @param vector	byte array
	 */
	public static void rotateVector(byte[] vector) {
		for (int i = 0; i < vector.length / 2; i ++) {
			byte b = vector[i];
			vector[i] = vector[vector.length - 1 -i];
			vector[vector.length - 1 - i] = b;
		}	
	}
	
	/**
	 * find the maximum element of the vector
	 * @param vector	byte array
	 * @return	the maximum element of the vector
	 */
	public static int findeMaxElement(byte[] vector) {
		int maxElement = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] > maxElement) {
				maxElement = vector[i];
			} 
		}
		return maxElement;
	}

	/**
	 * find the minimal element of the vector
	 * @param vector	byte array
	 * @return	the minimal element of the vector
	 */
	public static int findeMinElement(byte[] vector) {
		int minElement = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] < minElement) {
				minElement = vector[i];
			} 
		}
		return minElement;
	}
	
	/**
	 * determines the position of the local minimum in the vector
	 * @param vector	byte array
	 * @return	the position of the local minimum in the vector,
	 * 			if there is no local minimum it returns -1
	 */
	public static int findLocalMin(byte[] vector) {
		for(int i = 1; i < vector.length - 1; i++) {
			if (vector[i] < vector[i-1] && vector[i] < vector[i + 1]) {
				return i;				
			}
		}
		return -1;
	}
	
	/**
	 * determines the position of the local maximum in the vector
	 * @param vector	byte array
	 * @return	the position of the local maximum in the vector,
	 * 			if there is no local maximum it returns -1
	 */
	public static int findLocalMax(byte[] vector) {
		for(int i = 1; i < vector.length - 1; i++) {
			if (vector[i] > vector[i-1] && vector[i] > vector[i + 1]) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * checks whether vector elements are sorted in ascending order 
	 * @param vector	byte array
	 */
	public static boolean checkIncrSequence(byte[] vector) {
		for (int i = 1; i < vector.length; i++) {
			if (vector[i-1] > vector[i]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * checks whether vector elements are sorted in descending order 
	 * @param vector	byte array
	 */
	public static boolean checkDescSequence(byte[] vector) {
		for (int i = 1; i < vector.length; i++) {
			if (vector[i-1] < vector[i]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * find the arithmetic mean of all elements of the vector
	 * @param vector	byte array
	 * @return	the arithmetic mean of the double type
	 */
	public static double findAverage(byte[] vector) {
		int sum = 0;
		for (int i = 0; i < vector.length; i++) {
			sum += vector[i];
		}
		return sum / (double) vector.length;
	}
	
	/**
	 * find the geometric mean of all elements of the vector
	 * @param vector	byte array
	 * @return	the geometric mean of the double type
	 */
	public static double findGeomAverage(byte[] vector) {
		double mult = 1;
		for (int i = 0; i < vector.length; i++) {
			mult *= vector[i];
		}
		return Math.exp(Math.log(mult) / vector.length);
	}
	
	/**
	 * finds the position of the element key in the vector 
	 * using the sequential search algorithm
	 * @param key	required element of type byte 
	 * @param vector	byte array
	 * @return	the position of the element key in the vector,
	 * 			if there is no such element in the vector returns -1
	 */
	public static int seqSearch(byte key, byte[] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (key == vector[i]) {
				return i;
			}
		}
		return -1;	
	}
	
	/**
	 * finds the position of the element key in the vector 
	 * using the binary search algorithm
	 * @param key	required element of type byte 
	 * @param vector	byte array
	 * @return	the position of the element key in the vector,
	 * 			if there is no such element in the vector returns -1
	 */
	public static int binarySearch(byte key, byte[] vector) {
		if (!checkDescSequence(vector) && !checkIncrSequence(vector)) {
			return -1;
		}
		int low = 0;
		int high = vector.length;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			if(key < vector[mid]) {
				high = mid - 1;
			} else if(key > vector[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
			return -1;		
	}
	
	/**
	 * sorts a byte vector using a insertion sort algorithm
	 * @param vector	byte vector
	 */
	public static void insertSort(byte[] vector) {
		for (int i = 1; i < vector.length; i++) {
			int j = i - 1;
			byte temp = vector[i];
			while (j >= 0 && temp < vector[j]) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = temp;
		}
	}
	
	/**
	 * sorts a byte vector using a insertion sort algorithm
	 * @param vector	byte vector
	 * @param desc	arbitrary string as "desc" indicates sorting in 
	 * 				descending order
	 */
	public static void insertSort(byte[] vector, String desc) {
		for (int i = 1; i < vector.length; i++) {
			int j = i - 1;
			byte temp = vector[i];
			while (j >= 0 && temp > vector[j]) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = temp;
		}
	}
	
	/**
	 * sorts a dynamic list of  of byte numbers using a insertion sort algorithm
	 * @param list	dynamic list of SimpleObjectList type
	 */
	public static void insertSort(SimpleObjectList list) {
		for (int i = 1; i < list.length(); i++) {
			int j = i - 1;
			byte temp = Byte.decode(list.get(i).toString());
			while (j >= 0 && temp < Byte.decode(list.get(j).toString())) {
				list.addItem(Byte.decode(list.get(j).toString()), j + 1);
				j--;
			}
			list.addItem(temp, j + 1);
		}
	}
	
	/**
	 * sorts a dynamic list of  of byte numbers using a insertion sort algorithm
	 * @param list	dynamic list of SimpleObjectList type
	 * @param desc	arbitrary string as "desc" indicates sorting in 
	 * 				descending order
	 */
	public static void insertSort(SimpleObjectList list, String desc) {
		for (int i = 1; i < list.length(); i++) {
			int j = i - 1;
			byte temp = Byte.decode(list.get(i).toString());
			while (j >= 0 && temp > Byte.decode(list.get(j).toString())) {
				list.addItem(Byte.decode(list.get(j).toString()), j + 1);
				j--;
			}
			list.addItem(temp, j + 1);
		}
	}
	
	/**
	 * sorts a byte vector using a selection sort algorithm
	 * @param vector	byte vector
	 */
	public static void selectionSort(byte[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			byte bestValue = vector[i];
			int bestInd = i;
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] < bestValue) {
					bestValue = vector[j];
					bestInd = j;
				}
			}
			vector[bestInd] = vector[i];
			vector[i] = bestValue;
		}
	}
	
	/**
	 * sorts a byte vector using a selection sort algorithm
	 * @param vector	byte vector
	 * @param desc	arbitrary string as desc indicates sorting in 
	 * 				descending order 
	 */
	public static void selectionSort(byte[] vector, String desc) {
		for (int i = 0; i < vector.length - 1; i++) {
			byte bestValue = vector[i];
			int bestInd = i;
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] > bestValue) {
					bestValue = vector[j];
					bestInd = j;
				}
			}
			vector[bestInd] = vector[i];
			vector[i] = bestValue;
		}
	}
	
	/**
	 * sorts a byte vector using a bubble sort algorithm
	 * @param vector	byte vector
	 */
	public static void bubbleSort(byte[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			boolean flag = true;
			for (int j = vector.length - 1; j > i; j--) {
				if (vector[j - 1] > vector[j]) {
					byte temp = vector[j - 1];
					vector[j - 1] = vector[j];
					vector[j] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
	}
	
	/**
	 * sorts a byte vector using a bubble sort algorithm
	 * @param vector	byte vector
	 * @param desc	arbitrary string as desc indicates sorting in 
	 * 				descending order 
	 */
	public static void bubbleSort(byte[] vector, String desc) {
		for (int i = 0; i < vector.length - 1; i++) {
			boolean flag = true;
			for (int j = vector.length - 1; j > i; j--) {
				if (vector[j - 1] < vector[j]) {
					byte temp = vector[j - 1];
					vector[j - 1] = vector[j];
					vector[j] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
	}
	
	/**
	 * sorts a byte vector using a quick sort algorithm
	 * @param vector	byte vector
	 */
	public static void quickSort(int first, int last, byte[] vector) {
		if (first >= last) {
			return;
		}
		int i = first; 
		int j = last;
		int cur = (i + j) / 2;
		while (i < j) {
			while (i < cur && (vector[i] <= vector[cur])) {
				i++;
			}
			while (j > cur && (vector[cur] <= vector[j])) {
				j--;
			}
			if (i < j) {
				byte temp = vector[i];
				vector[i] = vector[j];
				vector[j] = temp;
				if (i == cur) {
					cur = j;
				} else if (j == cur) {
					cur = i;
				}			
			}
		}
		quickSort(first, cur, vector);
		quickSort(cur + 1, last, vector);
	}
	

}
