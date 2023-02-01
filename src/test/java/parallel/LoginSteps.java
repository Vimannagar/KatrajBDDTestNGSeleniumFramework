package parallel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import qa.DriverFactory;

public class LoginSteps {
	
	LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	static String title;
	
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
	  WebDriver driver = DriverFactory.getDriver();
	  driver.get("https://www.amazon.in/");
	  
	}

	@When("user get the title of page")
	public void user_get_the_title_of_page() {
	   
		 title = loginpage.getTitleOfPage();

		System.out.println(title);
		
	}

	@Then("page title should have {string}")
	public void page_title_should_have(String expectedtitle) {
	   
		boolean ispresent = title.contains(expectedtitle);
		
		Assert.assertTrue(ispresent);
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	    
		boolean isdiplaying = loginpage.isCartIconDisplayed();
		
		Assert.assertEquals(isdiplaying, true);
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	   
		loginpage.enterUsername(string);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	   
		loginpage.enterPassword(string);
	}

	@When("user confirm the signin")
	public void user_confirm_the_signin() {
	   loginpage.finalSignin();
	}


}
