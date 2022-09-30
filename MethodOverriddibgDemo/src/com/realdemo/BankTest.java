package com.realdemo;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI a = new SBI();
		// a.setRateOfInterest(8.5);
		a.setRateOfInterest();
		System.out.println("SBI Bank Interest: " + a.getRateOfInterest());

		Canara b = new Canara();
		// b.setRateOfInterest(6.5);
		b.setRateOfInterest();
		System.out.println("CAanara Bank Interest: " + b.getRateOfInterest());

	}

}
