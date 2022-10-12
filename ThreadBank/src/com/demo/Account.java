package com.demo;

public class Account {

	private int balance = 500;

	public int getBalance() {
		return balance;
	}

	public void withDrawl(int amount) {
		balance = balance - amount;
	}
}
