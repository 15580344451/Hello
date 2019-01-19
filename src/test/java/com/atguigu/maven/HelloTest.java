package com.atguigu.maven;	
import static junit.framework.Assert.*;

import org.junit.Test;
public class HelloTest {
	@Test
	public void testHello(){
		Hello hello = new Hello();
		String results = hello.sayHello("litingwei");
		assertEquals("Hello litingwei!",results);	
	}
}