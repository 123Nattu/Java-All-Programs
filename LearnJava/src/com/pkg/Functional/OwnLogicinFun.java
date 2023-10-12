package com.pkg.Functional;

import java.util.stream.Stream;

public class OwnLogicinFun {
	public static void main(String args[]) {
		
	
 // Stream.iterate(1,i->++i).limit(10).forEach(n->System.out.println(n));
//  Stream.iterate(1,i->++i).limit(10).filter(i->i%2==0).forEach(n->System.out.println(n));
		Stream.iterate(2,i->i+2).limit(10).forEach(n->System.out.println(n));
	}
}
	
