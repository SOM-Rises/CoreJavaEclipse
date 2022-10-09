package com.demo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Simple {

	static void SimpleString(String str) {
		System.out.println("Method simpleString ");
		StringTokenizer st = new StringTokenizer(str, " ");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println();
	}

	static void SimpleString1(String str) {
		System.out.println("Method simpleString1 ");
		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.println("the first toekn is : " + st.nextToken());
		System.out.println();

	}

	static void CountTokens(String str) {
		System.out.println("Method CountTokens ");
		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.println("the number of tokens : " + st.countTokens());
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quotes : ");
		String str = sc.nextLine();
		SimpleString(str);
		SimpleString1(str);
		CountTokens(str);

		sc.close();
	}

}
