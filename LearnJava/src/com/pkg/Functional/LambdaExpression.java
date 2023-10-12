package com.pkg.Functional;

public class LambdaExpression {
	public static void main(String args[]) {
		
		Calc c = (a,b)-> a+b;
		
		System.out.println(c.sum(5, 6));
				
	}
}

interface Calc
{
	int sum(int a, int b );
}