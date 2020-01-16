package stepDefinitions;

import com.qa.base.BasePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class HomePageStepDefinition extends BasePage{
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Then("User is on base page")
	public void user_is_on_home_page() {
		initialization();
		   loginPage=new LoginPage();
		   homePage=new HomePage();
		   loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	   System.out.println( "Home Page title is : "+driver.getTitle());
	}
	
	@Then("User quits the browser")
	public void user_quits_the_browser() {
	   driver.close();
	}
	
	

	
}
