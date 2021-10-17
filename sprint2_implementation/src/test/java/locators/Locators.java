package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserEbay.BrowserEbay;

public class Locators extends BrowserEbay {

	//scenario1 to register through personal account
	public static void clickRegister() {
		WebElement clickregister = driver.findElement(By.xpath("//a[@href='https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F']"));
		clickregister.click();
	}
	
	public static WebElement firstname() {
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstname']"));
		return fname;
	}
	
	public static WebElement lastname() {
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastname']"));
		return lname;
	}
	
	public static WebElement email() {
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		return email;
	}
	
	public static WebElement password() {
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		return pass;
	}
	
	public static void register() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]"))).click();
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	//scenario2 to register through business account
	public static void clickonbusinessaccount() {
		//to select business account radio button
		driver.findElement(By.xpath("//input[@id='businessaccount-radio']")).click();	
	}
	
	public static WebElement businessName() {
		WebElement bname = driver.findElement(By.xpath("//input[@id='businessName']"));
		return bname;
	}
	
	public static WebElement businessEmail() {
		WebElement bemail = driver.findElement(By.xpath("//input[@id='businessEmail']"));
		return bemail;
	}
	
	public static WebElement businessPassword() {
		WebElement bpass = driver.findElement(By.xpath("//input[@id='bizPassword']"));
		return bpass;
	}
	
	public static WebElement selectCountry() {
		WebElement country = driver.findElement(By.xpath("//select[@id='businessCountry']"));
		return country;
	}
	
	public static WebElement checkBox() {
		WebElement country = driver.findElement(By.xpath("//input[@id='bizOnlyToBuy']"));
		return country;
	}
	
	public static void registerBusinessAccount() {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"BUSINESS_REG_FORM_SUBMIT\"]"))).click();
	}
	
	public static void closeBrowser1() {
		driver.close();
	}
}
