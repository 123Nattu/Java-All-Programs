package com.collection.pkg;

import java.util.HashSet;

public class MyHashset {
	public static void main(String[]arg) {
	HashSet hs = new HashSet();
	hs.add("mango");
	hs.add("apple");
	hs.add(5);
	hs.add(75.75);
	hs.add("mango");
	System.out.println(hs);
	}
	
}
