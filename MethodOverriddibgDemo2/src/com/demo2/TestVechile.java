package com.demo2;

public class TestVechile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.s = "BMW";
		c.msg(c.s);

		Bike b = new Bike();
		b.s = "Ducati";
		b.msg(b.s);

		Vechile v = new Vechile();
		v.msg("Vechile");
	}

}
