package loops;

public class StringReverse {
	public static String s3="";
	  public static void main(String[] args) 
	    {
	    reverse(); 
	      }
	  private static void reverse() {
	    String s = "Today is Friday";
	    String s2="", s3="";
	    for(int i=s.length()-1; i>=0; i--)
	    {
	      if(s.charAt(i)!=' ')
	        s2 = s2 + s.charAt(i);
	      else
	      {
	        reverseWord(s2);
	        s2 = "";
	      }
	    }
	    s3 =reverseWord(s2);
	    System.out.println(s3);   
	  }
	  private static String reverseWord(String name) {	    
	    for(int i=name.length()-1; i>=0; i--)
	    {
	      s3 = s3+name.charAt(i);
	    }
	    s3 = s3+" ";
	    return s3;
	  }
}
