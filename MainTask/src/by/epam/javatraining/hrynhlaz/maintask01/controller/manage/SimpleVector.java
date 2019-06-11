
package by.epam.javatraining.hrynhlaz.maintask01.controller.manage;

import java.util.Arrays;

import org.apache.log4j.Logger;

import by.epam.javatraining.hrynhlaz.maintask01.model.logic.SimpleObjectList;
import static by.epam.javatraining.hrynhlaz.maintask01.model.logic.SimpleVectorLogic.*;

/**
 * This class demonstrates the work of methods for working with byte arrays 
 * from the SimpleVectorLogic class.
 * 
 * @version		1.01 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public class SimpleVector {
	public static Logger logger = Logger.getRootLogger();

	public static void main(String[] args) {
		int vectorLength = 9;
		byte[] vector = createVector(vectorLength);
		logger.info("create new vector " + Arrays.toString(vector));
		
		SimpleObjectList objectList = new SimpleObjectList();
		for(byte item : vector) {
			objectList.addItem(item);
		}
		logger.info("create new simple object list : " + objectList.toString());
		insertSort(objectList, "desc");
		logger.info("sorting list with insertion sort algorithm : " 
				+ objectList.toString());
		logger.info("sort simple object list with insertion sorting : " 
				+ objectList.toString());
		
		logger.info("max element : " + findeMaxElement(vector));
		logger.info("min element : " + findeMinElement(vector));
		
		logger.info("arithmetic average of all elements of the array : " 
				+ findAverage(vector));
		logger.info("geometric average of all elements of the array : " 
				+ findGeomAverage(vector));
		
		logger.info("the position of the first local max : " 
				+ findLocalMax(vector));
		logger.info("the position of the first local min : " 
				+ findLocalMin(vector));
		logger.info("the position of element 22 in the vector is : " 
				+ seqSearch((byte) 22, vector));
		logger.info("the position of element 114 in the vector is : " 
		+ binarySearch((byte) 114, vector));
		logger.info("are all items sorted in ascending order : " 
				+ checkIncrSequence(vector));
		logger.info("are all items sorted in descending order : " 
				+ checkDescSequence(vector));
		insertSort(vector);
		logger.info("sorting vector with insert sorting " + Arrays.toString(vector));
		logger.info("the position of element 114 in the vector is : " 
				+ binarySearch((byte) 114, vector));
		logger.info("are all items sorted in ascending order : " 
				+ checkIncrSequence(vector));
		logger.info("are all items sorted in descending order : " 
				+ checkDescSequence(vector));
		insertSort(vector);
		rotateVector(vector);
		logger.info("sorting vector with insert sorting " + Arrays.toString(vector));
		logger.info("are all items sorted in ascending order : " 
				+ checkIncrSequence(vector));
		logger.info("are all items sorted in descending order : " 
				+ checkDescSequence(vector));
		updateVector(vector);
		logger.info("sorting vector with insert sorting " + Arrays.toString(vector));
		selectionSort(vector);
		logger.info("sorting vector with insert sorting " + Arrays.toString(vector));
		updateVector(vector);
		logger.info("sorting vector with insert sorting " + Arrays.toString(vector));
		bubbleSort(vector);
		logger.info("sorting vector with insert sorting " + Arrays.toString(vector));
		
	}

}
