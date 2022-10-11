package com.demo;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t1 = new Table();
		Thread1 d1 = new Thread1(t1);
		Thread2 d2 = new Thread2(t1);

		d1.start();

		d2.start();
	}

}
