package com.runnerclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import mavan.com.Maven__12.Base_Class;

public class Run extends Base_Class {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	browser_lunch();
	geturl("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=17697236331784171089&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMIpJuqhrLb9QIVkzY4Ch0-5wCHEAAYASAAEgLk1PD_BwE");
	WebElement mobile = driver.findElement(By.xpath("(//a[@tabindex='0'])[5]"));
	mobile.click();
	WebElement elec = driver.findElement(By.xpath("//a[text()='Electronics']"));
	elec.click();
	Thread();
	WebElement page = driver.findElement(By.xpath("//a[text()='2']"));
	page.click();
	Thread();
	navigateback();
	geturl("http://www.leafground.com/");
	WebElement frame = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[10]"));
	frame.click();
	close();
	browser_lunch();
	
	geturl("http://www.leafground.com/pages/Alert.html");
	WebElement fa = driver.findElement(By.xpath("(//button)[1]"));
	fa.click();
	driver.switchTo().alert().accept();
	Thread();
	WebElement cb = driver.findElement(By.xpath("(//button)[2]"));
	cb.click();
	driver.switchTo().alert().accept();
	Thread();
	WebElement pb = driver.findElement(By.xpath("(//button)[3]"));
	pb.click();
	driver.switchTo().alert().sendKeys("yes");
	driver.switchTo().alert().accept();
	Thread();
	WebElement lb = driver.findElement(By.xpath("(//button)[4]"));
	lb.click();
	driver.switchTo().alert().accept();
	Thread();
	WebElement sweet = driver.findElement(By.xpath("(//button)[5]"));
	sweet.click();
	Thread();
	WebElement hb = driver.findElement(By.xpath("(//button)[6]"));
	hb.click();
	Thread();
	navigateback();
	
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
	WebElement search = driver.findElement(By.id("Submit"));
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
	
	Takescreenshot();
	
	
	
	
	
	
	}
}