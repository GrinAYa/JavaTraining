
package by.epam.javatraining.hrynhlaz.tasks.maintask02.controller.initializer;

import java.io.*;
import java.util.*;

import org.apache.log4j.Logger;

import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.logic.Playlist;
import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.soundrecords.*;

/**
 * @version		1.01 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public class PlaylistInitializer {
	protected static Logger logger = Logger.getLogger(PlaylistInitializer.class);
	
	public static void initialize(Playlist playlist, String fileName) {
		SoundRecord record = null;
		FileReader fReader = null;
		try {
			fReader = new FileReader(fileName);
			Scanner src = new Scanner(fReader);
			src.useDelimiter("\r\n");
			while (src.hasNextLine()) {
				String[] temp = src.next().split("/");
				switch (temp[0]) {
					case "MP3" :
						record = new Mp3Record();
						break;
					case "WAV" :
						record = new WavRecord();
						break;
					case "APE" :
						record = new ApeRecord();	
				}
				if (record != null) {
					record.setArtist(temp[1]);
					record.setTitle(temp[2]);
					record.setGenre(temp[3]);
					record.setDuration(temp[4]);
					record.setRating(temp[5]);

					playlist.addRecord(record);
				}
			}
			src.close();
		} catch(IOException e) {
			logger.warn("file resource access error", e);
		} finally {
			try {
				fReader.close();
			} catch(IOException e) {
				logger.warn("file resource access error", e);
			}
		}	
	}
	
}
