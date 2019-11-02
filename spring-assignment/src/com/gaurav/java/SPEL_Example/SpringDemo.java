package com.gaurav.java.SPEL_Example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo 
{
	public static void main(String[] args) 
	{
	    ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("resources/applicationContextDbConfig.xml");
	    MyDbConfig dbConfig = (MyDbConfig) context.getBean("dbConfig");
	    System.out.println(dbConfig.toString());
        context.close();
    }
}
