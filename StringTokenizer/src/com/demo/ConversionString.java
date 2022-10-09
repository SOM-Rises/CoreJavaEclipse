package com.demo;

public class ConversionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 56;
		String str = String.valueOf(i);
		// System.out.print(str);

		int b = 90;
		i = i + b;
		str = str + b;
		System.out.println(i);
		System.out.println(str.hashCode());

		System.out.println(str);

		String s1 = "Atul";
		String s2 = "Atul";

		if (s1.equals(s2)) {
			System.out.println("s1 hashcode : " + s1.hashCode());
			System.out.println("s2 hashcode : " + s2.hashCode());

		}

		String s3 = "Somnath";
		String s4 = "Ayan";
		if (!s3.equals(s4)) {
			System.out.println("s3 hashcode : " + s3.hashCode());
			System.out.println("s4 hashcode : " + s4.hashCode());

		}
	}

}
