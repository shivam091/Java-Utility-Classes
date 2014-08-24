package com.util.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * utility class to sort HashMap in ascending order of values.
 * @author shivam
 *
 */
public class SortHashMapByValues {
 
	/**
	 * method to sort hashmap in ascending order of values.<br><br>
	 * 
	 * Steps:<br>
	 * 		1. convert map to list <br>
	 * 		2. sort list with comparator, to compare the map values<br>
	 *  	3. convert sorted list back to a map<br>
	 *  
	 * @param unsortedMap
	 * 			hashmap to be sorted.
	 * @return sorted hashmap.
	 */
	public static Map<String, Integer> sortHshMapByComparator(Map<String, Integer> unsortedMap) {
 
		// Convert Map to List
		List<Map.Entry<String, Integer>> list = 
			new LinkedList<Map.Entry<String, Integer>>(unsortedMap.entrySet());
 
		// Sort list with comparator, to compare the Map values
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
                                           Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
 
		// Convert sorted map back to a Map
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();) {
			Map.Entry<String, Integer> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
 
	/**
	 * method to print keys and values from sorted hashmap.
	 * @param sortedMap
	 * 			sorted hashmap.
	 */
	public static void printMap(Map<String, Integer> sortedMap) {
		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println("" + entry.getKey() 
                                      + " " + entry.getValue());
		}
	}
 
}