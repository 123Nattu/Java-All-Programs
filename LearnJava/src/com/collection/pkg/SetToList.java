package com.collection.pkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetToList {
		public static void main(String[]arg) {
		HashSet hs = new HashSet();
		hs.add("mango");
		hs.add("apple");
		hs.add(5);
		hs.add(75.75);
		System.out.println(hs);
		
		ArrayList lsh = new ArrayList();
		lsh.addAll(hs);
		System.out.println(lsh);
		
		}
		
}
