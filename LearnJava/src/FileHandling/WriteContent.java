package FileHandling;

import java.io.FileWriter;

public class WriteContent {
	public static void main(String[]arg) {
		try {
			FileWriter fw = new FileWriter("//home//natarajan//Documents//file.io//nattu.txt",true);
			String s="java is a super cool language";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
			
	
		
	}

}
