package com.cch.logBack_demo.asd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Asd {

	private static final Logger LOGGER = LoggerFactory.getLogger(Asd.class);

	public void asdLog() {
		LOGGER.debug("Asd debug");
		LOGGER.info("Asd info");
		LOGGER.warn("Asd warn");
		LOGGER.error("Asd error");
	}

}
