package com.demo;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new BMW(); // reference car but object BMW
		c.run();// dynamic method dispatch

		c = new Ford(); // reference car but object Ford
		c.run(); // dynamic method dispatch
	}

}
