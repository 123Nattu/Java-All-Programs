package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadContent {

	public static void main(String[] args) {
		String s = "";
		int count = 0;
		try {
			FileReader fr = new FileReader("//home//natarajan//Documents//file.io//natu.txt");
			int i = 0;
			while ((i = fr.read()) != -1) {
				s = s + (char) i;
				if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I'
						|| i == 'O' || i == 'U') {
					count++;
				}
			}
		} catch (IOException e) {
			System.out.println("wrong code" + e);
		}
		System.out.println(s);
		System.out.println(count);
	}

}
