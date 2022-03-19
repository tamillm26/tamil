package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	public void propertysetting() {
		System.out.println("Proerty Setting");
	}
	
	@BeforeTest
	public void browser_Lunch() {
		System.out.println("browser lunch");
	}
	
	@BeforeClass
	public void link_Lunch() {
		System.out.println("link open");
	}
	
	@BeforeMethod
	public void singin() {
		System.out.println("singin");
	}
	
	@Test
	public void dresses() {
		System.out.println("dresses");
	}
	
	@Test
	public void mobile() {
		System.out.println("mobile");
	}
	
	@Test
	public void bikes() {
		System.out.println("bikes");
	}
	
	@Test
	public void laptop() {
        System.out.println("laptop");
	}
	
	@Test
	public void desktop() {
	    System.out.println("desktop");
	}
	
	@AfterMethod
	public void singout() {	
		System.out.println("singout");
	}
	
	@AfterClass
	public void delete_Cookies() {
        System.out.println("delete cookies");
	}
	
	@AfterTest
	public void home_Page() {
		System.out.println("home page");
	}
	
	@AfterSuite
	public void close_Browser() {
		System.out.println("close browser");
	}
	
}
