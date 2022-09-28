package com.demo;

// StudentDetails class
public class StudentDetails {

	// display method declare as static
	static void display(Student s, Address a) {
		System.out.println(s);
		System.out.println(a);
		System.out.println();
	}

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create object for Address and Student class
		Address a1 = new Address("2C", "Berhampore", 742101, "West Bengal", "India");
		Student s1 = new Student(1, "Somnath", a1);
		Address a2 = new Address("54C", "Berhampore", 742101, "West Bengal", "India");
		Student s2 = new Student(2, "Ayan", a2);
		display(s1, a1);
		display(s2, a2); // display method call
	}

}
