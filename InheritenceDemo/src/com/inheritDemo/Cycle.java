package com.inheritDemo;

public class Cycle {

	private String wheel;
	private int seatLevel;
	private double price;
	private String brand;

	public Cycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cycle(String wheel, int seatLevel, double price, String brand) {
		super();
		this.wheel = wheel;
		this.seatLevel = seatLevel;
		this.price = price;
		this.brand = brand;
	}

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public int getSeatLevel() {
		return seatLevel;
	}

	public void setSeatLevel(int seatLevel) {
		this.seatLevel = seatLevel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Cycle : wheel = " + wheel + ", seatLevel = " + seatLevel + ", price = " + price + ", brand = " + brand;
	}

}
