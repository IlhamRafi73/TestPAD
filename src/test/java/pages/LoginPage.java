package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static String login_button_xpath = "//*[@id=\"login_btn\"]" ;
    public static String username_field_xpath = "//*[@id=\"email\"]" ;
    public static String password_field_xpath = "//*[@id=\"password\"]" ;

    public static void sendkeys_username() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(username_field_xpath)).sendKeys("");
    }

    public static void sendkeys_password() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field_xpath)).sendKeys("");
    }

    public static void click_login_btn() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_xpath)).click();
    }

    public static void navigate_to_login_page(){
        driver.get("http://10.33.35.38:8000/auth/login");
    }
}
