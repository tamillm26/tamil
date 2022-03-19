package com.testng.features;

import org.testng.annotations.Test;

public class Dependency_Test {

	@Test
	public void login() {

		System.out.println("login");
	}

	@Test(dependsOnMethods = "login")
	public void username() {

		System.out.println("username");
	}

	@Test(dependsOnMethods = "username")
	public void password() {

		System.out.println("password");
	}

}
