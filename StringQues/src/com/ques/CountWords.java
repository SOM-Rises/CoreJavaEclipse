package com.ques;

import java.util.Scanner;

public class CountWords {

	static void wordCount(String str) {

		String str1[] = str.split(" ");

		String big = str1[0];
		String small = str1[0];

		for (int i = 0; i < str1.length; i++) {
			if (big.length() < str1[i].length()) {
				big = str1[i];
			}
			if (small.length() > str1[i].length()) {
				small = str1[i];
			}
		}
		System.out.println("larger word" + " : " + big);
		System.out.println("Smaller word" + " : " + small);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Ente the string:--------");

		String s = sc.nextLine();

		wordCount(s);

	}

}
