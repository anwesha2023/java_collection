package com.java.collection;

import java.util.ArrayList;

public class ArraylistRemove {
 
	public static void main(String[] args) {
	      
	      
	      ArrayList<Integer> arrayList = new ArrayList<>();

	      
	      arrayList.add(20);
	      arrayList.add(15);
	      arrayList.add(30);
	      arrayList.add(45);

	      System.out.println("Size of list: " + arrayList.size());
		   
	      System.out.println("ArrayList = " + arrayList);
	      
	  
	      arrayList.remove(2);//remove index 2
	      System.out.println("Now, Size of list: " + arrayList.size());
	      
	   
	      System.out.println("ArrayList = " + arrayList);
	   }
}
