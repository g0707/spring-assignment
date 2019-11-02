package com.gaurav.java.aop.proxy;

import com.gaurav.java.aop.aspect.LoggingAspect;
import com.gaurav.java.aop.model.Circle;
import com.gaurav.java.aop.service.ShapeService;

public class ShapeServiceProxy extends ShapeService
{
	public Circle getCircle() 
	{
		new LoggingAspect().LoggingAdvice();
		
		return super.getCircle();
	}
}

