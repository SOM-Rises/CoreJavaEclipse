package com.demo;

public class Student {

	// variables
	private int id;
	private String name;
	private Address addr;

	// default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Student(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	// getter setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student : id = " + id + ", name = " + name;
	}

}
