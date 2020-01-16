package stepDefinitions;

import com.qa.base.BasePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class LoginStepDefinition extends BasePage{
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	   loginPage.initialization();
	   loginPage=new LoginPage();
	   
	}

	@Then("Title of the login page is")
	public void title_of_the_login_page_is() {
		System.out.println("The title of login page is : "+loginPage.validateLoginPageTitle());
	    String title=loginPage.validateLoginPageTitle();
	    Assert.assertEquals("HubSpot Login", title);
	}

	@Then("User enters username and password")
	public void user_enters_username_and_password() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}

	@Then("User is on home page")
	public void user_is_on_home_page() {
	   System.out.println( "Home Page title is : "+driver.getTitle());
	}

	@Then("User closes the browser")
	public void user_closes_the_browser() {
		System.out.println("closing the browser......");
		driver.close();
	    
	}



}
