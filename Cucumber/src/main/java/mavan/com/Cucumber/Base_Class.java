 package mavan.com.Cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	
	//1.Browser launch
	public static WebDriver browser_lunch() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chromedriver_win32.zip");
	//2.driver
		return driver = new ChromeDriver();
	}
	
	//3.close
	public static void close() {

		driver.close();
		
	}
	
	//4.quit
	public static void quit() {

		driver.quit();
	}
	
	//5.navigations
	public static void navigteTo(String url) {

		driver.navigate().to(url);
	}
	
	public static void navigateback() {

		driver.navigate().back();
	}
	
	public static void navigateforward(String url) {

		driver.navigate().forward();
	}
	
	public static void navigaterefresh(String url) {

		driver.navigate().refresh();
		
	}
	
	//6.sleep
	public static void Thread() throws InterruptedException {

		Thread.sleep(3000);
		
	}
	
	//7.wait	
	public static void wait(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//8.robot
	public static void robot() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	//9.alert
	public static void alert(String string) {

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys(string);
		driver.switchTo().alert().getText();
	}
	
	//10.action
	public static void action(WebDriver driver,WebElement element) {

		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		a.contextClick(element).build().perform();
		a.doubleClick(element).build().perform();
		a.click(element).build().perform();
	}
	
	//11.scrollup
	public static void scroll_up(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollby(0,-2000)");
		
	}
	
	//12.scrolldown
	public static void scroll_down() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollby(0,2000)");
		
	}
	
	//13.frame
	public static void frame(String webelement) {

		driver.switchTo().frame(webelement);

	}

	//14.windowhandles
	public static void window_handles() {

		driver.getWindowHandles();
		
	}
	
	//15.click
    public static void clickOnElement(WebElement element) {
		
		element.click();
		
	}
    
    //16.geturl
    public static void geturl(String url) {

		driver.get(url);
		
	}
    
    //17.get current url
    public static void current_() {

    	String currentUrl = driver.getCurrentUrl();
    	System.out.println(currentUrl);
    	
	}
    
    //18.get options
    public static void getoptions() {

    	Select s = new Select(null);
    	List<WebElement> options = s.getOptions();
    	for (WebElement webElement : options) {
			System.out.println(webElement);
		}
	}
    
    //19.get title
    public static void gettitle(Object element) {

    	String title = driver.getTitle();
    	System.out.println(title);
	}
    
    //20.get text
    public static void gettext(WebElement a) {

    	a.getText();
    
	}
    
    //21.get attribute
    public static void getattribute(WebElement element, String url) {

    	element.getAttribute(url);
    	
	}
    
    //22.get all selected options
    public static void getallselectoption() {

    	Select s = new Select(null);
    	List<WebElement> options = s.getAllSelectedOptions();
    	for (WebElement webElement : options) {
			System.out.println(webElement);
		}
   
	}
    
    //23.isenable
    public static void isenable(WebElement is) {

    	boolean enabled = is.isEnabled();
    	System.out.println(enabled);
    	
	}
    
    //24.isdisplayed
    public static void isdisplayed(WebElement display) {

    	boolean displayed = display.isDisplayed();
    	System.out.println(displayed);
    	
	}
    
    //25.isselected
    public static void isselected(WebElement select) {

    	boolean selected = select.isSelected();
    	System.out.println(selected);
    	
	}
    
    //26.checkbox
    public static void checkbox(WebElement select) {

    	boolean selected = select.isSelected();
    	System.out.println(selected);
    	boolean enabled = select.isEnabled();
    	System.out.println(enabled);
    	boolean displayed = select.isDisplayed();
    	System.out.println(displayed);
    	
	}
    
    //27.ismultiple
    public static void ismultiple() {

    	Select s = new Select(null);
    	boolean multi = s.isMultiple();
    	System.out.println(multi);
	}
    
    //28.sendkeys
     public static void sendkeys(WebElement element,String value) {
	
	    element.sendKeys(value);

    }
     
     //29.takes screenshot
     public static void Takescreenshot() throws IOException {

     TakesScreenshot ts = (TakesScreenshot)driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File dist = new File("C:\\Users\\tamil\\eclipse-workspace\\Maven__12\\Screenshot\\snp.png");
	 FileUtils.copyFile(src, dist);
	 
     }
     
     //30.dropdown
     public static void dropdown(String type,WebElement element, String value) {

    	 Select s = new Select(element);
    	 if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		}
    	 else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		}
    	 else if (type.equalsIgnoreCase("byIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
	}
     
     
   
}
