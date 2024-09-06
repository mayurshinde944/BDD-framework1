@Regression

Feature: Login page scenarios

Scenario: Verify that the login is scucessfull

Given I click on SignIn
And I enter username as mayur@gmail.com	
And I enter password as Test@1234
And I click on Sign In button
And I click on ProfileManagement
Then I see ProfileManagement Page
