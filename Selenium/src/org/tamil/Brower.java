package org.tamil;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Brower {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
	
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=18154141793999023828&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA2sqOBhCGARIsAPuPK0i3e3G9t_ufVpXveiIP0GFzgbuVxcHY-U1e0bbosHOkeB2rtoyuHhQaAjOMEALw_wcB");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		driver.get("https://www.instagram.com/accounts/login/");

		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("tamil1234@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("etb3wet");
		
		//WebElement log = driver.findElement(By.name("login"));
		//log.click();
		
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = pass.isEnabled();
		System.out.println(enabled);
		
		boolean selected = pass.isSelected();
		System.out.println(selected);
		

		
	}

}
