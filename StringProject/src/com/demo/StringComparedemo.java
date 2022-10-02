package com.demo;

public class StringComparedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// content , refernce
		// equals()method
		// ==
		// compareTo()
		// == operator: compares the refernce

		String s1 = "Java";
//		String s2 = "Java";
//		String s2 = "JAVA";
		String s2 = s1;
		String s3 = new String("Java");

		System.out.println("comparing 2 literals(==) " + " " + (s1 == s2)); // compare reference
		System.out.println("comparing 2 literals equals()" + " " + s1.equals(s2)); // compare content
		System.out.println("comparing 2 literals equalsIgnoreCase()" + " " + s1.equalsIgnoreCase(s2));// ignore content
																										// cases
		System.out.println("comparing  literals and object(==)" + " " + (s1 == s3)); // compare reference literal vs
																						// object

		// comparison
		// compareTo
		// s1==s2 returns 0
		// s1>s2 return postive first letter
		// s1<s2 return negative

		String m1 = "Somu";
		String m2 = "Ayan";
		String m3 = "Tam";

		System.out.println("comparing compareTo:" + m1.compareTo(m2));
		System.out.println("comparing compareTo:" + m1.compareTo(m3));// m1<m3 compares
		System.out.println("comparing compareTo:" + m3.compareTo(m1));// m3>m1

	}

}
