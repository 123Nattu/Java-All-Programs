package com.jdbc.pkg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LearnDate {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalDate td = LocalDate.now();
		System.out.println(td);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String s =dtf.format(LocalDateTime.now());
		System.out.println(s);
	}

}
