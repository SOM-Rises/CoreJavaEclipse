package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);// present days date
		System.out.println(date.minusDays(2));
		System.out.println(date.plusDays(2));

		String date1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date1);

		LocalTime time1 = LocalTime.now();
		System.out.println(time1);

		LocalDateTime c1 = LocalDateTime.now();
		System.out.println(c1);

		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyy  hh:mm:ss");
		String date2 = c1.format(format1);
		System.out.println(date2);
	}

}
