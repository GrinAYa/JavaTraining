/**
 * 
 */
package by.epam.javatraining.hrynhlaz.tasks.maintask02.model.logic;

import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.soundrecords.SoundRecord;
import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.util.Utilite;
import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.util.Sorting;

/**
 * @version		1.01 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public class Playlist {
	SoundRecord[] recordList = new SoundRecord[0]; 
	
	public void addRecord(SoundRecord record) {
		SoundRecord[] tempList = new SoundRecord[recordList.length + 1];
		for (int i = 0; i < recordList.length; i++) {
			tempList[i] = recordList[i];
		}
		tempList[tempList.length - 1] = record;
		recordList = tempList;
		tempList = null;
	}
	
	public SoundRecord getRecord(int pos) {
		if (pos < recordList.length && pos >= 0) {
			return recordList[pos];
		}	else {
			return null;
		}
	}
	
	public int length() {
		return recordList.length;
	}
	
	public boolean isEmpty() {
		return recordList.length > 0 ? false : true;
	}
	
	public void sortByTitle() {
		Sorting.quickSort(0, recordList.length - 1, recordList, "getTitle");
	}
	
	public void sortByArtist() {
		Sorting.quickSort(0, recordList.length - 1, recordList, "getArtist");
	}
	
	public String getTotalDuration() {
		if (this.isEmpty()) {
			return null;
		}
		long totalDuration = 0;
		for (int pos = 0; pos < recordList.length; pos++) {
			totalDuration += getRecord(pos).getDuration();
		}		
		return Utilite.convertDuration(totalDuration);
	}
	
	public SoundRecord findeLongestRecord() {
		if (this.isEmpty()) {
			return null;
		} 
		long maxDuration = recordList[0].getDuration();
		SoundRecord record = null;
		for (int i = 1; i < recordList.length; i++) {
			if (recordList[i].getDuration() > maxDuration) {
				maxDuration = recordList[i].getDuration();
				record = recordList[i];
			} 
		}
		return record;
	}
	
	public SoundRecord findeShortestRecord() {
		if (this.isEmpty()) {
			return null;
		} 
		long maxDuration = recordList[0].getDuration();
		SoundRecord record = null;
		for (int i = 1; i < recordList.length; i++) {
			if (recordList[i].getDuration() < maxDuration) {
				maxDuration = recordList[i].getDuration();
				record = recordList[i];
			} 
		}
		return record;
	}
	

}
