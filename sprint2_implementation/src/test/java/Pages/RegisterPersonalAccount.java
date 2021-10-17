package Pages;

import locators.Locators;

public class RegisterPersonalAccount {

	public static void enterCredentials1() throws InterruptedException {
		Locators.firstname().sendKeys("Aparna");
		Locators.lastname().sendKeys("Gore");;
		Locators.email().sendKeys("aparnagore987@gmail.com");
		Locators.password().sendKeys("Aparna@9134");
        Thread.sleep(70000);
        Locators.register();
	}
}
