package com.demo;

public class ThreadScheduling implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable nr = new ThreadScheduling();
		Thread t1 = new Thread(nr, "somnath");
		Thread t2 = new Thread(nr, "ayan");
		Thread t3 = new Thread(nr, "soumya");
		Thread t4 = new Thread(nr, "subham");

		t1.setPriority(10);
		t1.start();
		t2.start();
		// t3.setPriority(2);
		t3.start();
		t4.start();
	}

	@Override
	public void run() {
		try {

			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
