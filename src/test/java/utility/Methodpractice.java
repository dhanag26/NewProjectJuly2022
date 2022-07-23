package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Methodpractice {
	public static void main(String[]args) throws InterruptedException {
		//browserLaunch
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationSupportnew\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//openapplication
		driver.get("https://www.flipkart.com/");
		
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		Actions act=new Actions(driver);
		
		WebElement abc=driver.findElementByXPath("//*[@class='_1_3w1N']");
		act.moveToElement(abc).build().perform();
		Thread.sleep(5000);
		//clickonlogin
		driver.findElementByXPath("//*[text()='My Profile']").click();
		Thread.sleep(5000);
		
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("jadhav.dhanshree01@gmail.com",Keys.TAB);
		driver.findElementByXPath("//*[@type='password']").sendKeys("dhanag26");
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
	//	String Fwindow=driver.getWindowHandle();
		// Fwindow.chars();
		
		//driver.quit();

		/*	String URL=driver.getCurrentUrl();
		System.out.println(URL);
		*/
	/*	driver.navigate().to("https://www.facebook.com/");
		driver.close();
		
		*/
		
		
	}

}
