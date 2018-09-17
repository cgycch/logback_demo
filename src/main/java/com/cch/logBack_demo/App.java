package com.cch.logBack_demo;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

	private static final Logger LOG4J = Logger.getLogger(App.class);
	private static final org.slf4j.Logger SL4J = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		System.out.println("Hello World!");
		LOG4J.trace("log4j trace");
		LOG4J.debug("log4j debug");
		LOG4J.info("log4j info");
		LOG4J.warn("log4j warn");
		LOG4J.error("log4j error");
		System.out.println("=================");
		SL4J.trace("SL4J trace");
		SL4J.debug("SL4J debug");
		SL4J.info("SL4J info");
		SL4J.warn("SL4J warn");
		SL4J.error("SL4J error");
	}
}
