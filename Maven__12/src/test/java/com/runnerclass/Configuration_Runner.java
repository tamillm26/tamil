package com.runnerclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import mavan.com.Maven__12.Base_Class;

public class Configuration_Runner extends Base_Class {

	public static WebDriver driver = Base_Class.browser_lunch();
	 public static Page_Object_Manager pom = new Page_Object_Manager(driver);
		public static void main(String[] args) throws IOException {
			//Login page
			String url = File_Reader_Manager.getInastanceFRM().getInstanceCR().geturl();
			geturl(url);
			
			String username = File_Reader_Manager.getInastanceFRM().getInstanceCR().getusername();
			sendkeys(pom.getInstanceLp().getUsername(),username);
			
		    String password = File_Reader_Manager.getInastanceFRM().getInstanceCR().getpassword();
			sendkeys(pom.getInstanceLp().getPassword(),password);
			 clickOnElement(pom.getInstanceLp().getLogin());
		
			 //Search hotel
			 String location = File_Reader_Manager.getInastanceFRM().getInstanceCR().getlocation();
		     sendkeys(pom.getInstanceSh().getLocation(),location);
		     String hotel =File_Reader_Manager.getInastanceFRM().getInstanceCR().gethotel();
		     sendkeys(pom.getInstanceSh().getHotels(),hotel);
		     String room =File_Reader_Manager.getInastanceFRM().getInstanceCR().getroom();
		     sendkeys(pom.getInstanceSh().getRoom(),room);
		     String roomno =File_Reader_Manager.getInastanceFRM().getInstanceCR().getroomsno();
		     sendkeys(pom.getInstanceSh().getRoomsno(),roomno);
		     String date =File_Reader_Manager.getInastanceFRM().getInstanceCR().getdate();
		     sendkeys(pom.getInstanceSh().getDate(),date);
		     String dateout =File_Reader_Manager.getInastanceFRM().getInstanceCR().getdateout();
		     sendkeys(pom.getInstanceSh().getDateout(),dateout);
		     String adult =File_Reader_Manager.getInastanceFRM().getInstanceCR().getadult();
		     sendkeys(pom.getInstanceSh().getAdult(),adult);
		     String child =File_Reader_Manager.getInastanceFRM().getInstanceCR().getchild();
		     sendkeys(pom.getInstanceSh().getChild(),child);
		     clickOnElement(pom.getInstanceSh().getSumbmit());
		     
		     //Select hotel
		     clickOnElement(pom.getInstanceSl().getBox());
		     clickOnElement(pom.getInstanceSl().getOk());
		    
		     //book hotel
		     String firstname =File_Reader_Manager.getInastanceFRM().getInstanceCR().getfirstname();
		     sendkeys(pom.getInstanceBh().getFirstname(),firstname);
		     String lastname =File_Reader_Manager.getInastanceFRM().getInstanceCR().getlastname();
		     sendkeys(pom.getInstanceBh().getLastname(),lastname);
		     String address =File_Reader_Manager.getInastanceFRM().getInstanceCR().getaddress();
		     sendkeys(pom.getInstanceBh().getAddres(),address);
		     String cardno =File_Reader_Manager.getInastanceFRM().getInstanceCR().getcardno();
		     sendkeys(pom.getInstanceBh().getCardno(),cardno);
		     String cardname =File_Reader_Manager.getInastanceFRM().getInstanceCR().getcardname();
		     sendkeys(pom.getInstanceBh().getCardname(),cardname);
		     String month =File_Reader_Manager.getInastanceFRM().getInstanceCR().getmonth();
		     sendkeys(pom.getInstanceBh().getMonth(),month);
		     String year =File_Reader_Manager.getInastanceFRM().getInstanceCR().getyear();
		     sendkeys(pom.getInstanceBh().getYear(),year);
		     String ccvno =File_Reader_Manager.getInastanceFRM().getInstanceCR().getccvno();
		     sendkeys(pom.getInstanceBh().getCcvno(),ccvno);
		     clickOnElement(pom.getInstanceBh().getBook());
		     Takescreenshot();
		}
	
}
