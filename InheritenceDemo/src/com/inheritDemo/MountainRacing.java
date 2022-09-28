package com.inheritDemo;

public class MountainRacing extends MountainCycle {

	private boolean GPS;
	private String light;
	private String speedbooster;

	public MountainRacing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MountainRacing(String wheel, int seatLevel, double price, String brand, int noOfgears, double speed,
			boolean gPS, String light, String speedbooster) {
		super(wheel, seatLevel, price, brand, noOfgears, speed);
		GPS = gPS;
		this.light = light;
		this.speedbooster = speedbooster;
	}

	public boolean isGPS() {
		return GPS;
	}

	public void setGPS(boolean gPS) {
		GPS = gPS;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public String getSpeedbooster() {
		return speedbooster;
	}

	public void setSpeedbooster(String speedbooster) {
		this.speedbooster = speedbooster;
	}

	@Override
	public String toString() {
		return " MountainRacing : GPS = " + GPS + ", light = " + light + ", speedbooster = " + speedbooster
				+ super.toString();
	}

}
