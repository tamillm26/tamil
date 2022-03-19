package org.tamil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		
		Select a = new Select(multi);
		
		a.selectByValue("2");
		a.selectByValue("3");
		a.selectByValue("4");
		
		Thread.sleep(2000);
	
		a.deselectByValue("3");
		
		List<WebElement> b = a.getAllSelectedOptions();
		
		for (WebElement c : b) {
			
			System.out.println(c.getText());
			
		}
	
		WebElement firstSelectedOption = a.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

}
