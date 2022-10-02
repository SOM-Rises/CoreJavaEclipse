package com.demo;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String language1 = "Java";
		String language2 = "Java";
		System.out.println(language1 == language2); // case sensitive java Java // compare the reference

		System.out.println(language1.equals(language2)); // compare the value

		String language3 = new String("Ruby");
		String language4 = new String("Ruby");
		System.out.println(language3 == language4); // comapre the reference new object take new memory
		System.out.println(language3.equals(language4));// compare the value

	}

}
