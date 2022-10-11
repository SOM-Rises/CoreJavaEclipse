package com.demo;

public class Thread1 extends Thread {

	Table t1;

	Thread1(Table t1) {
		this.t1 = t1;
	}

	public void run() {
		t1.PrintTable(7);
	}

}
