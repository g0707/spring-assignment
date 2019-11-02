package com.gaurav.java.aop.service;

import com.gaurav.java.aop.model.Circle;
import com.gaurav.java.aop.model.Triangle;
import com.gaurav.java.aop.proxy.ShapeServiceProxy;

public class FactoryService 
{
	public Object getBean(String beanType)
	{
		if(beanType.equals("shapeService")) return new ShapeServiceProxy();
		
		if(beanType.equals("triangle")) return new Triangle();
		
		if(beanType.equals("circle")) return new Circle();
		
		return null;
	}

}
