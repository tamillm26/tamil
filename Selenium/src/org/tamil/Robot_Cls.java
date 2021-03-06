package org.tamil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Cls {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=18154141793999023828&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA2sqOBhCGARIsAPuPK0i3e3G9t_ufVpXveiIP0GFzgbuVxcHY-U1e0bbosHOkeB2rtoyuHhQaAjOMEALw_wcB");
			
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Thread.sleep(3000);
		
        Actions a = new Actions(driver);
		
		a.moveToElement(mob).build().perform();
		a.doubleClick(mob).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement best = driver.findElement(By.xpath("(//a[@tabindex='0'])[5]"));
		
		a.moveToElement(best).build().perform();
		a.contextClick(best).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dist = new File ("C:\\Users\\tamil\\eclipse-workspace\\Selenium\\Screenshot\\pic1.png");
		FileUtils.copyFile(src, dist);
		
		
		Set<String> all = driver.getWindowHandles();
		
		for (String string : all) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
		
		String s = "Amazon.in Bestsellers: The most popular items on Amazon";
		
		for (String string2 : all) {
			
			if (driver.switchTo().window(string2).getTitle().equals(s)) {
               continue;
			}
			else {
				driver.close();
			}
		}
		
		
		/*WebElement search = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(search).build().perform();
		a.doubleClick(search).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		
	}
}
