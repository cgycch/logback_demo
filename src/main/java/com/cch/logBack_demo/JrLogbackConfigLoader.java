package com.cch.logBack_demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import ch.qos.logback.ext.spring.web.WebLogbackConfigurer;

@WebListener
public class JrLogbackConfigLoader implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		WebLogbackConfigurer.shutdownLogging(sce.getServletContext());
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
//		Properties prop = new Properties();
//		InputStream in = this.getClass().getResourceAsStream( "/system.properties" );
		System.out.println("***********  begin loading log configuration   *********");
//		try {
//			prop.load(in);
//			Enumeration<Object> iter= prop.keys();
//			while(iter.hasMoreElements()){
//				String key = iter.nextElement().toString();
//				if(key.startsWith( "log" )){
//					System.setProperty( key, prop.getProperty( key ) );
//					System.out.println( "set system logging parameter : "+key+" = "+prop.getProperty( key ) );
//				}
//			}
//		} catch( IOException e ) {
//			e.printStackTrace();
//		}
		 WebLogbackConfigurer.initLogging(sce.getServletContext());

	}

}
