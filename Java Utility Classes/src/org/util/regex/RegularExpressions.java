package org.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * utility class to provide various validations. 
 * @author shivam
 *
 */
public class RegularExpressions extends RegularExpressionPatterns{
	private static Pattern pattern;
	private static Matcher matcher;
	
	/**
	 * validate userName with provided regular expression.
	 * @param userName
	 * 			user name for validation.
	 * @return true, if userName matches regular expression.
	 */
	public static Boolean validateUserName(String userName) {
		pattern = Pattern.compile(USER_NAME);  
		matcher = pattern.matcher(userName);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	/**
	 * validate userName with provided regular expression.
	 * @param password
	 * 			password for validation.
	 * @return true, if password matches regular expression.
	 */
	public static Boolean validatePassword(String password) {
		pattern = Pattern.compile(PASSWORD);  
		matcher = pattern.matcher(password);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	/**
	 * validate hexaDecimalColorCode with provided regular expression.
	 * @param hexaDecimalColorCode
	 * 			Hexadecimal color code for validation.
	 * @return true, if hexaDecimalColorCode matches regular expression.
	 */
	public static Boolean validateHexadecimalColorCode(String hexaDecimalColorCode) {
		pattern = Pattern.compile(HEXADECIMAL_COLOR_CODE);  
		matcher = pattern.matcher(hexaDecimalColorCode);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	/**
	 * validate emailAddress with provided regular expression.
	 * @param emailAddress
	 * 			email address for validation.
	 * @return true, if emailAddress matches regular expression.
	 */
	public static Boolean validateEmailAddress(String emailAddress) {
		pattern = Pattern.compile(EMAIL_ADDRESS);  
		matcher = pattern.matcher(emailAddress);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	/**
	 * validate fileExtension with provided regular expression.
	 * @param fileExtension
	 * 			file extension for validation.
	 * @return true, if fileExtension matches regular expression.
	 */
	public static Boolean validateFileExtension(String fileExtension) {
		pattern = Pattern.compile(FILE_EXTENSION);  
		matcher = pattern.matcher(fileExtension);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	/**
	 * validate ipv4Address with provided regular expression.
	 * @param ipv4Address
	 * 			Ipv4 address for validation.
	 * @return true, if ipv4Address matches regular expression.
	 */
	public static Boolean validateIPv4Address(String ipv4Address) {
		pattern = Pattern.compile(IPv4_ADDRESS);  
		matcher = pattern.matcher(ipv4Address);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	/**
	 * validate hoursTimeFormat12 with provided regular expression.
	 * @param hoursTimeFormat12
	 * 			Time format in 12 hours for validation.
	 * @return true, if hoursTimeFormat12 matches regular expression.
	 */
	public static Boolean validateHoursTimeFormat12(String hoursTimeFormat12) {
		pattern = Pattern.compile(HOURS_TIME_FORMAT_12);  
		matcher = pattern.matcher(hoursTimeFormat12);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	/**
	 * validate hoursTimeFormat24 with provided regular expression.
	 * @param hoursTimeFormat24
	 * 			Time format in 24 hours for validation.
	 * @return true, if hoursTimeFormat24 matches regular expression.
	 */
	public static Boolean validateHoursTimeFormat24(String hoursTimeFormat24) {
		pattern = Pattern.compile(HOURS_TIME_FORMAT_24);  
		matcher = pattern.matcher(hoursTimeFormat24);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	/**
	 * validate dateFormatDDMMYYY with provided regular expression.
	 * @param dateFormatDDMMYYY
	 * 			Date format (DD/MM/YYYY) for validation.
	 * @return true, if dateFormatDDMMYYY matches regular expression.
	 */
	public static Boolean validateDateFormatDDMMYYY(String dateFormatDDMMYYY) {
		pattern = Pattern.compile(DATE_FORMAT_DDMMYYYY);  
		matcher = pattern.matcher(dateFormatDDMMYYY);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	/**
	 * validate htmlTag with provided regular expression.
	 * @param htmlTag
	 * 			HTML tag (e.g., <html>) for validation.
	 * @return true, if htmlTag matches regular expression.
	 */
	public static Boolean validateHtmlTag(String htmlTag) {
		pattern = Pattern.compile(HTML_TAG);  
		matcher = pattern.matcher(htmlTag);  
		
		if (matcher.matches()) {  
			return true;		   
		} 
	   	else {
	   		return false;
	   	}
	}
	
	public static void main(String[] args) {
		System.out.println(validateUserName("mkyong34"));
	}
}