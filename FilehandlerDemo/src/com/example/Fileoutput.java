package com.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

public class Fileoutput {
	static Logger log = Logger.getLogger(Fileoutput.class.getName());

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fout = null;

		// try catch block
		try {
			fout = new FileOutputStream("D:/Files/text.txt"); // create a file
			log.info("File is Created " + new java.util.Date()); // log info
			fout.write(78);
			log.info("File is added " + new java.util.Date());

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			log.info("Not added " + new java.util.Date());

		} finally {
			fout.close();
			log.info("File closed Succesfully " + new java.util.Date());
		}

	}

}