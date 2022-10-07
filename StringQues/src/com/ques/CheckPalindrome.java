package com.ques;

import java.util.Scanner;

public class CheckPalindrome {

	// method for checkpalindrome
	static boolean Ispalindrome(String s) {

		String reverse = "";
		boolean status;

		// convert the string as array
		char ch[] = s.toCharArray();

		// reverse the array and input the empty string
		for (int i = ch.length - 1; i >= 0; i--) {

			reverse += ch[i];
		}

		// method for comparing
		int flag = s.compareTo(reverse);
//		System.out.println("Flag" + " " + flag);

		if (flag == 0) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");

		String s = sc.next();

		boolean check = Ispalindrome(s); // call the method

		if (check) {
			System.out.println("------------------The String is Palindrome------------------");
		} else {
			System.out.println("------------------The String is not Palindrome------------------");
		}

	}

}
