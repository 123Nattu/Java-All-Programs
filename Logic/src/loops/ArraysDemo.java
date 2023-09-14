package loops;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		//System.out.println(args.length);
		ArraysDemo ad = new ArraysDemo();
		//ad.learning_1();
		//ad.learning_2();
		//ad.learning_3();
		//ad.learning_4();//highest and lowest value identifiers prmbl 
		//ad.learning_5();// find negative numbers,negative numbers divided by 20,negative numbers-even position index,count of negative no.s
		//ad.learning_6();// first repeated character
		//ad.learning_7();//second and third repeated character
		//ad.learning_8();//First and second non repeated character
		//ad.learning_9();// first non repeated character
		//ad.learning_10();//count of each character
		//ad.learning_11();//most frequent letter 
		//ad.learning_12();// addition of two numbers
		//ad.length_13();//addition of two numbers diff length
		//ad.length_14();//concatenation of 2 arrays
		//ad.length_15();//print no.s between adjacent elements in an array 
		//ad.length_16();
		//ad.length_17();//split array
		ad.length_18();
	}

	private void length_18() {
		
		   
		         
		  }
	

	private void length_17() {
				int[] ar = {17,19,22,7,3,10,14,18};
				int key = 15;
				for(int i=0,j=0; i<ar.length; i++) {
					if(ar[i]<key) {
						int temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;
						j++;
					}
				}
				for(int i=0; i<ar.length;i++) {
					System.out.print(ar[i]+" ");
				}
	}

	private void length_16() {
		int[] ar = {10,5,8,12};
		for(int i=0; i<ar.length-1; i++) {
			int small = ar[i]<ar[i+1]?ar[i]:ar[i+1];
			int big = ar[i]>ar[i+1]?ar[i]:ar[i+1];
			int no1 = small;
			int no2 = big;
			for(int val = no1; val<=no2; val++)
			{
				System.out.print(val + " ");
			}
			System.out.println();
		}
				
	}

	private void length_15() {
		int[] ar = {5,10,15,20};
		for(int i=0; i<ar.length-1; i++) {
			int no1 = ar[i];
			int no2 = ar[i+1];
			for(int val = no1; val<=no2; val++)
				//for(int val = no1+1; val<no2; val++)//print the number of inbetween
			{
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
	}

	private void length_14() {
		int[] a= {5,10,15};
		int[] b= {20,25,30};
		int[] result = new int[a.length+b.length];
		int j= 0;
		for(int i=0; i<result.length; i++)
		{
			if(i<a.length)
				result[i] = a[i];
			else
			{
				result[i] = b[j];
				j++;
			}
			System.out.println(result[i]+ " ");
		}
	}

	private void length_13() {
		int[] a= {5,10,15,20};
		int[] b= {15,10,5};
		int big=a.length>b.length?a.length:b.length;
		int[] c =new int[big];
		int small =a.length<b.length?a.length:b.length;
		for	(int i=0; i<big; i++)
		{
			if(i<small) {
				c[i]=a[i]+b[i];
			}
			else {
				c[i]=a[i];
			}
			System.out.println(c[i]);
		}
		}

	private void learning_12() {
		int[] a= {5,10,15};
		int[] b= {15,10,5};
		int[] c= new int[a.length];
		for(int i=0; i<c.length; i++)
		{
			c[i] =a[i] + b[i];
			System.out.println(c[i]);
		}
	}

	private void learning_11() {
		char[] name = {'m','o','h','a','m','m','e','d'};
		//String s = "shiek mohammed";
		//char[] name = s.tochararray();
		int big=0;
		char c=' ';
		for(int j=0; j<name.length; j++) {
		char ch = name[j];
		int count=1;
		if(ch=='*')
			continue;
		for(int i=j+1; i<name.length; i++)
		{
			if(ch == name[i])
			{
				name[i] = '*';
				count++;
			}
		}
		if(count>big) {
			big = count;
			c = ch;
		}
		}	
		System.out.println("Most frequent letter is"+c);
		System.out.println("It appears for"+big+"times");
	}

	private void learning_10() {
		char[] name = {'m','o','h','a','m','m','e','d'};
		//String s = "shiek mohammed";
		//char[] name = s.tochararray();
		for(int j=0; j<name.length; j++) {
		char ch = name[j];
		int count=1;
		if(ch=='*')
			continue;
		for(int i=j+1; i<name.length; i++)
		{
			if(ch == name[i])
			{
				name[i] = '*';
				count++;
			}
		}
		System.out.println("count of "+ ch + "is" +count);
		}
		
				
	}

	private void learning_9() {
		char[] name = {'a','n','a','n','d'};
		for(int j=0; j<name.length; j++) {
		boolean repeated = false;
		char ch = name[j];
		if(ch=='*')
			continue;
		for(int i=j+1; i<name.length; i++)
		{
			if(ch == name[i])
			{
				name[i] = '*';
				repeated = true;
				break;
			}
		}
		if(repeated == false) {
			System.out.println("First non repeated char "+ch);
			j = name.length;
			break;
		}
		}		
	}
	
	
	
	

	private void learning_8() {
		//char [] name = {'v','i','a','y'};
		char[] name = {'n','a','t','a','r','a','j','a','n'};
		for(int j=0; j<name.length; j++) {
		boolean repeated = false;
		char ch = name[j];
		for(int i=j+1; i<name.length; i++)
		{
			if(ch == name[i])
			{
				repeated = true;
				break;
			}
		}
		if(repeated == false) {
			System.out.println("First non repeated char "+ch);
			j = name.length;
			break;
		}
		}
	}

	private void learning_7() {
		char[] name = {'p','r','a','k','a','s','h'};
		for(int j=0; j<name.length-1; j++) {
			
		char ch = name[j];
		for(int i=j+1; i<name.length;i++) {
			if(ch==name[i])
			{
				System.out.println("First Repeated is "+ ch);
				break;
			}
		}
		}
				
	}

	private void learning_6() {
		char[] name = {'n','a','t','a','r','a','j','a','n'};
		char ch = name[0];
		for(int i=1; i<name.length;i++) {
			if(ch==name[i])
			{
				System.out.println("First Repeated is "+ ch);
				break;
			}
		}
		
				
	}

	private void learning_5() {
		int[] ar = {5,-10,-20,30,-40,50};
		int count=0;
		for(int i=0; i<ar.length; i++) {
			//if(ar[i]<0 && ar[i]%20==0)
			//if(ar[i]<0 && i%2==0)
			if(ar[i]<0)
				//System.out.println(ar[i]);
				count=count+1;
		}
		System.out.println(count);
				
	}

	private void learning_4() {
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);

		int[] scores = {45,93,190,56,68};
		int Lowest = Integer.MAX_VALUE , Second_Lowest = Integer.MIN_VALUE;
		for(int i=0; i<scores.length; i++)
		{
			//if(scores[i]>h)
			if(scores[i]<Lowest)
			{
				Second_Lowest = Lowest;
				Lowest = scores[i];
			}
			//else if(scores[i]>s)
			else if(scores[i]<Second_Lowest)
			{
				Second_Lowest= scores[i];
			}
		}
		//System.out.println("highest score is: "+ h);
		System.out.println("lowest score is: "+ Lowest);
		//System.out.println("second highest score is: "+ s);
		System.out.println("second lowest score is: "+ Second_Lowest);

	}

	private void learning_3() {
		int[] marks = {92,93,100,99,97};
		int count=0;
		for(int i=0; i<marks.length;i++)
		{
			//if(marks[i]==100)
				//count++;
				//System.out.println(i);
			if(marks[i]>96) {
				count=count+1;
			}
				
		}
		System.out.println(count);
		
	}

	private void learning_2() {
		int[] marks = {92,93,100,99,97};
		int high = 0, low =100;
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i]>high)
			{
				high = marks[i];
			}
			if(marks[i]<low)
			{
				low = marks[i];
			}
			
		}
		System.out.println("Highest score is "+ high);
		System.out.println("Lowest score is "+ low);
		
	}

	private void learning_1() {
		int[] marks = new int[5];
		Scanner sc = new Scanner(System.in);//method access 
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter Mark:");
			marks[i] = sc.nextInt();//argument is 0 because nextint is there is no argument
			//System.out.println(marks[i]);
			total=total+marks[i];
		}
		sc.close();
		
		//marks[0] = 97;
		//marks[1] = 97;
		//marks[2] = 99;
		//marks[3] = 99;
		//marks[4] = 99; 

		//System.out.println(marks[0]);
		//System.out.println(marks[1]);
		//System.out.println(marks[2]);
		//System.out.println(marks[3]);
		//System.out.println(marks[4]);
		
		
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println(total);
		System.out.println(total/marks.length+"%");				
	}
}
