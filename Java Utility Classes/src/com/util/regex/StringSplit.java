package com.util.regex;

import java.util.regex.Pattern;

/**
 * utility class containing method to split string using regular expression.
 * @author shivam
 *
 */
public class StringSplit {

	/**
	 * method to split string using provided pattern.
	 * @param stringToSplit
	 * 			string to split.
	 * @param patternToSplit
	 * 			pattern to use for split string. 
	 */
	public static void splitString(String stringToSplit, String patternToSplit) {        
        Pattern pattern = Pattern.compile(patternToSplit);
        String[] parts = pattern.split(stringToSplit);
        for(String p:parts){
            System.out.println(p);
        }
    }
}