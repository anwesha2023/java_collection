package com.java.collection;

import java.util.ArrayList;

public class Length {

	public static void main(String[]args) {
		
		ArrayList<String> words= new ArrayList<>();
		
		words.add("java");
		words.add("javascript");
		words.add("operating system");
		words.add("database");
		words.add("arraylist");
		
		int length=words.size();
		
		System.out.println("Length of "+ length);
		}
}
