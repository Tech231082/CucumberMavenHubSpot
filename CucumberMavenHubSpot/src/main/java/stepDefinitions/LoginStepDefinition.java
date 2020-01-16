package stepDefinitions;

import com.qa.base.BasePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition extends BasePage{
	
	LoginPage loginPage=new LoginPage();
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	   loginPage.initialization();
	   
	}

	@Then("Title of the login page is")
	public void title_of_the_login_page_is() {
		System.out.println("The title of login page is : "+loginPage.validateLoginPageTitle());
	    
	}

	@Then("User enters username and password")
	public void user_enters_username_and_password() {
	    
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
	   
	}



}
