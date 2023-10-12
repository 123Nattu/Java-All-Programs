package com.pkg.Functional;

import java.util.ArrayList;

public class FunctionalDemo {
	
	
	
	 public static void main(String[] args) {
		
		 
	  FunctionalDemo fd=new FunctionalDemo();
	  //fd.demo1();
	  //fd.demo2();
	  fd.demo3();
	 }

	 private void demo3() {
		 ArrayList <String> al=new ArrayList();
		  al.add("Natarajan");
		  al.add("Aravind");
		  al.add("Nithiya");
		  al.add("Chandru");
		  al.add("Saravana");		
		  al.forEach(i->System.out.println(i));
	}

	private void demo2() {
	  ArrayList <Integer> al=new ArrayList();
	  al.add(5);
	  al.add(10);
	  al.add(15);
	  al.add(20);
	  al.add(25);
	  int s=0;
	 System.out.println( al.stream().filter(n->n%2==1).mapToInt(i->i).sum());//print sum of odd element
	 System.out.println( al.stream().filter(n->n%2==1).mapToInt(i->i).count());//print count of odd element count
	 al.stream().filter(n->n%2==1).mapToInt(i->i).forEach(i->System.out.println(i));// print odd element
	 
	 }

	 private void demo1() {
	  ArrayList <Integer> al=new ArrayList();
	  al.add(5);
	  al.add(10);
	  al.add(15);
	  al.add(20);
	  al.add(25);
	  al.forEach(i->System.out.println(i));
	 }

	}


