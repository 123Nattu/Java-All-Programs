package loops;

public class DecimaltoBinary {
	 public static void main(String[] args) {
	  int no=4;
	  String total="";
	  while(no>=1) {
	   int rem=no%2;
	   total=rem+total;//this format is must
	   no=no/2;
	  }
	  System.out.println(total);
	 }
	}


