package com.example;

public class Stacking2 {

	static void method1() {
		System.out.println("Method 1");

		int a = 50 / 5;

	}

	static void method2() {
		System.out.println("Method 2");
		method1();
	}

	static void method3() {

		try {
			System.out.println("Method 3");
			method2();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("its not possible");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method3();
		System.out.println("YESSSSSSSSSSSSSSSS");

	}
}
