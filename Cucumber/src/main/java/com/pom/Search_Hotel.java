package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;
	
	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(name = "room_type")
	private WebElement room;
	
	@FindBy(id = "room_nos")
	private WebElement roomsno;
	
	@FindBy(id = "datepick_in")
	private WebElement date;
	
	@FindBy(id = "datepick_out")
	private WebElement dateout;
	
	@FindBy(id = "adult_room")
	private WebElement adult;
	
	@FindBy(id = "child_room")
	private WebElement child;
	
	@FindBy(id = "Submit")
	private WebElement sumbmit;
	
	public Search_Hotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomsno() {
		return roomsno;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSumbmit() {
		return sumbmit;
	}

	
	
}
