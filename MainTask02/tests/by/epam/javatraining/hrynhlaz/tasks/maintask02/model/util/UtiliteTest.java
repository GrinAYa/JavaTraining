package by.epam.javatraining.hrynhlaz.tasks.maintask02.model.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtiliteTest {

	@Test
	public void testConvertDuration() {
		long duration = 4220;
		String expecteds = Utilite.convertDuration(duration);
		String actuals = "1:10:20";
		assertTrue(expecteds.equals(actuals));
	}

}
