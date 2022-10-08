package com.example;

public class FinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nested try catch
		try {
			System.out.println("In try block");

			int a = 50 / 0;
		} catch (ArrayIndexOutOfBoundsException e) { // its only handle ArrayIndexOutOfBoundsException
														// handle exception
			System.out.println("ArrayIndexOutOfBoundsException occur");

		} finally {
			System.out.println("Finally always run if there exception or not");
			System.out.println("after finally block the program should terminate abnormally");

		}

		System.out.println("All code running");

	}

}
