package com.testng.features;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test(priority = -3)
	public void dresses() {
		System.out.println("dresses");
	}
	
	@Test(priority = -1)
	public void mobile() {
		System.out.println("mobile");
	}
	
	@Test(priority = -2)
	public void bikes() {
		System.out.println("bikes");
	}
	
	@Test(priority = 1)
	public void laptop() {
        System.out.println("laptop");
	}
	
	@Test(priority = 0)
	public void desktop() {
	    System.out.println("desktop");
	}
	
	@Test(priority = -4)
	public void mobile_Case() {
		System.out.println("mi 11x");
	}
	
}
