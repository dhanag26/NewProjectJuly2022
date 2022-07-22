package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation {
	
	public static WebDriver driver=null;
	
	public static void browserLaunch(Object[]inputparameters)
	{
	try
	{
		String bname=(String)inputparameters[0];
		String exe=(String)inputparameters[1];
	
		if(bname.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",exe);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
		else if(bname.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver",exe);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	public static void openApplication(Object[]inputparameters)
	{
		try
		{
		
		String URL=(String) inputparameters[0];
		driver.get(URL);	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	public static void clickonElement(Object[]inputparameters) throws InterruptedException
		{
		
		try {
		String XPATH=(String) inputparameters[0];
		driver.findElement(By.xpath(XPATH)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	public static void mouseOver(Object[]inputparameters)
	{
		try
		{
		String XPATH=(String) inputparameters[0];
		Actions act=new Actions(driver);
		WebElement abc=driver.findElement(By.xpath(XPATH));
		act.moveToElement(abc).build().perform();	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	public static void sendkeys(Object[]inputparameters)
	{
		try
		{
		String XPATH=(String) inputparameters[0];
		String value1=(String) inputparameters[1];
		driver.findElement(By.xpath(XPATH)).sendKeys(value1);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			
		}
		
	}
		
		public static void validationByGetText(Object[] inputparameters)
		{
			try
			{
			String GivenText=(String) inputparameters[0];
			String Locator=(String) inputparameters[1];
		String capturedText=driver.findElement(By.xpath(Locator)).getText();
		
		if(GivenText.equalsIgnoreCase(capturedText))	
		{
			System.out.println("Test Case Pass");
			
		}
		else
		{
			
			System.out.println("Test Case Fail");
		}
		}catch(Exception e)
			{
			System.out.println(e);
			}
}
}


/*

		
		
	
public static void main(String[]args) throws InterruptedException
{

//browser launch
	Object[] input=new Object[2];
	input[0]="webdriver.chrome.driver";
	input[1]="D:\\AutomationSupportnew\\chromedriver.exe";
	SeleniumOperation.browserLaunch(input);
			
			//openAppilication
	
	Object[] input1=new Object[1];
	input1[0]="https://www.flipkart.com/";
	SeleniumOperation.openApplication(input1);
	
	
	//clickonElemet
	Object[] input2=new Object[1];
	input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	SeleniumOperation.clickonElement(input2);
	
	//mouseover
	
	Object[] input3=new Object[1];
	input3[0]="//*[@class='_1_3w1N']";
	SeleniumOperation.mouseOver(input3);
	
	//clickonElement
	Object[] input4=new Object[1];
	input4[0]="//*[text()='My Profile']";
	SeleniumOperation.clickonElement(input4);
	
			//enter usernaame
	Thread.sleep(5000);
	Object[] input5=new Object[2];
	input5[0]="(//*[@type='text'])[2]";
	input5[1]="jadhav.dhanshree01@gmail.com";
	SeleniumOperation.sendkeys(input5);
	
	//enterpassword
	
	Object[] input6=new Object[2];
	input6[0]="//*[@type='password']";
	input6[1]="dhanag26";
	SeleniumOperation.sendkeys(input6);
	
	//clickonlogin
	
	Object[] input7=new Object[1];
	input7[0]="(//*[@type='submit'])[2]";
	SeleniumOperation.clickonElement(input7);
	
	//validationby hello word
	Object[] input8=new Object[2];
	input8[0]="Hello";
	input8[1]="//*[@class='_2QZ3Er']";
	SeleniumOperation.sendkeys(input8);
}
}

	
	
			
			//SeleniumOperation.browserLaunch("webdriver.chrome.driver", "D:\\\\AutomationSupportnew\\\\chromedriver.exe");
			//SeleniumOperation.openApplication("https://www.flipkart.com/");
			//SeleniumOperation.clickonElement("//*[@class='_2KpZ6l _2doB4z']");
			//SeleniumOperation.mouseOver("//*[@class='_1_3w1N']");
		//SeleniumOperation.clickonElement("//*[text()='My Profile']");
			//SeleniumOperation.sendkeys("//*[@type='text'])[2]", "jadhav.dhanshree01@gmail.com");
			
			*/
			
		
	
		
		
	
	
	
	
	


