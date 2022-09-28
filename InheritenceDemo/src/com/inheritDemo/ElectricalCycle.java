package com.inheritDemo;

public class ElectricalCycle extends Cycle {

	private String battery;

	public ElectricalCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectricalCycle(String wheel, int seatLevel, double price, String brand, String battery) {
		super(wheel, seatLevel, price, brand);
		this.battery = battery;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return " ElectricalCycle : battery = " + battery + super.toString();
	}

}
