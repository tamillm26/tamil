package org.tamil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\tamil\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
     
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement multi = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		multi.click();
		
		Thread.sleep(2000);
		
		WebElement big = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(big);
		
		Thread.sleep(2000);

		WebElement nextfrmae = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(nextfrmae);

		Thread.sleep(2000);

		WebElement msg = driver.findElement(By.xpath("//input[@type='text']"));
		msg.sendKeys("hi tamil");
		
	}

}
