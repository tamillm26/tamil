package com.runnerclass;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;
import mavan.com.Maven__12.Base_Class;

public class Pom_Runner extends Base_Class {
	 public static WebDriver driver = Base_Class.browser_lunch();
	 public static Login_Page lp = new Login_Page(driver);	
	 
		public static void main(String[] args) {
			
			//Login page
			geturl("https://adactinhotelapp.com/");
			 sendkeys(lp.getUsername(), "thangavells");
			 sendkeys(lp.getPassword(), "tamil123");
			 clickOnElement(lp.getLogin());
		
			 //Search hotel
		     Search_Hotel sh = new Search_Hotel(driver);
		     sendkeys(sh.getLocation(), "london");
		     sendkeys(sh.getHotels(),"hotel sunshine");
		     sendkeys(sh.getRoom(), "double");
		     sendkeys(sh.getRoomsno(), "three");
		     sendkeys(sh.getDate(), "20/02/2022");
		     sendkeys(sh.getDateout(), "23/02/2022");
		     sendkeys(sh.getAdult(),  "three");
		     sendkeys(sh.getChild(),"one");
		     clickOnElement(sh.getSumbmit());
		     
		     //Select hotel
		     Select_Hotel sl = new Select_Hotel(driver);
		     clickOnElement(sl.getBox());
		     clickOnElement(sl.getOk());
		     
		     //book hotel
		     Book_Hotel bh = new Book_Hotel(driver);
		     sendkeys(bh.getFirstname(),"tamil");
		     sendkeys(bh.getLastname(),"thangavel");
		     sendkeys(bh.getAddres(),"4/419,middle st,konam,pnnur");
		     sendkeys(bh.getCardno(),"1236547896584215");
		     sendkeys(bh.getCardname(), "VISA");
		     sendkeys(bh.getMonth(),"august");
		     sendkeys(bh.getYear(),"2023");
		     sendkeys(bh.getCcvno(),"234");
		     clickOnElement(bh.getBook());
		
		}
		
	}

