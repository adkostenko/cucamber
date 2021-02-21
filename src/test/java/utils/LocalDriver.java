package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    //download the webDriver and returns the Web driver
    public class LocalDriver {
        public WebDriver LocalDriver(){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
    }





    //or
    //public static void WebDriver LocalDriver(){
    //WebDriverManager.chromedriver().setup();
    //WebDriver driver = new ChromeDriver();






