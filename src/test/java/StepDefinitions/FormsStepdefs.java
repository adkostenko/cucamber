package StepDefinitions;

import com.beust.jcommander.IValueValidator;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.authenticgoods.Forms;

public class FormsStepdefs {
    Forms forms = new Forms();

    @Given(":Navigate to {string} before test in testNG")
    public void navigateToBeforeTestInTestNG( String arg0 ) {
        forms.navigate( arg0 );

    }

    @Then("Verify Form Components on the web page")
    public void verifyFormComponentsOnTheWebPage() {
        forms.verifyFormComponentsOnTheWebPage();
    }

    @Then("Fill out email in email field: {string}")
    public void fillOutEmailInEmailField(String value) {
        forms.setEmail(value);
    }

    @Then("Fill out  password in password field :{string}")
    public void fillOutPasswordInPasswordField( String arg0 ) {
        forms.setPassword( arg0 );
    }

    @Then("Attach a file: {string}")
    public void attachAFile(String arg0) {
        forms.setFile(arg0);
    }

    @And("Click on the {string} button")
    public void clickOnTheSubmitButton(String value) {
        forms.clickOnSubmitButton(value);
    }

    @Given("Click on {string} button")
    public void clickOnExtendButton( String arg0 ) {
        forms.clickOnExtendButton( arg0 );
    }

    @Then("Fill out Input with success field: {string}")
    public void fillOutInputWithSuccessField( String arg0 ) {
        forms.setInputSuccess(arg0);
    }

    @Then("Fill out Input with warning field: {string}")
    public void fillOutInputWithWarningField( String arg0 ) {
        forms.setInputWarning(arg0);
    }

    @Then("Fill out Input with Error field: {string}")
    public void fillOutInputWithErrorField( String arg0 ) {
        forms.setInputError(arg0);
    }

    @Given("Verify Custom Checkboxes and Radios Form")
    public void verifyCustomCheckboxesAndRadiosForm() {
        forms.verifyCustomCheckboxesAndRadios();
    }

    @Then("Select {string} in Radio")
    public void selectInRadio( ) {
       forms.selectOption3InRadio();
    }

    @Then("Select {string} in Checkbox")
    public void selectInCheckbox( String arg0 ) {
        forms.selectInCheckbox(arg0);


    }

    @Then("Select {string} in Inline Checkbox")
    public void selectInInlineCheckbox( String arg0 ) {
        forms.selectInInlineCheckbox( arg0 );
    }

    @Given("Navigate to the URL: {string}")
    public void navigateToTheURL( String arg0 ) {
        forms.navigate( arg0 );
    }

    @After
    public void close(){
        forms.quit();
    }
}
