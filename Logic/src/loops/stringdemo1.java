package loops;

public class stringdemo1 {
	public static void main(String[]args) {
		stringdemo1 sd = new  stringdemo1();
		//sd.demo1();
		//sd.demo2();
		//sd.demo3();
		//sd.demo4();
		//sd.demo5();//using predefined method
		//sd.demo6();//stripleading
		//sd.demo7();//striptrailing
		//sd.demo8();// stripleadng and striptrailing
		//sd.demo9();
	//	sd.demo10();//remove unwanted space
		sd.demo11();//same program cutshort model
		}

	private void demo11() {
		String s = "How          are        you";
		boolean space = true; 
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				System.out.print(s.charAt(i));
				space = false;
			}
			else if(space==false) {
				System.out.print(s.charAt(i));
				space = true;
			}
		}
	}

	private void demo10() {
				String s = "How          are        you";
				for(int i=0;i<s.length();i++) {
					if(s.charAt(i)!=' ') 
					{
						System.out.print(s.charAt(i));
					}
					else 
					{
						System.out.print(s.charAt(i));
						for(int j=i; j<s.length();j++) 
						{
							if(s.charAt(j)==' ') {
								continue;
							}
							else {
								i=j-1;
								break;
							}
						}
					}
				}
	}

	private void demo9() {
		String s1 = "Today is Thursday";
		String s2 = "day";
		for(int i=0; i<s1.length();i++) {
			if(s2.charAt(0)== s1.charAt(i)) {
				int count=0;
				for(int j=0; j<s2.length();j++) {
					if(s2.charAt(j)==s1.charAt(i)){
						count++;
						i++;
					}
				}
				if(count == s2.length()) {
					System.out.println("yes contains");
					break;
				}
				else {
					System.out.println("not contains");
				}
			}
		}
	}

	private void demo8() {
		String s ="     How Are You     ";
		int start =0, end = s.length()-1;
		boolean first = false, last = false;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==' '&& first == false) {
				start++;
			}
			else
			{
				first = true;
				start =i;
			}
			if(s.charAt(end)==' ' && last==false) {
				end--;
			}
			else {
				last=true;
			}
			if(first==true && last==true) {
				for(int j=start;j<=end;j++) {
					System.out.print(s.charAt(j));
				}
				break;
			}
		}
	}

	private void demo7() {
		String s ="How are you   ";
		int last = s.length()-1;
		for(int i=s.length()-1; i>=0;i--) {
			if(s.charAt(i)!=' ')
			{
				last = i;
				break;
			}
		}
				for(int i=0; i<=last;i++) {
					System.out.print(s.charAt(i));
				}
			
		
	}

	private void demo6() {
		String s ="    How are you";
		boolean first = false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&& first == false)
			{
				
			}
			else {
				first = true;
				System.out.print(s.charAt(i));
			}
		}
	}

	private void demo5() {
				String s = "nata rajan siva";
				String[]  st = s.split(" ");
				for(int i=0; i<st.length; i++) {
					String name = st[i];
					System.out.print((char)(name.charAt(0)-32));
					String name2 = name.substring(1,name.length()-1);
					System.out.print(name2);
					System.out.print((char)(name.charAt(name.length()-1)-32)+" ");
							
				}
	}

	private void demo4() {
		String s = "nata rajan siva";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(i==0  || i==s.length()-1)
			{
				if(ch>='a' && ch<='z')
				System.out.print((char)(ch-32));
			}
			else if(ch==' '){
				System.out.print(ch);
				i++;
			    ch = s.charAt(i);
			    if(ch>='a' && ch<='z')
					System.out.print((char)(ch-32));	
			}
			else
			{
				int j = i+1;
				if(j<s.length() && s.charAt(j)==' ' )
				{
					if(ch>='a' && ch<='z')
						System.out.print((char)(ch-32));	
				}
				else
				System.out.print(ch);
			}
			
		}				
	}

	private void demo3() {
		String s = "nata rajan siva";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(i==0)
			{
				if(ch>='a' && ch<='z')
				System.out.print((char)(ch-32));
			}
			else if(ch==' '){
				System.out.print(ch);
				i++;
			    ch = s.charAt(i);
			    if(ch>='a' && ch<='z')
					System.out.print((char)(ch-32));	
			}
			else
			System.out.print(ch);
		}				
	}

	private void demo2() {
		String s = "natarajan";

		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			//if(i%2==0) 
				if(i==0 || i==s.length()-1 || i==s.length()/2)
			{
				if(ch>='a' && ch<='z')
				System.out.print((char)(ch-32));
			}
			else
			System.out.print(ch);
		}		
	}

	private void demo1() {
		//String s = "ABCD 1234 ";
		String s = "abcd 1234 ";

		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			//if(ch>='A' && ch<='Z')
				if(ch>='a' && ch<='z')
				//System.out.print((char)(ch+32));
				System.out.print((char)(ch-32));

			else
				System.out.print(ch);
		}
	}

}
