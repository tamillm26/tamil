package org.tamil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		Thread.sleep(2000);
		
		WebElement simplealert = driver.findElement(By.xpath("(//button)[1]"));
		simplealert.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		WebElement confirmalert = driver.findElement(By.xpath("(//button)[2]"));
		confirmalert.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		WebElement promptalert = driver.findElement(By.xpath("(//button)[3]"));
		promptalert.click();
		
		driver.switchTo().alert().sendKeys("hi");
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		WebElement linkalert = driver.findElement(By.xpath("(//button)[4]"));
		linkalert.click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		WebElement sweetalert = driver.findElement(By.xpath("(//button)[5]"));
		sweetalert.click();
		Thread.sleep(2000);
		WebElement happy = driver.findElement(By.xpath("(//button)[6]"));
		happy.click();
		
		
		
	
	}
}
