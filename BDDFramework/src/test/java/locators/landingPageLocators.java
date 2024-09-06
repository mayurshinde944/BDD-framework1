package locators;

import org.openqa.selenium.By;

import Utilities.WebDriverActions;

public class landingPageLocators extends WebDriverActions  {
	private By signIn = By.xpath("//a[@href='/sign-in']");
	
	public void clickSignIn()
	{
		waitUntilElementToBeClickable(signIn).click();
	}

}
