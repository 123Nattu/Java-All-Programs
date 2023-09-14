package com.collection.pkg;

import java.util.LinkedHashSet;

public class ToRemoveDupInList {
	public static void main(String[]arg) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("mango");
		lhs.add("apple");
		lhs.add(5);
		lhs.add(75.75);
		lhs.add("mango");
		System.out.println(lhs);
	}

}
