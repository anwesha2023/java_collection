package com.java.collection;

import java.util.ArrayList;

public class checkelement {


	public static void main(String[]args) {
		
		ArrayList<String>words= new ArrayList<>();
		words.add("java");
		words.add("javascript");
		words.add("operating system");
		words.add("database");
		words.add("arraylist");
		
	    String check="java";
	    if (words.contains(check)) {
	    	System.out.println(check + " Element Present in Arraylist");
	    }else {
	    	System.out.println(check + " Element Not Present in Arraylist");
	    }
	
	}
}
