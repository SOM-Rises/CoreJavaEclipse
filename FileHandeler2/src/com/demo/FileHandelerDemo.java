package com.demo;

import java.io.BufferedOutputStream;
import java.io.File;
//importing packages
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

//declaring class
public class FileHandelerDemo {

	// object of logger for the class
	static Logger log = Logger.getLogger(FileHandelerDemo.class.getName());

	// main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creating fileoutput stream
		FileOutputStream fout = null;

		// try catch block
		try {

			// create a file
			File f = new File("D:/Files/text1.txt");
			f.createNewFile();

			// adding information info
			log.info("File is Created " + new java.util.Date());
			fout = new FileOutputStream(f);
			BufferedOutputStream bout = new BufferedOutputStream(fout);

			// writting data in the file
			bout.write(78);

			// writting a string in the file
			String s = "The java Coder in da house";
			byte b[] = s.getBytes();
			bout.write(b);
			log.info("Added text in the file " + new java.util.Date());
			bout.flush();
			bout.close();

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			log.info("Not added " + new java.util.Date());

		}
		// try catch end
		finally {
			fout.close();
			log.info("File closed Succesfully " + new java.util.Date());
		}
		// finally ends

	}
	// mains ends

	private static BufferedOutputStream BufferedOutputStream(FileOutputStream fout) {
		// TODO Auto-generated method stub
		return null;
	}

}
//class ends