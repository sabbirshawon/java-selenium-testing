package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//selenium code
				//create driver object for chrome browser
				// Class name - ChromeDriver
				
				//invoke .exe file first
				
		//gecko driver
		
		
				System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
				
				WebDriver driver = new FirefoxDriver();
				driver.get("http://digitawebs.com/sheltech/ver4/");
				System.out.println(driver.getTitle());

	}

}
