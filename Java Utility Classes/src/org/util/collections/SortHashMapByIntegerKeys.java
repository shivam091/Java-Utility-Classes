package org.util.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * utility class to sort HashMap by keys (integers) in ascending order.
 * @author shivam
 *
 */
public class SortHashMapByIntegerKeys {
	
	/**
	 * method to sort HashMap in ascending key order.
	 * @param unsortedHashMap
	 * 			hashmap to be sorted.
	 * @return sorted hashmap.
	 * 
	 */
	public static Map<Integer, String> sortHashMap(HashMap<Integer, String> unsortedHashMap) {

		Map<Integer, String> treeMap = new TreeMap<Integer, String>(
			new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		treeMap.putAll(unsortedHashMap);
		printMap(treeMap);
		return treeMap;
	}
	
	/**
	 * method to print keys and values from sorted hashmap.
	 * @param sortedMap
	 * 			sorted hashmap.
	 */
	public static void printMap(Map<Integer, String> sortedMap) {
		for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() 
                                      + " Value : " + entry.getValue());
		}
	}
}