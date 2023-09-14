package com.collection.pkg;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MyLinkedHashSet {
	public static void main(String[]arg) {
		ArrayList al = new ArrayList();
		al.add(7);
		al.add(7);
		al.add("venkat");
		al.add("Apple");
		al.add("Blue");
		al.add(0.5);
		System.out.println(al);
		LinkedHashSet lsh = new LinkedHashSet();
		lsh.addAll(al);
		System.out.println(lsh);
		
	}

}
