package org.util.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * utility class to sort HashMap by keys (strings) in ascending order.
 * @author shivam
 *
 */
public class SortHashMapByStringKeys {
	
	/**
	 * method to sort HashMap in ascending key order.
	 * @param unsortedHashMap
	 * 			hashmap to be sorted.
	 * @return sorted hashmap.
	 * 
	 */
	public static Map<String, String> sortHashMap(HashMap<String, String> unsortedHashMap) {
 
		//To sort HashMap in ascending order, just convert it to TreeMap.
		Map<String, String> treeMap = new TreeMap<String, String>(unsortedHashMap);
		printMap(treeMap);
		return treeMap; 
	}
	
	/**
	 * method to print keys and values from sorted hashmap.
	 * @param sortedMap
	 * 			sorted hashmap.
	 */
	public static void printMap(Map<String, String> sortedMap) {
		for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
			System.out.println("" +entry.getKey() 
                                      + " " + entry.getValue());
		}
	}
}