package Com.pkg.pt;

public class PtonSb {
	public static void main(String[] arg) {
		long starttime = System.currentTimeMillis();
		StringBuffer sb= new StringBuffer("java");
		for(int i=1; i<=1000000000; i++) {
			sb.append("Program");
		}
		long endtime = System.currentTimeMillis();
		System.out.println(endtime-starttime+"ms");
		
	}

}
