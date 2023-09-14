package com.mt.pkg;

public class Confusion {
	public static void main(String[]args) {
		String s =new String("java");
		String ss ="java";
		System.out.println(s==ss);//compares memory loc
		System.out.println(s.equals(ss));//compares the char seq
//		for(int i=0; i<=100; i++) {
//			System.out.print(i+"\t");
//			System.out.print(Integer.toBinaryString(i)+"\t");
//			System.out.print(Integer.toOctalString(i)+"\t");
//			System.out.println(Integer.toHexString(i));
//			
//		System.out.println(010);
//		System.out.println(0x13);
//		System.out.println(0xA);
//		System.out.println(0b1000);
//		System.out.println(0B100);
	}
}
