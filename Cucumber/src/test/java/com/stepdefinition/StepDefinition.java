package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.runner.Test_Runner;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mavan.com.Maven__12.Base_Class;

public class StepDefinition extends mavan.com.Cucumber.Base_Class {

	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
	    
		String url = File_Reader_Manager.getInastanceFRM().getInstanceCR().geturl();
		geturl(url);
	}

	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String arg1) throws Throwable {
	    
		String username = File_Reader_Manager.getInastanceFRM().getInstanceCR().getusername();
		sendkeys(pom.getInstanceLp().getUsername(),username);
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String arg1) throws Throwable {
	 
		 String password = File_Reader_Manager.getInastanceFRM().getInstanceCR().getpassword();
			sendkeys(pom.getInstanceLp().getPassword(),password);
	}

	@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	   
		clickOnElement(pom.getInstanceLp().getLogin());
	}

	@When("^user Select The \"([^\"]*)\" Location Field$")
	public void user_Select_The_Location_Field(String arg1) throws Throwable {
	 
		String location = File_Reader_Manager.getInastanceFRM().getInstanceCR().getlocation();
	     sendkeys(pom.getInstanceSh().getLocation(),location);
	}

	@When("^user Select The \"([^\"]*)\" Hotel Field$")
	public void user_Select_The_Hotel_Field(String arg1) throws Throwable {
	    
		String hotel =File_Reader_Manager.getInastanceFRM().getInstanceCR().gethotel();
	     sendkeys(pom.getInstanceSh().getHotels(),hotel);
	}

	@When("^user Select The \"([^\"]*)\" Room Type Field$")
	public void user_Select_The_Room_Type_Field(String arg1) throws Throwable {
	    
		 String room =File_Reader_Manager.getInastanceFRM().getInstanceCR().getroom();
	     sendkeys(pom.getInstanceSh().getRoom(),room);
	}

	@When("^user Select The \"([^\"]*)\" Children Per Room field$")
	public void user_Select_The_Children_Per_Room_field(String arg1) throws Throwable {
	    
	    String child =File_Reader_Manager.getInastanceFRM().getInstanceCR().getchild();
	     sendkeys(pom.getInstanceSh().getChild(),child);
	}

	@When("^user Select The \"([^\"]*)\" NoOf Rooms Field$")
	public void user_Select_The_NoOf_Rooms_Field(String arg1) throws Throwable {
	  
	    String roomno =File_Reader_Manager.getInastanceFRM().getInstanceCR().getroomsno();
	     sendkeys(pom.getInstanceSh().getRoomsno(),roomno);
	}

	@When("^user Select The \"([^\"]*)\" Adult Per Room field$")
	public void user_Select_The_Adult_Per_Room_field(String arg1) throws Throwable {
	   
		 String adult =File_Reader_Manager.getInastanceFRM().getInstanceCR().getadult();
	     sendkeys(pom.getInstanceSh().getAdult(),adult);
	}

	@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	 
	    clickOnElement(pom.getInstanceSh().getSumbmit());
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {
	    
		   clickOnElement(pom.getInstanceSl().getBox());
	}

	@Then("^user Click The Continue Button And It Navigates To The Booking Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Booking_Page() throws Throwable {

	    clickOnElement(pom.getInstanceSl().getOk());
	}

	@When("^user Enter The First Name In The Firstname Field$")
	public void user_Enter_The_First_Name_In_The_Firstname_Field() throws Throwable {
	    
		  String firstname =File_Reader_Manager.getInastanceFRM().getInstanceCR().getfirstname();
		     sendkeys(pom.getInstanceBh().getFirstname(),firstname);
	}

	@When("^user Enter The Last Name In The Lastname Field$")
	public void user_Enter_The_Last_Name_In_The_Lastname_Field() throws Throwable {
	    
	     String lastname =File_Reader_Manager.getInastanceFRM().getInstanceCR().getlastname();
	     sendkeys(pom.getInstanceBh().getLastname(),lastname);
	}

	@When("^user Enter The Address In The Address Field$")
	public void user_Enter_The_Address_In_The_Address_Field() throws Throwable {
	 
	     String address =File_Reader_Manager.getInastanceFRM().getInstanceCR().getaddress();
	     sendkeys(pom.getInstanceBh().getAddres(),address);
	}

	@When("^user Enter The Credit Card No In The Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_The_Credit_Card_No_Field() throws Throwable {
	   
	     String cardno =File_Reader_Manager.getInastanceFRM().getInstanceCR().getcardno();
	     sendkeys(pom.getInstanceBh().getCardno(),cardno);
	}

	@When("^user Select The \"([^\"]*)\" In The Credit Card Type Field$")
	public void user_Select_The_In_The_Credit_Card_Type_Field(String arg1) throws Throwable {
	    
		   String cardname =File_Reader_Manager.getInastanceFRM().getInstanceCR().getcardname();
		     sendkeys(pom.getInstanceBh().getCardname(),cardname);
	}

	@When("^user Select The \"([^\"]*)\" Expiry Month field$")
	public void user_Select_The_Expiry_Month_field(String arg1) throws Throwable {
	   
	     String month =File_Reader_Manager.getInastanceFRM().getInstanceCR().getmonth();
	     sendkeys(pom.getInstanceBh().getMonth(),month);
	}

	@When("^user Select The \"([^\"]*)\" Expiry Year field$")
	public void user_Select_The_Expiry_Year_field(String arg1) throws Throwable {
		
	     String year =File_Reader_Manager.getInastanceFRM().getInstanceCR().getyear();
	     sendkeys(pom.getInstanceBh().getYear(),year);
	}

	@When("^user Enter The CWV No In The CWV No Field$")
	public void user_Enter_The_CWV_No_In_The_CWV_No_Field() throws Throwable {
	   
	     String ccvno =File_Reader_Manager.getInastanceFRM().getInstanceCR().getccvno();
	     sendkeys(pom.getInstanceBh().getCcvno(),ccvno);
	}

	@Then("^user Click The Book Now Button And It Navigates To The Logout Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
	   
	     clickOnElement(pom.getInstanceBh().getBook());
	}
	
}
	
	