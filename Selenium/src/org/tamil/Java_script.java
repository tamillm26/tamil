package org.tamil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\tamil\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=18037579302507721381&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAiA5t-OBhByEiwAhR-hmxKtwOESdmCnxT-bCbNnPTJUaY3oH58fk2302Jo-yur5lik-6L8qghoCPlUQAvD_BwE");
	
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement insta = driver.findElement(By.xpath("//a[text()='Instagram']"));
		
		js.executeScript("arguments[0], scrollIntoView()",insta);
		
		WebElement top = driver.findElement(By.xpath("(//a[@tabindex='0'])[9]"));
		
		js.executeScript("arguments[0], scrollIntoView()",top);
		
		
		
	
	}
}
