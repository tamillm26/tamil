package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void carrot() {

		System.out.println("carrot");
	}
	
	@Test
	public void tomato() {
	
		System.out.println("tomato");
	}
	
	@Ignore
	@Test
	public void cauliflower() {
	
		System.out.println("cauliflower");
	}
	
	@Test
	public void apple() {
	
		System.out.println("apple");
	}
	
	@Test(enabled = false)
	public void orange() {
	
		System.out.println("orange");
	}
	
	
}
