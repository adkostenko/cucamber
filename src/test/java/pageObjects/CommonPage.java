package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import utils.LocalDriver;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class CommonPage {
    WebDriver driver;
    Wait<WebDriver> wait;

    public CommonPage() {
        this.driver = new LocalDriver().LocalDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class);
    }

    /**
     * Important, KEEP IT. USE IT
     */
    public void waitForPageLoad() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Current Window State       : "
                        + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }

    public WebElement getClickableElement(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement getElement(By locator) {
        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }

//    public void sendKeysRedefined(WebElement element, String value, int delay){
//        try {
//            Thread.sleep(delay*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        element.sendKeys(value);
//    }

    public List<WebElement> getElements( By locator) {
        return wait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });
    }

    public void quit(){
        driver.close();
    }

    public void navigate(String arg0) {
        driver.navigate().to(arg0);
    }

    public void waitFor(String arg0) {
        System.out.println(arg0);
        try {
            Thread.sleep(Integer.parseInt(arg0)*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

