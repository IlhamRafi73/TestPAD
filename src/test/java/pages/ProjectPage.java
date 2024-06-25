package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ProjectPage extends BrowserDriver {
    public static String create_button_xpath = "" ;
    public static String projectname_field_xpath = "" ;

    public static void sendkeys_projectname(){
        driver.findElement(By.xpath(projectname_field_xpath)).sendKeys("");
    }

    public static void click_login_btn(){
        driver.findElement(By.xpath(create_button_xpath)).click();
    }
}
