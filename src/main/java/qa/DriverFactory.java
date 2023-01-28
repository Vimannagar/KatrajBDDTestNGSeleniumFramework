package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	static WebDriver driver;
	
	public void initBrowser(String browsername)
	{
		if(browsername.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
	}

}
