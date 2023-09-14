package com.collection.pkg;

import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[]args) {
		ArrayList al = new ArrayList();
		al.add(7);
		al.add(7);
		al.add("venkat");
		al.add("Apple");
		al.add("Blue");
		al.add(0.5);
		al.remove(2);
		//al.get(1)//to get the value of the index
		//al.indexof(7)// to get the index of the value
		//al.set(0,"raj")
		al.contains("Apple");
		System.out.println(al.contains("Apple"));
		System.out.println("Size:"+ al.size());
		System.out.println(al);
		
		
	}

}
