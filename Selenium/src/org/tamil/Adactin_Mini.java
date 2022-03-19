package org.tamil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Adactin_Mini {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.xpath("(//input)[1]"));
		user.sendKeys("thangavelv");
		
		WebElement pass = driver.findElement(By.xpath("(//input)[2]"));
		pass.sendKeys("1234554321");
	
		WebElement login = driver.findElement(By.xpath("(//input)[3]"));
		login.click();
	
		Robot r = new Robot();
		
		Actions a = new Actions(driver);
		
		WebElement loc = driver.findElement(By.xpath("(//select)[1]"));
		
		a.moveToElement(loc).build().perform();
		a.click(loc).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement hot = driver.findElement(By.xpath("(//select)[2]"));
		
		a.moveToElement(hot).build().perform();
		a.click(hot).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement room = driver.findElement(By.xpath("(//select)[3]"));
		
		a.moveToElement(room).build().perform();
		a.click(room).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
		WebElement rooms = driver.findElement(By.xpath("(//select)[4]"));
	
		a.moveToElement(rooms).build().perform();
		a.click(rooms).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
		WebElement sdate = driver.findElement(By.xpath("(//input)[2]"));
		
		a.moveToElement(sdate).build().perform();
		a.click(sdate).build().perform();
		
		sdate.sendKeys("21/02/2022");
		
		WebElement ldate = driver.findElement(By.xpath("(//input)[3]"));
		
		a.moveToElement(ldate).build().perform();
		a.click(ldate).build().perform();
		
		ldate.sendKeys("23/02/2022");
		
		WebElement adult = driver.findElement(By.xpath("(//select)[5]"));
		
		a.moveToElement(adult).build().perform();
		a.click(adult).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement child = driver.findElement(By.xpath("(//select)[6]"));
		
		a.moveToElement(child).build().perform();
		a.click(child).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		WebElement search = driver.findElement(By.xpath("(//input)[4]"));
		search.click();
		
		Thread.sleep(2000);
		
		WebElement tick = driver.findElement(By.xpath("(//input)[1]"));
		tick.click();
		
		Thread.sleep(3000);
		
		WebElement finish = driver.findElement(By.xpath("//input[@type='submit']"));
		finish.click();
		
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.xpath("(//input)[11]"));
		fname.sendKeys("tamil");
		
		WebElement lname = driver.findElement(By.xpath("(//input)[12]"));
		lname.sendKeys("thangavel");
		
		WebElement address = driver.findElement(By.xpath("//textarea"));
		address.sendKeys("4/419,Middle st, kommanthgel,thiruvallur");
		
		WebElement cardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		cardno.sendKeys("1234567890098765");
		
		WebElement cardtype = driver.findElement(By.xpath("(//select)[1]"));
		
		a.moveToElement(cardtype).build().perform();
		a.click(cardtype).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement exdate = driver.findElement(By.xpath("(//select)[2]"));
		
		a.moveToElement(exdate).build().perform();
		a.click(exdate).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement exyr = driver.findElement(By.xpath("(//select)[3]"));
		
		a.moveToElement(exyr).build().perform();
		a.click(exyr).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement ccv = driver.findElement(By.xpath("(//input)[14]"));
		ccv.sendKeys("123");
		
		WebElement booknow = driver.findElement(By.xpath("(//input)[15]"));
		booknow.click();
	
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dist = new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Screenshot\\pic3.png");
		 FileUtils.copyFile(src, dist);
		
		
	}
}
