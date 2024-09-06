package locators;

import org.openqa.selenium.By;

import Utilities.WebDriverActions;

import org.junit.Assert;

public class registerPageLocators extends WebDriverActions {
	private By userName = By.id("email");

	private By passWord = By.id("password");

	private By loginButton = By.xpath("//button[@type='submit']");

	private By profileManagement = By.xpath("//a[@href='/profile']");

	private By email = By.xpath("//input[@name='email']");
	
	private By invalidEmail = By
			.xpath("//div[@class='invalid-feedback' and text()='Invalid email address']");


	private By invalidPassword = By
			.xpath("//div[@class='invalid-feedback' and text()='Password must be at least 8 characters']");

	public void enterUsername(String username) {
		waitUntilvisibilityOfElementLocated(userName).sendKeys(username);

	}

	public void enterPassword(String password) {
		waitUntilvisibilityOfElementLocated(passWord).sendKeys(password);

	}

	public void clickLogInButton() {
		waitUntilElementToBeClickable(loginButton).click();
	}

	public void clickProfileManagement() {
		waitUntilElementToBeClickable(profileManagement).click();
	}

	public void clickEmail(String userName) {
		String userEmail = waitUntilvisibilityOfElementLocated(email).getText();
		Assert.assertEquals(userEmail, userName);
		;
	}
	public void verifyInvalidEmail() {
		Assert.assertTrue(waitUntilvisibilityOfElementLocated(invalidEmail).isDisplayed());

	}

	public void verifyInvalidPassword() {
		Assert.assertTrue(waitUntilvisibilityOfElementLocated(invalidPassword).isDisplayed());

	}

}
