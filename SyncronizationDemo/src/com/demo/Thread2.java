package com.demo;

public class Thread2 extends Thread {

	Table t1;

	Thread2(Table t1) {
		this.t1 = t1;
	}

	public void run() {
		t1.PrintTable(9);
	}

}
