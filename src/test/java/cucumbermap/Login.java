package cucumbermap;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperation;

public class Login
{
	@When ("^user open browser \"(.*)\" with exe as \"(.*)\"$")
	public void bLaunch(String bname, String exe) throws Throwable {
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperation.browserLaunch(input);  
	    
	}

	@When ("^user enter url as \"(.*)\"$")
	public void user_enter_url_as(String url) throws Throwable {
		Object[] input1=new Object[2];
		input1[0]=url;
		SeleniumOperation.openApplication(input1);
	    
	}
	
	@When("user cancal initial login window")
	public void user_cancal_initial_login_window() throws InterruptedException {
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperation.clickonElement(input2);
	    
	}

	@When("user navigate on login button")
	public void user_navigate_on_login_button() {
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumOperation.mouseOver(input3);
	   
	}

	@When("user click on My Profile")
	public void user_click_on_my_profile() throws InterruptedException {
		Object[] input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		SeleniumOperation.clickonElement(input4);
	}

	@When("user enter {string} as username")
	public void user_enter_as_username(String string) {
		Object[] input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]="jadhav.dhanshree01@gmail.com";
		SeleniumOperation.sendkeys(input5);
	   
	}

	@When("user enter {string} as password")
	public void user_enter_as_password(String string) {
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]="dhanag26";
		SeleniumOperation.sendkeys(input6);
	    
	}

	@When("user click on Login button")
	public void user_click_on_login_button() throws InterruptedException {
		Object[] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		SeleniumOperation.clickonElement(input7);

	}

	@Then("Application shows user profile to user")
	public void application_shows_user_profile_to_user() {
		Object[] input8=new Object[2];
		input8[0]="Hello";
		input8[1]="//*[@class='_2QZ3Er']";
		SeleniumOperation.sendkeys(input8);
	  
	}



}
