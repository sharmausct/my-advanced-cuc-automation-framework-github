package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Base_PO;
import pageObject.Login_PO;


public class Login_Steps extends Base_PO {

    private Login_PO login_po ;

    //way to use dependency injection inside a step definition class
    public Login_Steps(Login_PO login_po) {
        this.login_po = login_po;
    }


    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        System.out.println("given of login feature");
        login_po.navigateToWebDriverUniversity_Login_Page();
    }

    @When("I enter a username {word}")
    public void i_enter_a_username(String userName) {
        System.out.println("step1 of login feature");
        login_po.setUsername(userName);
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
        System.out.println("step2 of login feature");
        login_po.setPassword(password);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        System.out.println("step3 of login feature");
        login_po.click_On_Login_Button();
    }

    @Then("I should be presented with the successful login message {string}")
    public void i_should_be_presented_with_the_successful_login_message(String popupMessageText) {
        System.out.println("result of login feature success");
        login_po.validate_Login_Message(popupMessageText);
    }

    @Then("I should be presented with the unsuccessful login message {string}")
    public void i_should_be_presented_with_the_unsuccessful_login_message(String popupMessageText) {
        System.out.println("result of login feature unsuccess");
        login_po.validate_Login_Message(popupMessageText);
    }

    @Then("I should be presented with follwing login validation message {}")
    public void i_should_be_presented_with_follwing_login_validation_message(String expectedMessage) {
        System.out.println("result of login feature success-unsuccess");
        waitForAlert_And_ValidateText(expectedMessage);
    }


}


