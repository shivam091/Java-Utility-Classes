package com.util.collections;

import java.util.LinkedList;
import java.util.List;

/**
 * utility class containing method to convert List to CSV string.
 * @author shivam
 *
 */
public class ListToCSVConvert {

	/**
	 * method to build CSV string from list.
	 * @param list
	 * 			list to be converted to CSV string.
	 * @return CSV string.
	 */
	public String buildCSV(List<String> list){
        
        StringBuilder sb = new StringBuilder();
        for(String str:list){
            if(sb.length() != 0){
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }
    
	/**
	 * method to build list.
	 * @return list of items to be converted to CSV string.
	 */
    public static List<String> getListAsCsvString(){         
        List<String> list = new LinkedList<String>(){
			private static final long serialVersionUID = -847934154499281321L;
			{
                this.add("animal");
                this.add("nuts");
                this.add("java");
            }
        };
        return list;
    } 
}