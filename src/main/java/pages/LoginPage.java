package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private	WebDriver driver;

	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	private WebElement   hoverelement;
	
	@FindBy(xpath = "//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']")
	private WebElement   signinhover;
	

	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement   carticon;
	

	private	By email = By.xpath("//*[@id='ap_email']");

	private	By continueemail = By.xpath("//*[@type='submit']");

	private	By passwordtext = By.xpath("//*[@id='ap_password']");

	private	By finalsignin = By.xpath("//*[@id='signInSubmit']");
		
		
		public LoginPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void enterUsername(String usname)
		{
			
			Actions act = new Actions(driver);
			
			act.moveToElement(hoverelement).perform();
			
			signinhover.click();
					
			driver.findElement(email).sendKeys(usname);
			
			driver.findElement(continueemail).click();
			
		}
		
		public void enterPassword(String pwd)
		{
			driver.findElement(passwordtext).sendKeys(pwd);
		}
		
		public void finalSignin()
		{
			driver.findElement(finalsignin).click();
		}
		
		public String getTitleOfPage()
		{
			String title = driver.getTitle();
			
			System.out.println(title);
			
			return title;
		}
		
		public boolean isCartIconDisplayed()
		{
			boolean isdisplay = carticon.isDisplayed();
			
			return isdisplay;
			
		}
		
		public SearchProduct doLogin(String un , String pwd)
		{
//			enter username 
			Actions act = new Actions(driver);
			
			act.moveToElement(hoverelement).perform();
			
			signinhover.click();
			
			driver.findElement(email).sendKeys(un);
			
			driver.findElement(continueemail).click();
			
//			enter password
			driver.findElement(passwordtext).sendKeys(pwd);
			
//			click on login
			
			driver.findElement(finalsignin).click();
			
			return new SearchProduct(driver);
		}
		
		

}
