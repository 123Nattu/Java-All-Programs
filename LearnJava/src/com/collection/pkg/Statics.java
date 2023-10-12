package com.collection.pkg;

import java.util.ArrayList;
import java.util.HashMap;

public class Statics {
	public static void main(String[]args) {
		int sum=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(1);
		al.add(5);
	//	al.add(3);
		System.out.println(al);
		for(int i=0; i<al.size(); i++) {
			sum = sum+al.get(i);
		}
System.out.println(sum/al.size());	//mean
//medium
       if(al.size()%2==0) {
    	   System.out.println(al.get(al.size()/2));  //medium
    	   System.out.println(al.get(al.size()/2-1));

       }
       else
       {
    	   System.out.println(al.get(al.size()/2));
       }
      // -------------------------
       //mode-> data which occurs most frequently 
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       for(int i=0; i<al.size(); i++) {
    	   int counter=1;
    	   for(int j=i+1; j<al.size(); j++) {
    		   if(al.get(i)==al.get(j)) {
    			   counter=counter+1;
    			   al.set(j, 0);
    		   }
    	   }
    	   hm.put(al.get(i), counter);
       }
       System.out.println(hm);
       
	}

}
