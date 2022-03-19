package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws IOException {
	File f = new File("C:\\Users\\tamil\\eclipse-workspace\\Maven__12\\src\\main\\java\\com\\properties\\Configuration.properties");
	FileInputStream fis = new FileInputStream(f);
	p=new Properties();
	p.load(fis);
	}
	public String geturl() throws IOException {
		String url = p.getProperty("url");
		return url;
	}
	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password =p.getProperty("password");
		return password;
	}
	public String getlocation() {
		String location =p.getProperty("location");
		return location;
	}
	public String gethotel() {
		String hotel =p.getProperty("hotel");
		return hotel;
	}
	public String getroom() {
		String room =p.getProperty("room");
		return room;
	}
	public String getroomsno() {
		String roomsno =p.getProperty("roomsno");
		return roomsno;
	}
	public String getdate() {
		String date =p.getProperty("date");
		return date;
	}
	public String getdateout() {
		String dateout =p.getProperty("dateout");
		return dateout;
	}
	public String getadult() {
		String adult =p.getProperty("adult");
		return adult;
	}
	public String getchild() {
		String child =p.getProperty("child");
		return child;
	}
	public String getfirstname() {
		String firstname =p.getProperty("firstname");
		return firstname;
	}
	public String getlastname() {
		String lastname =p.getProperty("lastname");
		return lastname;
	}
	public String getaddress() {
		String address =p.getProperty("location");
		return address;
	}
	public String getcardno() {
		String cardno =p.getProperty("cardno");
		return cardno;
	}
	public String getcardname() {
		String cardname =p.getProperty("cardname");
		return cardname;
	}
	public String getmonth() {
		String month =p.getProperty("month");
		return month;
	}
	public String getyear() {
		String year =p.getProperty("year");
		return year;
	}
	public String getccvno() {
		String ccvno =p.getProperty("ccvno");
		return ccvno;
	}
}
