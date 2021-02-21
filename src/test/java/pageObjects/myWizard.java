package pageObjects;

import org.openqa.selenium.By;

public class myWizard extends CommonPage {
    String URL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/#/forms/wizard/step_one";
    String [] value = {"First Name", "Last Name", "Street Address", "City", "State", "Zip"};

    public myWizard() {
        super();
    }
    
    public void navigate( ) {
        navigate( URL );
    }

    public void FirstName ( String value) {
        By locator = By.name("firstName");
        getElement(locator).sendKeys(value);

    }

    public void LastName() {
        By locator = By.name("lastName");
        getElement(locator).sendKeys(value);
    }

    public void clickNext() {
        By locator = By.cssSelector( "a[class='btn btn-primary ng-scope']" );
        getElement( locator ).click();
    }

    public void StreetAddress() {
        By locator = By.name("streetAddress");
        getElement(locator).sendKeys(value);
    }

    public void City() {
        By locator = By.name("city");
        getElement(locator).sendKeys(value);
    }

    public void State() {
        By locator = By.name("state");
        getElement(locator).sendKeys(value);
    }

    public void Zip() {
        By locator = By.name("postalCode");
        getElement(locator).sendKeys(value);
    }


    public void submit() {
        By locator = By.cssSelector( "button[class='btn btn-primary ng-scope']" );
        getElement( locator ).click();
    }
}
