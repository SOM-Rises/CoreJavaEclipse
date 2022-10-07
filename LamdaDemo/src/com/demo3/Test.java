package com.demo3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//////////////////////////////////////
		// lambda with multiple parameters
		Add a1 = (int a, int b) -> {
			System.out.println("With return: " + a + b);
		};
		a1.add(7, 8);

//////////////////////////////////////
		// two parameter with out datatype
		Add a2 = (a, b) -> {
			System.out.println("With return: " + (a + b));
		};
		a2.add(10, 80);

//////////////////////////////////////
		// lambda with multiple parameters return type
		Add2 a3 = (int a, int b) -> {
			return (a + b);
		};

		System.out.println("With return: " + a3.add2(40, 80));

//////////////////////////////////////
		Add2 a4 = (int a, int b) -> {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			return a + b;
		};// in single return statement body can be omitted

		System.out.println("With return: " + a4.add2(80, 80));
	}

}
