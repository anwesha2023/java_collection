package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDescending {

	 public static void main(String[] args) {
	       
	        ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(1);
	        numbers.add(3);

	        Collections.sort(numbers, Collections.reverseOrder());

	   
	        System.out.println("ArrayList sorted in descending order: " + numbers);
	    }
}
