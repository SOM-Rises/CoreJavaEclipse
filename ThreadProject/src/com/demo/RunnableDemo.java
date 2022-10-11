package com.demo;

public class RunnableDemo implements Runnable {

	public static void main(String[] args) {

		Runnable r1 = new RunnableDemo();
		Thread t1 = new Thread("somu");
		r1.run();
		t1.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getPriority());
	}

	public void run() {
		System.out.println("Yooooo");
	}
}
