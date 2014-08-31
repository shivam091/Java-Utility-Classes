package org.util.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class to convert {@link Date} to {@link String} and vice versa.
 * 
 * @author shivam
 * 
 */
public class DateUtils {

	/**
	 * Method to convert date to string.
	 * @param date
	 * 			Date to be converted to string.
	 * @return {@link String}
	 */
	public static String dateToString(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String dateString = dateFormat.format(date);
		return dateString;
	}

	/**
	 * Method to convert String to Date.
	 * @param dateInString1
	 * 			String to be converted to date.
	 * @return {@link Date}
	 */
	public static Date stringToDate(String dateInString) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"MM/dd/yyyy HH:mm:ss");
		Date date = null;
		try {
			date = (Date) simpleDateFormat.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return date;
	}
}