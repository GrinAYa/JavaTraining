/**
 * 
 */
package by.epam.javatraining.hrynhlaz.tasks.maintask02.model.soundrecords;

/**
 * Encapsulates instance variables and methods for working with 
 * sound records in MP3 format
 * 
 * @version		1.01 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public class Mp3Record extends SoundRecord {

	/* 
	 * @see by.epam.javatraining.hrynhlaz.tasks.maintask02.model.soundrecords.SoundRecord#playRecord()
	 */
	@Override
	public void playRecord() {
		// Plays records in MP3 format
		logger.info("Plays records in MP3 format");
	}

}
