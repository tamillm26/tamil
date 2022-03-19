package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(name ="last_name")
	private WebElement lastname;
	
	@FindBy(tagName = "textarea")
	private WebElement addres;
	
	@FindBy(name ="cc_num")
	private WebElement cardno;
	
	@FindBy(className = "select_combobox")
	private WebElement cardname;
	
	@FindBy(id = "cc_exp_month")
	private WebElement month;
	
	@FindBy(name ="cc_exp_year")
	private WebElement year;
	
	@FindBy(name = "cc_cvv")
	private WebElement ccvno;
	
	@FindBy(name = "book_now")
	private WebElement book;
	
	public Book_Hotel(WebDriver driver2) {

		this.driver = driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddres() {
		return addres;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardname() {
		return cardname;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getBook() {
		return book;
	}
	
}
