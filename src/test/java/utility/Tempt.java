package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {
	
	public static void main(String[]args) throws InterruptedException {
		//browserLaunch
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationSupportnew\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//openapplication
		driver.get("https://www.flipkart.com/");
		//canclelogin
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		//mouseover
		Actions act=new Actions(driver);
		
	WebElement abc=driver.findElementByXPath("//*[@class='_1_3w1N']");
	act.moveToElement(abc).build().perform();
	Thread.sleep(5000);
	//clickonlogin
	driver.findElementByXPath("//*[text()='My Profile']").click();
	Thread.sleep(5000);
	//enterusername
driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("jadhav.dhanshree01@gmail.com");
//enterpassword
	driver.findElementByXPath("//*[@type='password']").sendKeys("dhanag26");
	//clickonsub
	driver.findElementByXPath("(//*[@type='submit'])[2]").click();
	driver.findElementByXPath("//*[text()='Dhanshree Jadhav']");
	
	
		
		
		
	}
	
	

}
