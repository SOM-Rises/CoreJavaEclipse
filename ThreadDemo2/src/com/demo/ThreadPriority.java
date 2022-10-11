package com.demo;

public class ThreadPriority extends Thread {

	public ThreadPriority() {

		// TODO Auto-generated constructor stub
	}

	public ThreadPriority(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1 = new ThreadPriority("1st Thread : ");
		ThreadPriority t2 = new ThreadPriority("2nd Thread : ");
		ThreadPriority t3 = new ThreadPriority("3rd Thread : ");

		System.out.println("Thread1 Priority : " + t1.getPriority());

		t1.setPriority(NORM_PRIORITY);
		t1.start();
		System.out.println("Thread1 new Priority : " + t1.getPriority());

		t2.setPriority(MIN_PRIORITY);
		t2.start();
		System.out.println("Thread2 new Priority : " + t2.getPriority());

		t3.setPriority(MAX_PRIORITY);
		t3.start();
		System.out.println("Thread3 new Priority : " + t3.getPriority());

		;
	}

}
