package com.demo2;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		// multiple catch block but one catch block run one at a time
		try {
			System.out.println(arr[10]); // two exception // order maintain
			arr[2] = 5 / 1; // which exception come first it will be handle by catch
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occur");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occur");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException occur");
		}
		System.out.println("rest of the code");
	}

}
