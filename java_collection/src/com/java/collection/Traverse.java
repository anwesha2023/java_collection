package com.java.collection;

import java.util.ArrayList;

public class Traverse {
 
	public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>();

       
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

       
        System.out.println("Using a for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            int element = numbers.get(i);
            System.out.println("Element at index " + i + ": " + element);
        }

        
	}
}

