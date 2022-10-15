package com.demo;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Logger1 {

	static Logger log = Logger.getLogger(Logger1.class.getName());

	public static void main(String[] args) throws IOException, SQLException {
		log.debug("Hello this is a debug message" + new java.util.Date());
		log.info("Hello this is an info message");
	}

}
