package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteLine {
	public static void main(String[]arg) {
		try {
			FileWriter fw = new FileWriter("//home//natarajan//Documents//file.io//naveen.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Asault Aravind"+"\n");
			bw.write("compiler chandhru"+"\n");
			bw.write("sambavam saravana"+"\n");
			bw.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
