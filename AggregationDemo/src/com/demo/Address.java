package com.demo;

// Address Class
public class Address {

	// variables
	private String addressline1;
	private String city;
	private int pincode;
	private String state;
	private String country;

	// default constructor
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Address(String addressline1, String city, int pincode, String state, String country) {
		super();
		this.addressline1 = addressline1;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	// all getter setters
	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// to string method
	@Override
	public String toString() {
		return "Address : addressline1 = " + addressline1 + ", city = " + city + ", pincode = " + pincode + ", state = "
				+ state + ", country = " + country;
	}

}
