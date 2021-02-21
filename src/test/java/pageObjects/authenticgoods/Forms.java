package pageObjects.authenticgoods;

import pageObjects.CommonPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Forms extends CommonPage {

    public Forms() {
        super();
    }

    public void verifyFormComponentsOnTheWebPage() {
        By locator = By.cssSelector( "h1");
        Assert.assertEquals(getElement(locator).getText(),"Form Components");
    }

    public void setEmail(String value) {
       By locator = By.id("exampleInputEmail1");
       getElement(locator).sendKeys(value);
    }

    public void setPassword( String arg0 ) {
        By locator = By.id("exampleInputPassword1");
        getElement(locator).sendKeys(arg0);
    }

    public void setFile(String arg0) {
        By locator = By.id( "exampleInputFile" );
        getElement( locator ).sendKeys( "/Users/alonakostenko/Downloads/06.pdf");

    }

    public void clickOnSubmitButton( String arg0 ) {
        By locator = By.cssSelector("form[class='ng-pristine ng-valid'] button[type='submit']");
        getElement( locator ).click();
    }

    public void clickOnExtendButton( String arg0 ) {
        By locator = By.cssSelector( "div[class='col-md-12'] i[class='fa fa-expand']" );
        getElement( locator ).click( );
    }

    public void setInputSuccess( String arg0 ) {
        By locator = By.cssSelector( "#inputSuccess1" );
        getElement( locator ).sendKeys( arg0 );
    }

    public void setInputWarning( String arg0 ) {
        By locator = By.cssSelector( "#inputWarning1" );
        getElement( locator ).sendKeys( arg0 );
    }

    public void setInputError( String arg0 ) {
        By locator = By.cssSelector( "#inputError1" );
        getElement( locator ).sendKeys( arg0 );
    }


    public void verifyCustomCheckboxesAndRadios( ) {
        By locator = By.cssSelector( "body section[id='main-wrapper'] div[class='ng-scope'] div[class='ng-scope'] div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) h3:nth-child(1)" );
        Assert.assertEquals(getElement(locator).getText(),"Custom Checkboxes and Radios");
    }

    public void selectOption3InRadio() {
        By locator = By.cssSelector( "div[class='iradio_flat-grey checked'] ins[class='iCheck-helper']" );
        getElement( locator ).click();
    }

    public void selectInCheckbox(String value) {
        By locator = By.cssSelector( "div[class='icheckbox_flat-grey checked'] ins[class='iCheck-helper']" );
        getElement( locator ).click();
    }


    public void selectInInlineCheckbox( String arg0 ) {
        By locator = By.cssSelector("label.checkbox-inline:nth-child(1) > div.icheckbox_flat-grey:nth-child(1) > ins" );
        getElement( locator ).click();
    }
}
