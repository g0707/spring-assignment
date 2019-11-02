package com.gaurav.java.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
		public static void main(String[] args) 
		{
			ApplicationContext context=new ClassPathXmlApplicationContext("resources/question.xml");
			
			Question q1=(Question)context.getBean("q");
			
			System.out.println(q1);	
			
		}
}
