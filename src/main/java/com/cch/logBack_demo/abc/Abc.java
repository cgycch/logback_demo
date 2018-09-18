package com.cch.logBack_demo.abc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Abc {

	private static final Logger LOGGER = LoggerFactory.getLogger(Abc.class);

	public void abcLog() {
		LOGGER.debug("Abc debug");
		LOGGER.info("Abc info");
		LOGGER.warn("Abc warn");
		LOGGER.error("Abc error");
	}

}
