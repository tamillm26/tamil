package com.adactin.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import mavan.com.Cucumber.Base_Class;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adaction.feature", 
                 glue = "com.stepdefinition",
                 monochrome = true,
                 dryRun = false,
                 tags = "~@RegressionTest")
	public class Test_Runner {

	public static WebDriver driver;
		
	@BeforeClass
	
		public static void set_Up() {
			driver = Base_Class.browser_lunch();
		}
		
	@AfterClass
		
		public static void tear_Down() {
			Base_Class.close();
		}
		
}

		