
@Regression @Sanity
Feature: Invalid Email

  Scenario: verify that invalid email are identified
    Given I click on SignIn
    And I enter username as mayur
    And I enter password as Test@1234
    And I click on Sign In button
    Then I verify that invalid email error message is shown to user
    
