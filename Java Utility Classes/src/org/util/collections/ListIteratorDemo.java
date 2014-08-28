package org.util.collections;

import java.util.List;
import java.util.ListIterator;

/**
 * utility class containing method to iterate through list in both backward and forward direction.
 * @author shivam
 *
 */
public class ListIteratorDemo {

	/**
	 * method to iterate through list.
	 * @param listToIterate
	 * 			list to iterate through.
	 */
	public static void iterateList(List<Integer> listToIterate){
        ListIterator<Integer> listIterator= null;
        listToIterate.add(23);
        listToIterate.add(98);
        listToIterate.add(29);
        listToIterate.add(71);
        listToIterate.add(5);
        listIterator=listToIterate.listIterator();
        
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}