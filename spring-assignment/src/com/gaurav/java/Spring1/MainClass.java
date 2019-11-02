package com.gaurav.java.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
	public static void main(String[] args) 
	{
    //by default xml file should be in resource folder
	ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring1.xml");
	
	Customer c1=(Customer)context.getBean("c");
	
	System.out.println(c1);
	
	}
}