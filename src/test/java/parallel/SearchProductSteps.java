package parallel;



import pages.LoginPage;
import pages.SearchProduct;
import qa.DriverFactory;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps {
	
	SearchProduct searchproduct = new SearchProduct(DriverFactory.getDriver());

//@Given("user is already logged in with {string} and {string}")
//public void user_is_already_logged_in_with_and(String un, String pwd) {
//    
//	DriverFactory.getDriver().get("https://www.amazon.in/");
//		
//	 searchproduct = loginpage.doLogin(un, pwd);
//	
//	
//}

@When("user the text {string} and search")
public void user_the_text_and_search(String text) {
  searchproduct.enterProduct(text);
}

@Then("mobile phone should get display")
public void mobile_phone_should_get_display() {
  
	String title = searchproduct.verifyMobile();
	
	boolean ispresent = title.contains("mobile");
	
	Assert.assertTrue(ispresent);
	
}

}
