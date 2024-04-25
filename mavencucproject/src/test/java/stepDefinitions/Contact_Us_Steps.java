package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Base_PO;
import pageObject.Contact_Us_PO;


public class Contact_Us_Steps extends Base_PO {

    private Contact_Us_PO contact_us_po;

    //way to use dependency injection inside a step definition class
    public Contact_Us_Steps(Contact_Us_PO contact_us_po) {
        this.contact_us_po = contact_us_po ;
    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        System.out.println("gvn");
        contact_us_po.navigateTo_WebDriverUniversity_Contact_Us_Page();
    }


    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        System.out.println("stp1");
        contact_us_po.set_FirstName("AutoFN"+generateRandomNumber(3));
    }


    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        System.out.println("stp2");
        contact_us_po.set_LastName("AutoLN"+generateRandomNumber(3));
    }


    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        System.out.println("stp3");
        contact_us_po.set_Email("AutoEmail"+generateRandomNumber(5)+"@gmail.com");
    }


    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        System.out.println("stp4");
        contact_us_po.set_Comment("Hello "+ generateRandomString(10));
    }


    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        System.out.println("stp5");
        contact_us_po.clickOn_Submit_Button();
    }


    @Then("I should be presented with a successful contact us submission message {string}" )
    public void i_should_be_presented_with_a_successful_contact_us_submission_message(String expectedMessage) {
        System.out.println("rslt");
        contact_us_po.validate_Successful_SubmissionMessage_Text(expectedMessage);
    }


    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        System.out.println("scnario2stp1");
        contact_us_po.set_FirstName(firstName);

    }


    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        System.out.println("scnario2stp2");
        contact_us_po.set_LastName(lastName);

    }


    @And("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        System.out.println("scnario2stp3");
        contact_us_po.set_Email(email);

    }


    @And("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        System.out.println("scnario2stp4nayajenkinsrun6");
        contact_us_po.set_Comment(comment);

    }
}



