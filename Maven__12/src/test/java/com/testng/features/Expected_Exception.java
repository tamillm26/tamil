package com.testng.features;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = ArithmeticException.class)
	public void test() {

		int a=5;
		System.out.println(a/0);
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void String() {

		String s=null;
		System.out.println(s.toUpperCase());
	}
	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class )
	public void code() {

		int a[] = {1,2,3,4,5,6};
		System.out.println(a[8]);
	}
	
}
