package com.collection.pkg;

import java.util.HashMap;

public class OccuranceOfChar {
	public static void main(String[]args) {
		String s ="natarajan";
		char c[]=s.toCharArray();
	       HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		 for(int i=0; i<c.length; i++) {
	    	   int counter=1;
	    	   for(int j=i+1; j<c.length; j++) {
	    		   if(c[i]==c[j]) {
	    			   counter=counter+1;
	    			   c[j]='*';
	    			  }
	    	   }
	    	   hm.put(c[i], counter);
	       }
	       System.out.println(hm);
	       
	}

}
