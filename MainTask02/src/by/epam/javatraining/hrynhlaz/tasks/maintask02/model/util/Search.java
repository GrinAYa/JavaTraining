package by.epam.javatraining.hrynhlaz.tasks.maintask02.model.util;


import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.logic.Playlist;

/**
 * @version		1.01 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public class Search {
	
	public static Playlist seqSearch(String key, String fieldName, Playlist playlist) {
		Playlist resultPlaylist = new Playlist();
		for (int i = 0; i < playlist.length(); i++) {
			if (key.equalsIgnoreCase(Utilite.getStrValue(playlist.getRecord(i), fieldName))) {
				resultPlaylist.addRecord(playlist.getRecord(i));
			}
		}
		return resultPlaylist;	
	}
	
}
