package com.gaurav.java.aop.service;

import com.gaurav.java.aop.model.Circle;
import com.gaurav.java.aop.model.Triangle;

public class ShapeService 
{
	private Circle circle;
	
	private Triangle triangle;

	public Circle getCircle() {
		/*System.out.println("Circle getter called");*/
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
