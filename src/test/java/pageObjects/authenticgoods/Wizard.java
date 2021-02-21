package pageObjects.authenticgoods;

import pageObjects.CommonPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Wizard extends CommonPage {
    public static String URL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/#/forms/wizard/step_one";
    public Wizard() {
        super();
    }

    public void setFirstName(String value) {
        By locator = By.name("firstName");
        getElement(locator).sendKeys(value);
    }

    public void setLastName(String value) {
        By locator = By.name("lastName");
        getElement(locator).sendKeys(value);

    }

    public void pressNextButton() {
        By locator = By.cssSelector("[class='btn btn-primary ng-scope']");
        getElement(locator).click();

    }

    public void streetAddress( String arg0 ) {
        By locator = By.name("streetAddress");
        getElement(locator).sendKeys(arg0);
    }


    public void city( String arg1 ) {
        By locator = By.name("city");
        getElement(locator).sendKeys(arg1);
    }

    public void state( String arg2 ) {
        By locator = By.name("state");
        getElement(locator).sendKeys(arg2);
    }

    public void zip( String arg3 ) {
        By locator = By.name("postalCode");
        getElement(locator).sendKeys(arg3);
    }

    public void waitFor( int  arg0 ) {
        try {
            Thread.sleep( 5000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyStepLabel(String value) {
        waitForPageLoad();
        By locator = By.xpath("//h2[normalize-space()='" + value + "']");
        Assert.assertTrue(getElement(locator).isDisplayed(), "The label is not match");
    }

    public void checkFirstName(String arg0) {
        By locator = By.xpath("//*[normalize-space()='First Name:']/../p");
        Assert.assertEquals(getElement(locator).getText(), arg0, "First name doesn't match:" + "getting" +
                "this:" + getElement(locator).getText() + "instead of "+ arg0 );
    }
}
