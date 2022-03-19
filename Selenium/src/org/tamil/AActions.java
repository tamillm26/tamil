package org.tamil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AActions {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=18154141793999023828&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA2sqOBhCGARIsAPuPK0i3e3G9t_ufVpXveiIP0GFzgbuVxcHY-U1e0bbosHOkeB2rtoyuHhQaAjOMEALw_wcB");
		//driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(2000);
		
		Actions a = new Actions(driver); 
		
		/*WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		a.moveToElement(dresses).build().perform();
		
		WebElement summer = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		a.moveToElement(summer).build().perform();
		
		a.click(summer).build().perform();*/
		
		WebElement amazon  = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		a.moveToElement(amazon).build().perform();
		
		WebElement singin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		a.click().build().perform();
		
		
		
	}

}
