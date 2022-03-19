package com.runnerclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mavan.com.Maven__12.Base_Class;

public class Runner_Pom extends Base_Class{

	public static void main(String[] args) throws InterruptedException, IOException {
		
	browser_lunch();
	geturl("https://adactinhotelapp.com/");
	WebElement id = driver.findElement(By.id("username"));
	sendkeys(id, "thangavells");
	WebElement pass = driver.findElement(By.name("password"));
	sendkeys(pass, "tamil123");
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	Thread();
	WebElement loc = driver.findElement(By.name("location"));
	sendkeys(loc, "london");
	WebElement hotel = driver.findElement(By.id("hotels"));
	sendkeys(hotel, "hotel sunshine");
	WebElement type = driver.findElement(By.name("room_type"));
	sendkeys(type, "double");
	WebElement nos = driver.findElement(By.id("room_nos"));
	sendkeys(nos, "three");
	WebElement datein = driver.findElement(By.id("datepick_in"));
	sendkeys(datein, "20/02/2022");
	WebElement dateout = driver.findElement(By.id("datepick_out"));
	sendkeys(dateout, "23/02/2022");
	WebElement num = driver.findElement(By.id("adult_room"));
	sendkeys(num, "three");
	WebElement numc = driver.findElement(By.id("child_room"));
	sendkeys(numc, "one");
	WebElement search = driver.findElement(By.id("Submit"));//
	clickOnElement(search);
	Thread();
	WebElement box = driver.findElement(By.xpath("(//input)[1]"));
	box.click();
	Thread();
	WebElement ok = driver.findElement(By.id("continue"));
	clickOnElement(ok);
	Thread();
	WebElement fn = driver.findElement(By.id("first_name"));
	sendkeys(fn, "tamil");
	WebElement ln = driver.findElement(By.name("last_name"));
	sendkeys(ln, "thangavel");
    WebElement address = driver.findElement(By.tagName("textarea"));
    sendkeys(address, "4/419,middle st,konam villa,pnnur");
    WebElement no = driver.findElement(By.name("cc_num"));
    sendkeys(no, "1236547896584215");
    WebElement cardname = driver.findElement(By.className("select_combobox"));
    sendkeys(cardname, "VISA");
    WebElement month = driver.findElement(By.id("cc_exp_month"));
    sendkeys(month, "august");
    WebElement yr = driver.findElement(By.name("cc_exp_year"));
    sendkeys(yr, "2023");
    WebElement ccv = driver.findElement(By.name("cc_cvv"));
    sendkeys(ccv, "234");
	WebElement book = driver.findElement(By.name("book_now"));
	clickOnElement(book);
	//Takescreenshot();
	
	}
}
