package com.demo;

public class Table {

	synchronized void PrintTable(int n) {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(n + " * " + i + " " + " = " + n * i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
