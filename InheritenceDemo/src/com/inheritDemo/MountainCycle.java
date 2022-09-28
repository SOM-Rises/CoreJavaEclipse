package com.inheritDemo;

public class MountainCycle extends Cycle {

	private int noOfgears;
	private double speed;

	public MountainCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MountainCycle(String wheel, int seatLevel, double price, String brand, int noOfgears, double speed) {
		super(wheel, seatLevel, price, brand);
		this.noOfgears = noOfgears;
		this.speed = speed;
	}

	public int getNoOfgears() {
		return noOfgears;
	}

	public void setNoOfgears(int noOfgears) {
		this.noOfgears = noOfgears;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "MountainCycle : noOfgears=" + noOfgears + ", speed=" + speed + super.toString();
//		return "MountainCycle : number of gears=" + noOfgears + ", speed=" + speed;
	}

}
