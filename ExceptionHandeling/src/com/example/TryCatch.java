package com.example;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[] = { 5, 87, 9, 45, 78, 65, 1, 45 };
			for (int i = 0; i < 200; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("Index out of bound" + e);
		}
		System.out.println("Rest of the code");
	}

}
