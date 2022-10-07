package com.realdemo;

//SBI class inherited Bank base class
public class SBI extends Bank {

	@Override
	public void setRateOfInterest() {
		this.rateOfInterest = 8.5;
		this.name = "SBI";
	}
}
