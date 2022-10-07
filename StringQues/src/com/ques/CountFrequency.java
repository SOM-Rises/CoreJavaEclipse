package com.ques;

import java.util.Scanner;

public class CountFrequency {

	static void checkFrequency(String s) {
		int freq[] = new int[s.length()]; // take a freq array same length as string s
		int i, j;

//		convert the string in to charecter array 
		char ch[] = s.toCharArray();

//		merthod to check the duplicate charecter
		for (i = 0; i < ch.length; i++) {
			freq[i] = 1;

			for (j = i + 1; j < ch.length; j++) {

				if (ch[i] != ' ' && ch[i] != '0') {
					if (ch[i] == ch[j]) {
						freq[i]++;
						ch[j] = '0';
					}
				}

			}

		}

		// for printing the dupclicate charfecter and there frequency
		for (i = 0; i < freq.length; i++) {

			if (ch[i] != ' ' && ch[i] != '0') {
				if (freq[i] > 1) {
					System.out.println(ch[i] + " : " + freq[i]);
				}
			}
		}

		System.out.println("-----Duplicate characters are:--------");

		for (i = 0; i < freq.length; i++) {

			if (ch[i] != ' ' && ch[i] != '0') {
				if (freq[i] > 1) {
					System.out.print(ch[i] + " ");
				}
			}
		}
	}

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// taking input
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Ente the string:--------");
		String s = sc.nextLine();

//		call the method
		checkFrequency(s);

	}

}
