package com.example;

//importing packages
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

//declaring class
public class Fileoutput {

	// object of logger for the class
	static Logger log = Logger.getLogger(Fileoutput.class.getName());

	// main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creating fileoutput stream
		FileOutputStream fout = null;

		// try catch block
		try {

			// create a file
			fout = new FileOutputStream("D:/Files/text.txt");

			// adding information info
			log.info("File is Created " + new java.util.Date());

			// writting data in the file
			fout.write(78);
			log.info("File is added " + new java.util.Date());

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

}
//class ends