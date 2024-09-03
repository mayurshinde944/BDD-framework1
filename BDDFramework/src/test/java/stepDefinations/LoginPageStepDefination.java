package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.landingPageLocators;
import locators.registerPageLocators;

public class LoginPageStepDefination {

	registerPageLocators register = new registerPageLocators();

	landingPageLocators landingpage = new landingPageLocators();

	@Given("^I click on SignIn$")
	public void clicksignIn() {
		landingpage.clickSignIn();
	}

	@And("^I enter username as (.*)$")
	public void enteruserName(String username) {
		register.enterUsername(username);

	}

	@And("^I enter password as (.*)$")
	public void enterPassword(String password) {
		register.enterPassword(password);
	}

	@And("^I click on Sign In button$")
	public void clickSignInButton() {
		register.clickLogInButton();
	}

//	@And("^I see the dashboard page$")
//	public void verifydashboardPage() {
//		register.clickLogInButton();

	//}
	@And("^I click on ProfileManagement$")
	public void clickProfileManagement()
	{
		register.clickProfileManagement();
	}
	
	@Then("^I see ProfileManagement Page$")
	public void verifyProfileManagement()
	{
		 
	}
	
	@Then("^I verify that invalid password error message is shown to user$")
			public void validateInavlidPasswordMessage()
			{
		     register.verifyInvalidPassword();
			}
	
	@Then("^I verify that invalid email error message is shown to user$")
	public void validateInavlidEmailMessage()
	{
     register.verifyInvalidEmail();
	}
}

