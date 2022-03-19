package com.testng.features;

import org.testng.annotations.Test;

public class TimeOut_Test {

	@Test(timeOut = 18000)
	public void mobile_On() throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("press power button");
	
		Thread.sleep(3000);
		System.out.println("enter the password");
	
		Thread.sleep(5000);
		System.out.println("press ok button");
	
		Thread.sleep(4000);
		System.out.println("screen open");
		
		Thread.sleep(2000);
		System.out.println("mobile on");
	
	}

	@Test(timeOut = 15000)
	public void open_Facebook() throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("click the fb button");
	
		Thread.sleep(2000);
		System.out.println("enter the username");
		
		Thread.sleep(4000);
		System.out.println("enter the password");
		
		Thread.sleep(3000);
		System.out.println("click login button");
	
	}

	





}
