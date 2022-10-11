package com.demo;

public class Thread1 extends Thread {

	public Thread1() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am in the constructor broo no arg");
	}

	public Thread1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("I am in the constructor broo");
	}

	public void run() {
		System.out.println("am i joking");
		int a = 5;
		int b = 6;
		int c = a + b;
		System.out.println("Sum is : " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1 = new Thread1();
		t1.start();
		Thread1 t2 = new Thread1("SOMNATH");
		t2.start();
		System.out.println("my name : " + t2.getName());
//		System.out.println("my name : Somnath");

	}

}
