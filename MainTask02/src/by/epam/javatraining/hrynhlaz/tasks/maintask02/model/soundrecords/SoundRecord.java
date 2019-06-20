/**
 * 
 */
package by.epam.javatraining.hrynhlaz.tasks.maintask02.model.soundrecords;

import org.apache.log4j.Logger;

import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.util.Utilite;

/**
 * Encapsulates instance variables and methods for working with sound records
 * 
 * @version		1.01 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public abstract class SoundRecord {
	protected static Logger logger = Logger.getLogger(SoundRecord.class);
	protected String title = "untitled";
	protected String artist;
	protected String genre;	
	protected long duration;
	protected int rating;
	
	
	public SoundRecord() {
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public long getDuration() {
		return duration;
	}
	
	public String getStrDuration( ) {
		return Utilite.convertDuration(duration);
	}
	
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
	public void setDuration(String duration) {
		try {
			this.duration = Long.parseLong(duration);
		} catch (NumberFormatException e) {
			this.duration = 0;
		}
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void setRating(String rating) {
		try {
			this.rating = Integer.parseInt(rating);
		} catch (NumberFormatException e) {
			this.rating = 0;
		}
		
	}
	
	public abstract void playRecord();
		
}


