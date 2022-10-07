package com.demo;

public interface Drawable {

	public void draw();

	default void shape() {
		System.out.println("Shape");
	}
}
