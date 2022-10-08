package com.example;

import java.util.Scanner;

public class EligibleVote extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		System.out.println("Enter age: ");
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int age = sc.nextInt();
		try {
			if (age >= 18) {
				System.out.println("You are eligible");
			} else {
				throw new Exception("no");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);

		}
		sc.close();
	}

}
