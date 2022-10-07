package com.demo;

public class TestLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawable d = new Drawable() {

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("i am Circle");
			}
		};
		d.draw();

		// Lamda only works with functional interface
		// lamda with no parameter
		Drawable d1 = () -> {
			System.out.println("I am lamda");
		};
		d1.draw();
	}

}
