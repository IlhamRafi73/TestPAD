import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;

//    @Test
//    public void test(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("http://10.33.35.38:8000/auth/login");
//        WebElement login = driver.findElement(By.id("login_btn"));
//        login.click();
//
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//
//        String expectedUrl = "http://10.33.35.38:8000/admin/insight";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl, expectedUrl);
//
//        WebElement text = driver.findElement(By.xpath("//*[contains(text(), 'Congratulations')]"));
//        text.isDisplayed();
//
//        WebElement textlogout = driver.findElement(By.xpath("//*[contains(text(), 'Log out')]"));
//        textlogout.isDisplayed();
//
//    }

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://10.33.35.38:8000/auth/login");
    }

    @BeforeMethod
    public void setUpMethod(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testLoginPage() {
        String expectedUrlSubstring = "http://10.33.35.38:8000/auth/login";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(expectedUrlSubstring), "URL does not contain expected substring: " + expectedUrlSubstring);

        WebElement login = driver.findElement(By.id("login_btn"));
        login.click();
    }

    @Test(dependsOnMethods = "testLoginPage")
    public void testVerifyNewPageURL() {
        String expectedUrlSubstring = "http://10.33.35.38:8000/admin/insight";
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertTrue(currentUrl.contains(expectedUrlSubstring), "URL does not contain expected substring: " + expectedUrlSubstring);
    }
}