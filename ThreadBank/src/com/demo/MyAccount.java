package com.demo;

public class MyAccount extends Thread {

	Account acc = new Account();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyAccount a1 = new MyAccount();
		Thread t1 = new Thread(a1, "somnath");
		Thread t2 = new Thread(a1, "raja");

		t1.start();
		t2.start();

	}

	synchronized void makeWithdrawl(int amt) {
		if (acc.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdrawl " + amt);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.withDrawl(amt);
			System.out.println(Thread.currentThread().getName() + " is withdrawl " + amt);

		} else {
			System.out.println(Thread.currentThread().getName() + " is not have enough money");
			System.out.println("The amount is : " + acc.getBalance());

		}
	}

	@Override
	public void run() {
		makeWithdrawl(400);

		if (acc.getBalance() < 0) {
			System.out.println("This is overdrawn");

		}

	}
}
