package cucumbermap;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperation;

public class Login {
	@When("^user open browser \"(.*)\" with exe as \"(.*)\"$")
	public void bLaunch(String bname, String exe) throws Throwable {
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperation.browserLaunch(input);  
	    
	}

	@When("^user enter url as \"(.*)\"$")
	public void user_enter_url_as(String url) throws Throwable {
		Object[] input1=new Object[2];
		input1[0]=url;
		SeleniumOperation.openApplication(input1);
	    
	}

	@When("^user cancal initial login window$")
	public void user_cancal_initial_login_window() throws Throwable {
	    
	}

	@When("^user navigate on login button$")
	public void user_navigate_on_login_button() throws Throwable {
	    
	}

	@When("^user click on My Profile$")
	public void user_click_on_My_Profile() throws Throwable {

	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	    
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
	   ;
	}

	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable {
	    
	}



}
