package org.tamil;

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

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php");
	
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		
		WebElement woman = driver.findElement(By.xpath("//a[@title='Women']"));
		a.moveToElement(woman).build().perform();
		
		WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		a.moveToElement(casual).build().perform();
		a.click(casual).build().perform();
		
		WebElement add = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		a.moveToElement(add).build().perform();
		a.click(add).build().perform();
		
		Thread.sleep(4000);
		WebElement ptc = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		a.moveToElement(ptc).build().perform();
		a.click(ptc).build().perform();
	
		WebElement ptc1 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		a.moveToElement(ptc1).build().perform();
		a.click(ptc1).build().perform();
	
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    mail.sendKeys("thangaveltamil76@gmail.com");
		
		WebElement cr = driver.findElement(By.xpath("//i[contains(@class,'icon-user left')]"));
		cr.click();
		
		/*Thread.sleep(8000);
		WebElement mr = driver.findElement(By.xpath("(//input[@value='1'])[1]"));
		mr.click();
		
		WebElement fname = driver.findElement(By.xpath("(//input[@name='customer_firstname'])[1]"));
		fname.sendKeys("tamil");
		
		WebElement lname = driver.findElement(By.xpath("(//input[@name='customer_lastname'])[1]"));
		lname.sendKeys("thangavel");
		
		//WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		//email.sendKeys("thangaveltamil76@gmail.com");
		
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("t@12.?%^");
		
		WebElement cb= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	    cb.click();
	
	    WebElement fname1 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	    fname1.sendKeys("tamil");
	    
	    WebElement lname1 = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
	    lname1.sendKeys("thangavel");
		
		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		company.sendKeys("avery tech");
		
		WebElement addrs = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		addrs.sendKeys("4/123,kommanthagael,kasu st,pannur");
		
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		city.sendKeys("chennai");
		
		WebElement state = driver.findElement(By.xpath("(//select)[4]"));
		state.sendKeys("tamil nadu");
		
		WebElement pin = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		pin.sendKeys("00000");
		
		WebElement textarea = driver.findElement(By.xpath("//textarea"));
		textarea.sendKeys("8738372628");
		
		WebElement hno = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		hno.sendKeys("8738372628");
		
		WebElement mno = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		mno.sendKeys("9784723672");
		
		WebElement faddrs = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		faddrs.sendKeys("chennai");
		
		WebElement rig = driver.findElement(By.xpath("(//button)[2]"));
		rig.click();*/
		
		WebElement mail1 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		mail1.sendKeys("thangaveltamil76@gmail.com");
		
		WebElement pass1 = driver.findElement(By.xpath("//input[@type='password']"));
		pass1.sendKeys("t@12.?%^");
		
		WebElement singin = driver.findElement(By.xpath("(//button)[3]"));
	    singin.click();
	    
	    Thread.sleep(2000);
	    WebElement ptc2 = driver.findElement(By.xpath("(//button)[2]"));
	    ptc2.click();
	    
	    WebElement tac = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    tac.click();
	    
	    WebElement ptc3 = driver.findElement(By.xpath("(//button)[2]"));
	    ptc3.click();
	    
	    WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
	    pay.click();
	    
	    WebElement finish = driver.findElement(By.xpath("(//button)[2]"));
	    finish.click();
	  
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dist = new File("C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Screenshot\\pic2.png");
	    FileUtils.copyFile(src, dist);
	}
}
