package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Vars;

public class Contact_Us_PO extends Base_PO{

    private @FindBy( xpath = "//input[@name='first_name']" )
    WebElement firstName_TextField;

    private @FindBy(how = How.XPATH, using = "//input[@name='last_name555']")
    WebElement lasttName_TextField;

    private @FindBy(how = How.XPATH, using = "//input[@name = \"email\"]")
    WebElement email_TextField;

    private @FindBy(how = How.XPATH, using = "//textarea[@name = \"message\"]")
    WebElement comment_TextField;

    private @FindBy(how = How.XPATH, using = "//input[@value = \"SUBMIT\"]")
    WebElement submit_Button;

    private @FindBy(how = How.XPATH, using = "//input[@value = 'RESET']")
    WebElement reset_Button;

    public @FindBy(how = How.XPATH, using = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmission_Element;


    public Contact_Us_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Us_Page() {
        navigateTo_URL( Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }

    public void set_FirstName(String firstName) {
        sendKeys(firstName_TextField,firstName );
    }

    public void set_LastName (String lastName) {
        sendKeys(lasttName_TextField,lastName );
    }

    public void set_Email (String email) {
        sendKeys(email_TextField,email );
    }

    public void set_Comment (String comment) {
        sendKeys(comment_TextField,comment );
    }


    public void clickOn_Submit_Button() {
        waitForWebElementAndClick(submit_Button);
    }

    public void clickOn_Reset_Button() {
        waitForWebElementAndClick(reset_Button);
    }

    public void validate_Successful_SubmissionMessage_Text(String expectedMessage) {

        waitFor(successfulSubmission_Element);
        String message = successfulSubmission_Element.getText();
        Assert.assertEquals(message,expectedMessage );
    }


}


