package com.testng.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterzied_Test {

	@Test
	@Parameters({"id","password","done"})
	public void credentials(String id , String password , String done) {

		System.out.println("user id :"+id);
		System.out.println("user password :"+password);
		System.out.println("accepted is :"+done);
	}
	
}
