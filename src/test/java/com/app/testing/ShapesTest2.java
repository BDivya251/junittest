package com.app.testing;


//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.import static org.junit.jup
class ShapesTest2 {

	@Test
	void test() {
//		fail("Not yet implemented");
		Shapes s = new Shapes();
		assertEquals((int)s.computeSquareArea(2),4,()->"square of a number is wrong");
	}
	
	@Test
	void testArrays() {
		int []expected= {2,4,6,8};
//		int []actual= {4,8,6,2};
//		Arrays.sort(actual);
////		assertArrayEquals(expected,actual); //returns true
////		assertEquals(expected,actual); // it will check the reference so it will give false test case
//	
		SortingArrays arr = new SortingArrays();
////		int[] unsor= {2,1,4};
//		try {
//		int[] unsor=null;
//		int[] actual1 = arr.sorti(unsor);
//		int[] expec= {1,2,5};
//		assertArrayEquals(actual1,expec);
//		}
//		
//		catch(NullPointerException e) {
//			System.out.println("Exception generated");
//		}
		
		assertThrows(NullPointerException.class,()->arr.sorti(null)); //if null pointer exception generated then it will be true else false
		
	}
	
}
