package org.utilities.date;

import java.util.Date;

/**
 * utility class for operations on dates.
 * @author shivam
 *
 */
public class DateCheck {

	/**
	 * method to check whether the date is before the specified date.
	 * @param currentDate
	 * 			current date.
	 * @param previousDate
	 * 			date to be checked.
	 * @return true, if successful.
	 */
	public static Boolean checkDateForBefore(Date currentDate, Date previousDate){
        if(previousDate.before(currentDate)){
            return true;
        } else {
            return false;
        }
    }
	
	/**
	 * method to check whether the date is after the specified date.
	 * @param currentDate
	 * 			current date.
	 * @param nextDate
	 * 			date to be checked.
	 * @return true, if successful.
	 */
	public static Boolean main(Date currentDate, Date nextDate){
        if(nextDate.after(currentDate)){
            return true;
        } else {
            return false;
        }
    }
}