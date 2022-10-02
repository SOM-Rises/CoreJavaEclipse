package com.demo;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to the paradise";
		System.out.println(s.charAt(15)); // charat method gives the charecter regarding to the index

		// length: property ar.length
		// string : length();

		System.out.println("Length is :" + s.length());
		String s1 = "Hello! ";
		s1 = s1.concat(s);
		System.out.println(s1);

		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 16));

		// to find the character sequence
		System.out.println(s.contains("paradise")); // gives true
		System.out.println(s.contains("para")); // its also gives true
		System.out.println(s.contains("java")); // gives false

		String s2 = "";

		System.out.println(s2.isEmpty()); // its check empty or not

		// replacing
		String s3 = s1.replace("paradise", "home");
		System.out.println(s3);

		int position = s3.indexOf('o');
		System.out.println(position);
		System.out.println(s3.toLowerCase());

		String s4 = "               yooo         whats up               ";
		System.out.println(s4);
		s4 = s4.trim();
		System.out.println(s4); // its remove white space first and last but dont remove the space between two
								// word

	}

}
