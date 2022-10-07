package com.demo4;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer g = new Gamer() {

			@Override
			void Halo() {
				// TODO Auto-generated method stub
				System.out.println("its Halo night");
			}

		};
		g.Halo();
	}

}
