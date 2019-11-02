package com.gaurav.java.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
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
	
	@Pointcut("execution( * get *())")
	public void allGetters() 
	{
		
	}
}