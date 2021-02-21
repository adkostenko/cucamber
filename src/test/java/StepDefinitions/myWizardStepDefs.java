package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.myWizard;

public class myWizardStepDefs {
    myWizard wizard = new myWizard();

    @Given("Navigate to Wizard")
    public void navigateToWizard( ) {
        wizard.navigate();
    }

    @Given("Fill out {string}")
    public void fillOutFirstName( String FirstName ) {
        wizard.FirstName(FirstName);

    }


    @Then("Fill out <LastName>")
    public void fillOutLastName() {
        wizard.LastName();

    }

    @Then("Click {string}")
    public void clickNext() {
        wizard.clickNext();


    }

    @Then("Fill out <Street Address>")
    public void fillOutStreetAddress() {
        wizard.StreetAddress();

    }

    @Then("Fill out <City>")
    public void fillOutCity() {
        wizard.City();

    }

    @Then("Fill out <State>")
    public void fillOutState() {
        wizard.State();

    }

    @Then("Fill out <Zip>")
    public void fillOutZip() {

        wizard.Zip();
    }

    @Then("{string}")
    public void submit() {

        wizard.submit();
    }


}
