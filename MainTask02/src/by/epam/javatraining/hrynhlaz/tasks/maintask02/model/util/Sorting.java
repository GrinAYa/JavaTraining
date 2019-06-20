
package by.epam.javatraining.hrynhlaz.tasks.maintask02.model.util;

import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.soundrecords.SoundRecord;

/**
 * @version		1.01 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public class Sorting {
	
	public static void quickSort(int first, int last, 
			SoundRecord[] recordList, String fieldName) {
		if (first >= last) {
			return;
		}
		int i = first; 
		int j = last;
		int cur = (i + j) / 2;
		while (i < j) {
			String curValue = Utilite.getStrValue(recordList[cur], fieldName);
			while (i < cur && (Utilite.getStrValue(recordList[i], fieldName).compareTo(curValue) 
					<= 0)) {
				i++;
			}
			while (j > cur && (curValue.compareTo(Utilite.getStrValue(recordList[j], fieldName)) 
					<= 0)) {
				j--;
			}
			if (i < j) {
				SoundRecord temp = recordList[i];
				recordList[i] = recordList[j];
				recordList[j] = temp;
				if (i == cur) {
					cur = j;
				} else if (j == cur) {
					cur = i;
				}			
			}
		}
		quickSort(first, cur, recordList, fieldName);
		quickSort(cur + 1, last, recordList, fieldName);
	}
}
