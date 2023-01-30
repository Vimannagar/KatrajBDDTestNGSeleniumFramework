package qa;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	public String readProp(String valuetoread)
	{
		 prop = new Properties();
		try {
		
			FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
			prop.load(fis);
		} 
		catch (IOException e) {
			System.out.println("Exception occurs while locating the property file");
		}
		
		String value= prop.getProperty(valuetoread);
		
		return value;
		
	
	}
	
	
	public static void main(String[] args) {
		
		
		ConfigReader cr = new ConfigReader();
		
		
	}
	
	

}
