package com.gaurav.java.aop.main;

import com.gaurav.java.aop.service.FactoryService;
import com.gaurav.java.aop.service.ShapeService;

public class AopMain 
{
	public static void main(String[] args) 
	{
		FactoryService factoryService=new FactoryService();
		ShapeService shapeService=(ShapeService)factoryService.getBean("shapeService");
		shapeService.getCircle();
	}
}
