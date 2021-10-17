package stepdefinition;

import org.openqa.selenium.By;


import BrowserEbay.BrowserEbay;

import Pages.RegisterBusinessAccount;

import Pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import readdata.ReadData1;



public class StepDefinition extends BrowserEbay{
	
	//scenario1 to create personal account
		
	@Given("User is on home page")
	public void browser_is_open(){
		
		//call to BrowserEbay
		try {
		String url = ReadData1.config("url");
		setDriver1(url); 
		System.out.println("Step 1.1 passed");
		}
		catch(Exception e) {
			System.out.println("Step 1.1 failed");
		}
 
    }

	@And("User is able to click on register link")
	public void user_is_able_to_click_on_register_link(){
	
	  //go to signup page
		try {
	     SignUpPage.clickRegister1();
	     System.out.println("Step 1.2 passed");
		}
		catch(Exception e) {
			System.out.println("Step 1.2 failed");
		}
		
	}
	
	@When("User clicks on register link sign up page is visible")
	public void user_clicks_on_register_link_sign_up_page_is_visible() {
	   
	}

	@And("User able to create an account")
	public void user_able_to_create_an_account() {
	    
	}

	@When("User clicks on Personal account radio button")
	public void user_clicks_on_personal_account_radio_button() {
	   
	}

	@And("Enters required valid credentials")
	public void enters_required_valid_credentials() throws InterruptedException {
		try {
		Locators.firstname().sendKeys(ReadData1.readExcel(1, 0));
		Locators.lastname().sendKeys(ReadData1.readExcel(1, 1));
		Locators.email().sendKeys(ReadData1.readExcel(1, 2));
		Locators.password().sendKeys(ReadData1.readExcel(1, 3));
		Thread.sleep(70000);
		System.out.println("Step 1.3 passed");
		}
		catch(Exception e) {
			System.out.println("Step 1.3 failed");
		}

	}

	@Then("User able to register to the application successfully")
	public void user_able_to_register_to_the_application_successfully() {
	   // Locators.register();
		try {
		String Register_button_personal = ReadData1.config("Register_button_personal");
		driver.findElement(By.id(Register_button_personal)).click();
		System.out.println("Step 1.4 passed : Registration successful");
		}
		catch(Exception e) {
			System.out.println("Step 1.4 failed");
		}
	    Locators.closeBrowser();
	}
	
	//scenario2 to create business account
	
	@Given("User is on the home page")
	public void browser_is_on_open(){
		try {
		String url = ReadData1.config("url");
		setDriver1(url);
		System.out.println("Step 2.1 passed");
		}
		catch(Exception e) {
			System.out.println("Step 2.1 failed");
		}
	}
	@And("User is able to click on register link on home page")
	public void user_is_able_to_click_on_register_link_on_home_page() {
		try {
		SignUpPage.clickRegister1();
		System.out.println("Step 2.2 passed");
		}
		catch(Exception e) {
			System.out.println("Step 2.2 failed");
		}
	}

	@When("User clicks on the register link sign up page is visible")
	public void user_clicks_on_the_register_link_sign_up_page_is_visible() {
	    
	}

	@And("User able to create an account on sign up page")
	public void user_able_to_create_an_account_on_sign_up_page() {
	   
	}
	
	@When("User clicks on Business account radio button")
	public void user_clicks_on_business_account_radio_button() {
		
		//click on register business account radio button
		try {
		RegisterBusinessAccount.clickonbusinessaccount1();
		System.out.println("Step 2.3 passed");
		}
		catch(Exception e) {
			System.out.println("Step 2.3 failed");
		}

	}

	@And("Enters required valid credentials in given text box")
	public void enters_required_valid_credentials_in_given_text_box() throws InterruptedException {
		
		//enter valid business name, email, password, location
		//RegisterBusinessAccount.entercredentials12();
		try {
		Locators.businessName().sendKeys(ReadData1.readExcel(4, 0));
		Locators.businessEmail().sendKeys(ReadData1.readExcel(4, 1));
		Locators.businessPassword().sendKeys(ReadData1.readExcel(4, 2));
		Thread.sleep(50000);
		Locators.selectCountry().sendKeys(ReadData1.readExcel(4, 3));
		Locators.checkBox().click();
		System.out.println("Step 2.4 passed");
		}
		catch(Exception e) {
			System.out.println("Step 2.4 failed");
		}

	}

	@Then("User able to register to the application successfully using business account")
	public void user_able_to_register_to_the_application_successfully_using_business_account() {
		try {
		Locators.registerBusinessAccount();
		System.out.println("Step 2.5 passed : Registration successful");
		Locators.closeBrowser1();
		
		}
		catch(Exception e) {
			System.out.println("Step 2.5 failed");
		}
	  
	}
}