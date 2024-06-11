package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserDriver {
    public  static WebDriver driver;

    public ChromeOptions options;

    public BrowserDriver(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "src/test/resources/driver/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("http://10.33.35.38:8000");
    }
    public void close(){
        this.driver.close();
    }
}