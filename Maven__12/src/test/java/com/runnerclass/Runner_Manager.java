package com.runnerclass;

import org.openqa.selenium.WebDriver;

import com.sdp.Page_Object_Manager;

import mavan.com.Maven__12.Base_Class;

public class Runner_Manager extends Base_Class {

	
	public static WebDriver driver = Base_Class.browser_lunch();
	 public static Page_Object_Manager pom = new Page_Object_Manager(driver);
		public static void main(String[] args) {
			//Login page
			geturl("https://adactinhotelapp.com/");
			 sendkeys(pom.getInstanceLp().getUsername(),"thangavells");
			 sendkeys(pom.getInstanceLp().getPassword(), "tamil123");
			 clickOnElement(pom.getInstanceLp().getLogin());
		
			 //Search hotel
		     sendkeys(pom.getInstanceSh().getLocation(), "london");
		     sendkeys(pom.getInstanceSh().getHotels(), "hotel sunshine");
		     sendkeys(pom.getInstanceSh().getRoom(), "double");
		     sendkeys(pom.getInstanceSh().getRoomsno(), "three");
		     sendkeys(pom.getInstanceSh().getDate(), "10/02/2022");
		     sendkeys(pom.getInstanceSh().getDateout(), "11/02/2022");
		     sendkeys(pom.getInstanceSh().getAdult(), "three");
		     sendkeys(pom.getInstanceSh().getChild(), "one");
		     clickOnElement(pom.getInstanceSh().getSumbmit());
		     
		     //Select hotel
		     clickOnElement(pom.getInstanceSl().getBox());
		     clickOnElement(pom.getInstanceSl().getOk());
		    
		     //book hotel
		     sendkeys(pom.getInstanceBh().getFirstname(),"tamil");
		     sendkeys(pom.getInstanceBh().getLastname(), "thangavel");
		     sendkeys(pom.getInstanceBh().getAddres(), "4/419,middle st,konam,pnnur");
		     sendkeys(pom.getInstanceBh().getCardno(),"1236547896584215");
		     sendkeys(pom.getInstanceBh().getCardname(), "VISA");
		     sendkeys(pom.getInstanceBh().getMonth(), "august");
		     sendkeys(pom.getInstanceBh().getYear(), "2023");
		     sendkeys(pom.getInstanceBh().getCcvno(), "234");
		     clickOnElement(pom.getInstanceBh().getBook());
		     
		}
}
