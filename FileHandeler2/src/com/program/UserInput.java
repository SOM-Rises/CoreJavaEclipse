package com.program;

//import packages
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {

	// main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Scanner class
		Scanner sc = new Scanner(System.in);

		// Enter the file1 name
		System.out.println("Enter the file1 ");
		String file1 = sc.nextLine();

		// created the file
		File f1 = new File("D:/Files/" + file1 + ".txt");

		if (f1.exists()) {
			System.out.println("File already exists........");
		} else {
			f1.createNewFile();
			System.out.println("File created successfully........");
		}

		// try with resources
		try (FileOutputStream fout = new FileOutputStream(f1)) {
			System.out.println("Enter the characters: enter null to exit>>>");
			String input;

			do {

				// take string and convert into byte
				input = sc.nextLine();
				byte b[] = input.getBytes();
				fout.write((b)); // writes in the file

			} while (!(input.equalsIgnoreCase("null")));
		}

	} // end main method

}// end class
