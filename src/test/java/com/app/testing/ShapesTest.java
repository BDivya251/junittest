package com.app.testing;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ShapesTest {
	
	@Test
	 public void test()
	{
		Shapes shape = new Shapes();
		assertEquals(4,shape.computeSquareArea(2));
//		fail("failed");
	}
	
	@Test
	void testcomputeCircleArea() {
		Shapes shape = new Shapes();
		assertEquals(100,shape.computeSquareArea(10));
	}

}
