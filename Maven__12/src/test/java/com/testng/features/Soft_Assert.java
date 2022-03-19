package com.testng.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

	SoftAssert s = new SoftAssert();
	@Test
	public void laptop_Name() {

		String exp_Name="dell";
		String act_Name="dell";
		
		
		s.assertEquals(exp_Name, act_Name);
		System.out.println("lead");
	}
	
	@Test
	public void mobile_Name() {

		String exp_Name="vivo";
		String act_Name="vivo";
		
		s.assertEquals(exp_Name, act_Name);
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
