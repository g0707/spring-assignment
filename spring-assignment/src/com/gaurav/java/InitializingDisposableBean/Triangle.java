package com.gaurav.java.InitializingDisposableBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Triangle 
{
	private Point pointA;
	
	private Point pointB;
	
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void myInit() 
	{
		System.out.println("My init method for Triangle");
	}

	public void cleanUp() 
	{
		System.out.println("My destroy method for Triangle");
	}
	
	@PostConstruct
	public void annotatedMyInit() 
	{
		System.out.println("init done using Annotation");
	}
	
	@PreDestroy
	public void annotatedcleanUp() 
	{
		System.out.println("cleanUp  done using Annotation");
	}
	
	public void draw() 
	{
		System.out.println("Point A = (" +getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point B = (" +getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Point C = (" +getPointC().getX()+","+getPointC().getY()+")");
	}
}