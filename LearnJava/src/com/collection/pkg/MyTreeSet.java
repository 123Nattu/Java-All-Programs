package com.collection.pkg;

import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[]arg) {
		TreeSet ts = new TreeSet();
		ts.add("mango");
		ts.add("apple");
		//ts.add("5");
		//ts.add(75.75);
		ts.add("mango");
		System.out.println(ts);
	}

}
