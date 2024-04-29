#Author: Vibhor

@login @regression
Feature: WebDriver University - Login Page

  Background:
    Given I access the webdriver university login page

  @login-success
  Scenario: Validate Successful Login
    When I enter a username webdriver
    And I enter a password webdriver123
    And I click on the login button
    Then I should be presented with the successful login message "validation succeeded"

  Scenario: Validate Unsuccessful Login
    When I enter a username webdriver
    And I enter a password invalidpwd123
    And I click on the login button
    Then I should be presented with the unsuccessful login message "validation failed"


   @smoke
  Scenario Outline: Validate - Successful & Unsuccessful Login
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with follwing login validation message <popupmessagetext>

    Examples:
      | username  | password      | popupmessagetext     |
      | webdriver | webdriver123  | validation succeeded |
      | webdriver | invalidpwd123 | validation failed    |
      | invalidUN | invalidpwd123 | validation failed    |



