package org.tamil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Insta {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Drivers\\chromedriver_win32.zip");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement mail = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		mail.sendKeys("tamilthangavel12345@gmail.com");
		Thread.sleep(3000);
		WebElement cr = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		cr.click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("tamil");
		WebElement sname = driver.findElement(By.xpath("//input[@name='lastname']"));
		sname.sendKeys("thangavel");
		WebElement id = driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]"));
		id.sendKeys("123tamil");
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("6559++45");
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		WebElement yr = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select a = new Select(day);
		Select b = new Select(month);
		Select c = new Select(yr);
		
		a.selectByValue("18");
		Thread.sleep(2000);
		b.selectByIndex(7);
		c.selectByValue("1999");
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		boolean multiple = a.isMultiple();
		boolean multiple2 = b.isMultiple();
		boolean multiple3 = c.isMultiple();
		
		System.out.println(multiple);
		System.out.println(multiple2);
		System.out.println(multiple3);
		
		Thread.sleep(3000);
		driver.close();
		
        WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.facebook.com/");
		
		
		//WebElement log = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div[2]/button"));
		//log.click();
		
		WebElement mail1 = driver1.findElement(By.xpath("//input[@type='text']"));
		mail1.sendKeys("tamil1234");
		
		Thread.sleep(2000);
		
		WebElement pass1 = driver1.findElement(By.xpath("//input[@aria-label='Password']"));
		pass1.sendKeys("uytfug");
		
		WebElement img = driver1.findElement(By.xpath("//img[@alt='Facebook']"));
		String text = img.getText();
		System.out.println(text);
		
		WebElement text1 = driver1.findElement(By.xpath("//h2[contains(text(),'helps')]"));
		String text2 = text1.getText();
		System.out.println(text2);
		
		WebElement text3 = driver1.findElement(By.xpath("//div[@class='_58mk']"));
		String text4 = text3.getText();
		System.out.println(text4);
		
		WebElement log = driver1.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		
		driver1.close();
		
		Thread.sleep(3000);
		
        
		WebDriver driver2 = new ChromeDriver();
		
		driver2.get("https://www.instagram.com/accounts/login/");
		
		driver2.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement id1 = driver2.findElement(By.xpath("(//input[@autocapitalize='off'])[1]"));
		id1.sendKeys("Thangavel144");
		
		WebElement pass2 = driver2.findElement(By.xpath("(//input[@autocorrect='off'])[2]"));
		pass2.sendKeys("827065");
		
		Thread.sleep(3000);
		
		WebElement sing = driver2.findElement(By.xpath("//div[text()='Log In']"));
		sing.click();
		
	}

}
