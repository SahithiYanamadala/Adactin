package org.testng;


import org.testng.annotations.Test;

public class TestNg {
	
	
	@Test(priority=1)
	private void tc01() {
		System.out.println("Test1");

	}
	@Test(priority=2,invocationCount=3)
	private void tc02() {
		System.out.println("Test2");
		
       }
	@Test(priority=4,enabled=false)
	private void tc03() {
		System.out.println("Test3");

	}
	@Test(priority=3)
	private void tc04() {
		System.out.println("Test 4 ");

	}
	
	}
	
	
	


