package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failedrun.txt"
		},
			
		glue = {"parallel"},
		
		features = {"src/test/resources/parallel"}
		
	
		
//		features = {"@target/failedrun.txt"}
		)



public class RunAmazonTest extends AbstractTestNGCucumberTests {

}
