package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static String login_button_xpath = "" ;
    public static String username_field_xpath = "" ;
    public static String password_field_xpath = "" ;
    public static String expected_url = "http://10.33.35.38:8000/auth/login";

    public static void sendkeys_username() {
        driver.findElement(By.xpath(username_field_xpath)).sendKeys("");
    }

    public static void sendkeys_password(){
        driver.findElement(By.xpath(password_field_xpath)).sendKeys("");
    }

    public static void sendkeys_wrongusername() {
        driver.findElement(By.xpath(username_field_xpath)).sendKeys("");
    }

    public static void sendkeys_wrongpassword(){
        driver.findElement(By.xpath(password_field_xpath)).sendKeys("");
    }

    public static void click_login_btn(){
        driver.findElement(By.xpath(login_button_xpath)).click();
    }

    public static boolean isOnCorrectUrl() {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.equals(expected_url);
    }
}
