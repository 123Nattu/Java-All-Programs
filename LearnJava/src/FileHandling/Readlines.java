package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Readlines {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("//home//natarajan//Documents//file.io//natarajan.txt");
			BufferedReader br = new BufferedReader(fr);
			int i = 0;
			while (br.ready()) {

				System.out.println(br.readLine());

			}
		} catch (Exception e) {
			System.out.println("check code");
		}

	}
}