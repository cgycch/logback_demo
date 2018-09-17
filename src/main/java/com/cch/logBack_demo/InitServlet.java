package com.cch.logBack_demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class InitServlet
 */
@WebServlet(urlPatterns={"/InitServlet"}, loadOnStartup=1,initParams= {@WebInitParam(name = "key", value = "WEB-INF/classes/log4j.properties")})
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG4J = Logger.getLogger(InitServlet.class);
	private static final org.slf4j.Logger SL4J = LoggerFactory.getLogger(InitServlet.class);

    /**
     * Default constructor. 
     */
    public InitServlet() {
        System.out.println("InitServlet....");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	System.out.println("init....");
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
