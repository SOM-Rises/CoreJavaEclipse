package com.demo;

public class EnumMain {

	enum season {
		SUMMER(10), WINTER(5), SPRING(5), AUTUMN(6);

		// constructor : giving value sto constant: private
		private int value; // no instance can be created beacuse constructor is private

		private season(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arrays of constants
		// values: array contaning all enums

		for (season s : season.values()) {
			System.out.println(s + " " + s.value);
		}

	}

}
