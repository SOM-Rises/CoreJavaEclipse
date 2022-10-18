package com.program;

//import packages
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyData {

	public static void Copydata(File f1, File f2) throws IOException {

		// create FileInputStream for read the data from the f1 file
		FileInputStream fin = new FileInputStream(f1);

		// create FileOutputStream for write the data to the the f2 file
		FileOutputStream fout = new FileOutputStream(f2);

		int i;

		// loop until its gives -1
		// read the file
		while ((i = fin.read()) != -1) {
			fout.write(i);
		}
		System.out.println("Files created :)");

		// close the streams
		fin.close();
		fout.close();
	}

	// main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Scanner class
		Scanner sc = new Scanner(System.in);

		// Enter the file1 name
		System.out.println("Enter the file1 ");
		String file1 = sc.nextLine();
		String file2;

		// created the file
		File f1 = new File("D:/Files/" + file1 + ".txt");

		// if file exists
		if (f1.exists()) {
			// Enter the file2 name
			System.out.println("Enter the file2 ");
			file2 = sc.nextLine();

			// created another file
			File f2 = new File("D:/Files/" + file2 + ".txt");

			// call the copydata function
			Copydata(f1, f2);
			sc.close();
		}
		// if file not exists
		else {
			System.out.println("Files not created!!!!!!!!!!!!!!! ");

		}
	} // end main method

}// end class
