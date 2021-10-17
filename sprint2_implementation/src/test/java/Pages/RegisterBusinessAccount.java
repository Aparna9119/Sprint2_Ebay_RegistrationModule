package Pages;

import locators.Locators;

public class RegisterBusinessAccount{

	public static void clickonbusinessaccount1() {
		
		//click on business account radio button
		Locators.clickonbusinessaccount();
	}
		public static void entercredentials12() throws InterruptedException {
			Locators.businessName().sendKeys("Ebay");
			Locators.businessEmail().sendKeys("aparnagore378@gmail.com");;
			Locators.businessPassword().sendKeys("Aparna@0909");
			Thread.sleep(50000);
			Locators.selectCountry().sendKeys("India");
			Locators.checkBox().click();
			Locators.registerBusinessAccount();
		}
}
