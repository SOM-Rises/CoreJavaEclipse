package com.demo2;

public class TestName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// one parameter and return type
		Myname m = (name) -> {
			return name;
		};

		System.out.println("Hello" + m.NamePrint(" somnath"));

		// one parameter and no return type
		Myname2 m2 = (name) -> {
			System.out.println(" Hello" + name);
		};

		m2.NamePrint("Ayan");
	}
}
