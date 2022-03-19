package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//input)[1]")
	private WebElement Box;

	@FindBy(id = "continue")
	private WebElement ok;

	public Select_Hotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getBox() {
		return Box;
		
	}
	
	public WebElement getOk() {
		return ok;
	}
	

}
