package com.app.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //then we can write afterall,beforeall without static
class PerformanceTestingTest {
	
	
	//to create only one instance of class instead of number of tests
	
	//to run some run before all tests
	PerformanceTesting pt;
	@BeforeAll
	static void BeforeA() {
		System.out.println("int the before all");
	}
	
	@BeforeEach
	void init() {
		pt = new PerformanceTesting();
		System.out.println("Before testing");
	}

	@Test
	void test() {
//		PerformanceTesting pt = new PerformanceTesting();
		int[] arr= {2,1,4,3};
		int[] actual=pt.sortingArray(arr);
		assertTimeout(Duration.ofMillis(200),()->pt.sortingArray(arr));
		System.out.println("in the test1 while executing test");
	}
	
	@Test
	void test1() {
//		PerformanceTesting pt = new PerformanceTesting();
		int[] arr= {2,1,4,3};
		int[] actual=pt.sortingArray(arr);
		assertTimeout(Duration.ofMillis(100),()->pt.sortingArray(arr));
		System.out.println("in the test2 while executing test");
	}
	
	@AfterEach
	void fina() {
		System.out.println("after the test cases execution");
	}
	
	@AfterAll
	static void AfterA() {
		System.out.println("in the after all");
	}
}
