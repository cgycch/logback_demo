package com.cch.logBack_demo;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

/**
 * Application Lifecycle Listener implementation class InitLog4jListener
 *
 */
@WebListener()
public class InitLog4jListener implements ServletContextListener{

    public InitLog4jListener() {
    }
    
    public void contextDestroyed(ServletContextEvent arg0)  {      
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
    	ServletContext sc = arg0.getServletContext();  
//    	String log4jLocation = sc.getInitParameter("log4j_pro_path"); 
//    	 if (log4jLocation == null) {  
//             System.err.println("*** 没有 log4j-properties-location 初始化的文件, 所以使用 BasicConfigurator初始化");  
//             BasicConfigurator.configure();  
//         } else {  
//             String webAppPath = sc.getRealPath("");  
//             String log4jProp = webAppPath + log4jLocation;  
//             File file = new File(log4jProp);  
//             if (file.exists()) {  
//                 System.out.println("使用: " + log4jProp+"初始化日志设置信息");  
//                 PropertyConfigurator.configure(log4jProp);  
//             } else {  
//                 System.err.println("*** " + log4jProp + " 文件没有找到， 所以使用 BasicConfigurator初始化");  
//                 BasicConfigurator.configure();  
//             }  
//         }  
    	 System.out.println("listener===============");
    	 System.setProperty("MY_HOME", sc.getRealPath("/")+"WEB-INF/backlogs");
    	 System.setProperty("MY_HOME2", sc.getRealPath("/")+"WEB-INF/log4jlogs");
    	 System.setProperty("log.root.level", "debug");
    	 System.out.println("listener===============");
    }
}
