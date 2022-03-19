package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Test {

	@Test(dataProvider = "datas")
	public void login(String id , String password) {

		System.out.println("userid is :"+id);
		System.out.println("password is :"+password);
		
	}
	
	@Test(dataProvider = "inputs")
	public void logout(String name,String pass) {

		System.out.println("logoutid is:"+name);
		System.out.println("logout password is:"+pass);
	}
	
	@DataProvider
	public Object[][] datas() {

		return new Object[][] {
			
			{"tamil","234"},
			{"snega","876"}
			
		};
	}
	
	@DataProvider
	public Object[][] inputs() {

		return new Object[][] {
		
			{"sri","654"},
			{"hari","432"}
	    };
	
    }
	
}
