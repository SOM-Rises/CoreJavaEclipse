package com.realdemo;

public class Bank {

	// variable
	private boolean netBanking;
	private int noOfBranches;
	protected double rateOfInterest;

	// default constructor
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Bank(boolean netBanking, int noOfBranches, double rateOfInterest) {
		super();
		this.netBanking = netBanking;
		this.noOfBranches = noOfBranches;
		this.rateOfInterest = rateOfInterest;
	}

//	getter setter 
	public boolean isNetBanking() {
		return netBanking;
	}

	public void setNetBanking(boolean netBanking) {
		this.netBanking = netBanking;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest() {
		this.rateOfInterest = 0.0;
	}

//	to String method
	@Override
	public String toString() {
		return "Bank [netBanking=" + netBanking + ", noOfBranches=" + noOfBranches + ", rateOfInterest="
				+ rateOfInterest + "]";
	}

}
