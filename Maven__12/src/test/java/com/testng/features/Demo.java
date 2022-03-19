package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	
	
	@Test
	public void load1() {

		String exp = "12345";
		String act = "12345";
		
		Assert.assertEquals(act, exp);
		
	}
	
	@Test
	public void load2() {

		String exp = "32145";
		String act = "321grf5";
		
		Assert.assertEquals(act, exp);
	
	}
}
