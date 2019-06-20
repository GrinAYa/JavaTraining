package by.epam.javatraining.hrynhlaz.tasks.maintask02.controller.manage;

import java.io.IOException;

import org.apache.log4j.Logger;

import by.epam.javatraining.hrynhlaz.tasks.maintask02.controller.initializer.PlaylistInitializer;
import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.logic.Playlist;
import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.util.Search;

public class Player {
	private static Logger logger = Logger.getRootLogger();

	public static void main(String[] args) throws IOException {
		final String fileName = "SoundRecords.txt";
		
		Playlist playlist = new Playlist();
		logger.info("create new playlist");
		
		/* 
		 * Initialize playlist with sound records from text file SoundRecords.txt
		 */
		PlaylistInitializer.initialize(playlist, fileName);
		logger.info("Initialize playlist with sound records from text file");
		if (!playlist.isEmpty()) {
			for (int i = 0; i < playlist.length(); i++) {
				logger.info(playlist.getRecord(i).getTitle() 
						+ " " + playlist.getRecord(i).getStrDuration());	
			}
		} else {
			logger.warn("playlist is empty");
		}
		
		
		/* 
		 * Find longest sound record of the POP genre
		 */
		if (!playlist.isEmpty()) {
			Playlist searchResult = Search.seqSearch("pop", "getGenre", playlist);
			if (searchResult != null && !searchResult.isEmpty()) {
				for(int i = 0; i < searchResult.length(); i++) {
					logger.info(searchResult.getRecord(i).getTitle());
				}
				
				if (searchResult.findeLongestRecord() != null) {
					logger.info("The longest record of the POP genre is: " 
							+ searchResult.findeLongestRecord().getTitle());
				}
				
			} else {
				logger.warn("There is no records of the POP genre");
			}
		} else {
			logger.warn("playlist is empty");
		}
		
		/* 
		 * Find duration of sound record with title "Havana" 
		 */
		if (!playlist.isEmpty()) {
			Playlist searchResult = Search.seqSearch("Havana", "getTitle", playlist);
			if (searchResult != null && !searchResult.isEmpty()) {
				logger.info("The \"Havana\" record duration is: " 
						+ searchResult.getRecord(0).getStrDuration());
			} else {
				logger.warn("There is no record with title \"Havana\"");
			}
		} else {
			logger.warn("playlist is empty");
		}

		/* 
		 * an example of using sorting by artist
		 */
		if (!playlist.isEmpty()) {
			playlist.sortByArtist();
			for (int i = 0; i < playlist.length(); i++) {
				logger.info(playlist.getRecord(i).getTitle());
			}
		} else {
			logger.warn("playlist is empty");
		}
		
		/* 
		 * an example of using sorting by title
		 */
		if (!playlist.isEmpty()) {
			playlist.sortByTitle();
			for (int i = 0; i < playlist.length(); i++) {
				logger.info(playlist.getRecord(i).getTitle());
			}
		} else {
			logger.warn("playlist is empty");
		}
		
		logger.info("The total duration of the playlist is: " 
		+ playlist.getTotalDuration());
		
		logger.info("The longest melody is: " +
				playlist.findeLongestRecord().getTitle());
		
		logger.info("The shortest melody is: " +
				playlist.findeShortestRecord().getTitle());
		
		/* 
		 * play all records from playlist
		 */
		if (!playlist.isEmpty()) {
			for (int pos = 0; pos < playlist.length(); pos++) {
				playlist.getRecord(pos).playRecord();	
			}
		} else {
			logger.warn("playlist is empty");
		}
		
	}

}
