package BrowserEbay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserEbay {

	public static WebDriver driver;
	//Browser setup
	public void setDriver1(String url) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\APGORE\\OneDrive - Capgemini\\Desktop\\chromedriver.exe");
	     driver = new ChromeDriver();	
	     driver.get(url); //https://www.ebay.com/
	     driver.manage().window().maximize();    //maximizes the window
	}
}

