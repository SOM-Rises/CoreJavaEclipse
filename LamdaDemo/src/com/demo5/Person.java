package com.demo5;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer g = new Gamer() {

			@Override
			public void Halo() {
				// TODO Auto-generated method stub
				System.out.println("Its Halo time");
			}
		};
		g.Halo();
	}

}
