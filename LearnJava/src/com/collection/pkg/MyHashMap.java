package com.collection.pkg;

import java.util.HashMap;

public class MyHashMap {
	public static void main(String[]args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put(null,null );
		hm.put("c", "is a pl");
		hm.put(null,null);
		hm.put("Nithiya",null);
		System.out.print(hm);
	}
}
