package com.demo;

public class StringDemo {

	public static void main(String[] args) {

		String soriginal = new String("Welcome");

		// by literal : String constant pool: pool heap
		// new : object : non pool heap

		String scopy = soriginal;

		System.out.println("soriginal: " + soriginal);
		System.out.println("scopy: " + scopy);
		soriginal.concat(" Home");
		System.out.println("soriginal: " + soriginal);

		System.out.println("Original string is :" + soriginal);
		System.out.println("Copied String is :" + scopy);

	}
}
