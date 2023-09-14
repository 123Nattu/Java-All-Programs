package com.collection.pkg;

import java.util.ArrayList;

public class ArraytoCollection {
	public static void main(String[]args) {
		ArrayList al = new ArrayList();
		int a[]={5,91,100,1001,95};
		for(int i=0; i<a.length; i++) {
			al.add(i,a[i]);
			//al.add(0,a[i]);//reverse the array    

		}
		System.out.print(al);
	}

}
