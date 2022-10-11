package com.demo;

public class ThreadTest extends Thread {

	// Thread Scheduling
	public ThreadTest() {

		// TODO Auto-generated constructor stub
	}

	public ThreadTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t1 = new ThreadTest("SOMNATH : ");
		ThreadTest t2 = new ThreadTest("AYAN : ");
		ThreadTest t3 = new ThreadTest("SUBHAM : ");

//		if we do t1.run() no thread is created 

		t1.start(); // means thread is created
		// t1.start(); // twice thread its called IllegalThreadStateException
		try {
			t1.join(); // locking the resource till the thread goes to dead state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start();
		try {
			t2.join(2000); // locking the resource for a limited time
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t3.start();

		// t2.run();
		// t2.run();

	}

}
