@Sanity
Feature: invalid password

  Scenario: verify that invalid password are identified
    Given I click on SignIn
    And I enter username as mayur@gmail.com
    And I enter password as Test@12
    And I click on Sign In button
    Then I verify that invalid password error message is shown to user
