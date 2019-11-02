package test;


import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurav.java.Spring1.Customer;

public class Spring1TestClass 
{
	
	ClassPathXmlApplicationContext context=null;
	
	@Before
	public void setup() throws Exception
	{
		context=new ClassPathXmlApplicationContext("resources/spring1.xml");
		
	}
	
	@Test
	public void test()
	{
		Customer c1=(Customer)context.getBean("c");
		assertNotNull(c1);
	}
	
	@After
	public void tearDown() throws Exception
	{
		context.close();
	}
	
}
