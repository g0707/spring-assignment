package test;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurav.java.Spring2.Question;

public class Spring2TestClass 
{
	
	ClassPathXmlApplicationContext context=null;
	
	@Before
	public void setup() 
	{
		context= new ClassPathXmlApplicationContext("resources/question.xml");
	}
	
	@Test
	public void test() 
	{
	   Question q1=(Question)context.getBean("q");
	   assertNotNull(q1);
	}
	
	@After
	public void tearDown() 
	{
		context.close();
	}

}
