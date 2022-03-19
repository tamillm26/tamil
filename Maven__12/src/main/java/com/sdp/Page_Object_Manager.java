package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {
	
	 public static WebDriver driver;
	 
	 private Login_Page lp;
	 private Search_Hotel sh;
	 private Select_Hotel sl;
	 private Book_Hotel bh;
	 
	 public Page_Object_Manager(WebDriver driver2) {
		 this.driver = driver2;
	 }
	public Login_Page getInstanceLp() {
			
		 if (lp==null) {
		     lp = new Login_Page(driver);
		 }
		 return lp;
		}
		public Search_Hotel getInstanceSh() {
			
			if (sh==null) {
				sh = new Search_Hotel(driver);
			}
			return sh;
		}
		public Select_Hotel getInstanceSl() {
			
			if (sl==null) {
				sl = new Select_Hotel(driver);
			}
			return sl;
		}
		public Book_Hotel getInstanceBh() {
			
			if (bh==null) {
				bh = new Book_Hotel(driver);
			}
			return bh;
		}
}
