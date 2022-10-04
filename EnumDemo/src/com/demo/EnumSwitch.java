package com.demo;

import java.util.Scanner;

//enum class
enum Days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

//EnumSwitch class
public class EnumSwitch {
	Days day;

	public EnumSwitch(Days day) {
		super();
		// TODO Auto-generated constructor stub
		this.day = day;
	}

	public void display() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
		case TUESDAY:
			System.out.println("Such a boring");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		case WEDNESDAY:
		case THURSDAY:
			System.out.println("Midweek days are so-so.");
			break;
		default:
			System.out.println("NO DAY");
		}
	}

//	main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day: ");
		String day = sc.next();
		EnumSwitch test = new EnumSwitch(Days.valueOf(day.toUpperCase()));
		test.display();

	}

}
