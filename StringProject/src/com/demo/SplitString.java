package com.demo;

public class SplitString {

	public static void main(String[] args) {

		String s1 = "my/name/is somnath";
		// String[] words = s1.split(" "); // split based on space
		String[] words = s1.split("/"); // split based on "/"

		for (String s : words) {
			System.out.println(s);
		}

		System.out.println();

		String s2 = "my name is somnath"; // put single charecter on char array
		char[] character = s2.toCharArray();

		for (char s : character) {
			System.out.println(s);
		}
	}
}
