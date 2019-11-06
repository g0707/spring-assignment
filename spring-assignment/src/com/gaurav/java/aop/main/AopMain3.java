package com.gaurav.java.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurav.java.aop.service.ShapeService;

public class AopMain3 
{
	public static void main(String[] args) 
	{

		ApplicationContext context=new ClassPathXmlApplicationContext("resources/aop.xml");
		
		ShapeService shapeService=(ShapeService)context.getBean("shapeService");
		
		shapeService.getCircle().setName("gaurav");	
	}

}
