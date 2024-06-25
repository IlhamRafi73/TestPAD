package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserDriver {
    public static WebDriver driver;
    public ChromeOptions options;

    public BrowserDriver(){
        driver = new ChromeDriver();
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
    }

    public void close(){
        driver.close();
    }
}
