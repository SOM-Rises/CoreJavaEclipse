package com.example;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// main try block
		try {
			// nested try catch
			try {
				int a = 50 / 0;
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException occur");
			}

			// another nested try catch
			try {
				int arr[] = new int[5];
				System.out.println(arr[5]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException occur");
			}
		}
		// outer catch
		catch (Exception e) {
			System.out.println("Exception occur");

		}
		System.out.println("All code running");
		System.out.println("By nested try-catch you can handle two exception");

	}

}
