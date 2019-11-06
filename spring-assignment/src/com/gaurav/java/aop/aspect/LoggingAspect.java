package com.gaurav.java.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect 
{
	@Before("allGetters")
	public void LoggingAdvice() 
	{
		System.out.println(" logging advice method called for all getters");
	}

	@After("allGetters")
	public void afterAdvice() 
	{
		System.out.println("after advice method called for all getters");
	}
	
	@Around("allGetters")
	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		try 
		{
			System.out.println("Before Advice");
			proceedingJoinPoint.proceed();
			System.out.println("After Advice");
		}
		catch(Throwable exp)
		{
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
	}
	
	@AfterReturning("args(name)")
	public void stringArgumentMethods(String name) 
	{
		System.out.println("After Returning Advice will run only when the method before it will run");
	}
	
	
	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) 
	{
		System.out.println("An Exception has been Thrown and After Throwing Advice has run");
	}
	
	@Pointcut("execution(* com.gaurav.java.aop.service.get(..))")
	public void allGetters() 
	{
		
	}
}