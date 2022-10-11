package com.demo;

public class DaoemonDemo extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is Daemon Thread " + Thread.currentThread().getName());
		} else {
			System.out.println("This is not Daemon Thread " + Thread.currentThread().getName());
			System.out.println("This is Daemon Thread Priority is " + Thread.currentThread().getPriority());

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoemonDemo d1 = new DaoemonDemo();
		DaoemonDemo d2 = new DaoemonDemo();
		DaoemonDemo d3 = new DaoemonDemo();

		d1.setDaemon(true);
		d1.start();
		d2.start();
		// d2.setDaemon(true); // gives exception // Illegal State
		d3.start();

	}

}
