package com.demo;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter balance:");

		int balance = sc.nextInt();

		if (balance < 100) {
			throw new CustomException();
		} else {
			System.out.println("Enough balance");

		}
		System.out.println("All ok"); // this code dont run after exception caugth

		sc.close();
	}

}
