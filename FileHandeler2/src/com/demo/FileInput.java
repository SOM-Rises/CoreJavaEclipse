package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("D:/Files/myfileee.txt");

			// to read only one character
//			int i = fin.read();
//			System.out.print((char) i);

			// to read all the contents from the file
			int i;

			// read until its give -1
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}

			// close the FileInputStream
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
