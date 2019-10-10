package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
		//create driver object for chrome browser
		// Class name - ChromeDriver
		
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		System.out.println(driver.getTitle());
	}

}
