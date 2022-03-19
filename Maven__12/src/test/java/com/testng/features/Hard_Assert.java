package com.testng.features;

import org.testng.Assert;

public class Hard_Assert {

	public void login_Id() {

		String exp_Id = "tamil23";
		String act_Id = "tamil23";
		
		Assert.assertEquals(exp_Id, act_Id);
		System.out.println("done");
		
	}

	public void user_Id() {

		String exp_Id = "snega234";
		String act_Id = "snega234";
		
		Assert.assertEquals(exp_Id, act_Id);
		System.out.println("done");
		
	}
}
