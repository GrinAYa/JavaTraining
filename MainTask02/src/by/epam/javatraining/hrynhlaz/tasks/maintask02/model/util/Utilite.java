package by.epam.javatraining.hrynhlaz.tasks.maintask02.model.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import by.epam.javatraining.hrynhlaz.tasks.maintask02.model.soundrecords.SoundRecord;

/**
 * @version		1.01 9 Jun 2019
 * @author 		Aliaksandr Hrynhlaz
 */
public class Utilite {
	protected static Logger logger = Logger.getLogger(Utilite.class);
	
	/**
	 * This method convert the duration value in seconds to the
	 * string with next format Hours:Minutes:Seconds
	 */
	public static String convertDuration(long duration) {
		final int secondInMinut = 60;
		final int secondInHour = 3600;
		final int secondsInDay = 86400;
		
		long numSeconds = duration % secondInMinut;
		long numMinutes = duration % secondInHour / secondInMinut;
		long numHours = duration % secondsInDay / secondInHour;

		return numHours + ":" + numMinutes + ":" + numSeconds;
	}
	
	/**
	 * this method returns the field values of the record object, 
	 * the name of which is passed by the name parameter
	 */
	public static String getStrValue(SoundRecord record, String methodName) {
		Method method = null;
		String value = null;
		try {
			method = SoundRecord.class.getMethod(methodName);
		} catch (SecurityException e) {
			logger.warn("SecurityException", e);
		} catch (NoSuchMethodException e) {
			logger.warn("NoSuchMethodException", e);
		}
		
		try {
			value = "" + method.invoke(record);
		} catch(IllegalArgumentException e) {
			logger.warn("IllegalArgumentException", e);
		} catch(IllegalAccessException e ) {
			logger.warn("IllegalAccessException", e);
		} catch(InvocationTargetException e) {
			logger.warn("InvocationTargetException", e);
		}
		return value;
	}
}
