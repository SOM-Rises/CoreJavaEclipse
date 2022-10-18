package com.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			Writer fw = new FileWriter("D:/Files/fileWriter.txt");
			String s = "i'm done with coding";
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Reader fr = new FileReader("D:/Files/fileWriter.txt");
			int data;

			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
