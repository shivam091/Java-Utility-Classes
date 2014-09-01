package org.util.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * utility class containing methods to get all properties from file and to store properties into XML file.
 * @author shivam
 *
 */
public class PropertiesUtilities {

	/**
	 * method to print all the properties from properties file.
	 */
	 public static void getPropertiesFromFileSystem(){
         
	        InputStream is = null;
	        Properties prop = null;
	        try {
	            prop = new Properties();
	            is = new FileInputStream(new File("/home/shivam/Documents/data-access.properties"));
	            prop.load(is);
	            System.out.println("jdbc.driverClassName: " + prop.getProperty("jdbc.driverClassName"));
	            System.out.println("jdbc.url: " + prop.getProperty("jdbc.url"));
	            System.out.println("jdbc.username: " + prop.getProperty("jdbc.username"));
	            System.out.println("jdbc.password: " + prop.getProperty("jdbc.password"));
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 /**
	  * method to store properties into XML file.
	  * @param whereToStoreXML
	  * 		path for storing XML file.
	  * @throws IOException
	  */
	 public static void storePropertiesToXML(String whereToStoreXML) throws IOException {
         
	        OutputStream outputStream = null;
	        Properties properties = new Properties();
	        properties.setProperty("jdbc.url", "mysql://localhost:3306/");
	        properties.setProperty("jdbc.username:", "root");
	        properties.setProperty("jdbc.username:", "root");
	        try {
	        	outputStream = new FileOutputStream(whereToStoreXML);
	        	properties.storeToXML(outputStream, "Dynamically generating properties file as XML");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }	         
	    }
}