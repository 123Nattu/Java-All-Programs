package com.mt.pkg;


class A extends Thread{
	public void run() {
// print prime number between 100 and 300	
		for(int i=9000;i<=9100;i++) {
			int count =0;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
				count=count+1;
			}
			}
			if(count>0) {
				System.out.println("Prime Number"+ i);
			}
			}
	}
	
}
class B extends Thread{
	public void run() {
// print given string is palindrome or not
		String original ="malayalam";
		String reverse="";
		char c[] = original.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			reverse=reverse+c[i];
		}
		if(original.equals(reverse)) {
			System.out.println("Given String is palindrome");
		}else {
			System.out.println("Given String is not Palindrome");
		}
	}
	
}
class C extends Thread{
	public void run() {
// tables program for number 987654321		
		int num = 987654321;
		for(int i=1;i<=10;i++) {
			if(i>=5) {
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(num+" * "+ i +" = "+(num*i));		
					
		}
	}
	
}
public class MT {
	public static void main(String[]arg) {
		A a = new A();
		a.setPriority(1);
		a.start();
		B b = new B();
		b.start();
		C c = new C();
		c.start();
	}

}
