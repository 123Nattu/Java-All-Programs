package loops;

public class StringDemo {
	public static void main (String[]args) {
		StringDemo pd = new StringDemo();
		//pd.demo1();
		//pd.demo2();
		//pd.demo3();
		//pd.demo4();
		//pd.demo5();
		pd.demo6();
		
		
	}

	

	

	private void demo6() {	   
		    
	}
	private void demo5() {
        String str = "anand ashok prakash";
        String s[] = str.split("s");
    //    String s[] = str.split(" ");
        for(int i=0;i<s.length;i++) {
        	System.out.println(s[i]);
        }
	}

	private void demo4() {
        String str = "Hi How Are You";
		//boolean starts = str.startsWith("Hi");
		boolean starts = str.endsWith("You");
		System.out.println(starts);
	}

	private void demo3() {
		String str = "Hi How Are You";
		str= str.substring(2,5);
		System.out.println(str);
		//System.out.println(str.contains("How"));
	}

	private void demo2() {
		//String str = "     Hi How Are You";
		//String str = "Hi How Are You     ";
		String str = "    Hi How Are You     ";
		System.out.println(str);
		//str = str.stripLeading();
		//str = str.stripTrailing();
		str = str.trim();
		System.out.println(str);
		
	}

	private void demo1() {
		String name = "natarajan";	
		System.out.println(name.toUpperCase());
	}

}
