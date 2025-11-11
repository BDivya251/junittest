package com.app.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class calCTest {
	
	//@Test
	//Test is applied over methods to merk method as test
	//present in org.junit.jupiter.api
	//visibility of @Test nnotated method can be public,protected,default - in junit 5
	//also inform test engine what methods needs to run
	
	
	//assertion - exceptation Vs Actual reality, static methods,org.junit.jupiter.Assertions-in junit 4
	
	@Test
	 public void test() {
//		fail("not yet implemented");
		System.out.println("First JUNIT run");
		calC c = new calC();
		int ans=c.divide(10, 5);
		System.out.println(c);
		assertEquals(ans,2);
	}

}
