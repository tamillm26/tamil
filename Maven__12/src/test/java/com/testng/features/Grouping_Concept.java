package com.testng.features;

import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "vegitables")
	public void carrot() {

		System.out.println("carrot");
	}
	
	@Test(groups = "vegitables")
	public void tomato() {
	
		System.out.println("tomato");
	}
	
	@Test(groups = "vegitable")
	public void cauliflower() {
	
		System.out.println("cauliflower");
	}
	
	@Test(groups = "fruits")
	public void apple() {
	
		System.out.println("apple");
	}
	
	@Test(groups = "fruits")
	public void orange() {
	
		System.out.println("orange");
	}
	
	@Test(groups = "mobile")
	public void mi() {

		System.out.println("mi");
	}
	
	@Test(groups = "mobile")
	public void oppo() {

		System.out.println("oppo");
	}
	
	@Test(groups = "mobile")
	public void vivo() {

		System.out.println("vivo");
	}
}
