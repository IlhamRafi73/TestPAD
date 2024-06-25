package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class DashboardPage extends BrowserDriver {
    public static String dashboard_heading_xpath = "//*[contains(text(),'Please create or select a project first.')]" ;
    public static String expected_url = "http://10.33.35.38:8000/admin/dashboard";

    public static String visibility_headingDashboard() throws InterruptedException{
        Thread.sleep(3000);
        String actualDashboardHeader = driver.findElement(By.xpath(dashboard_heading_xpath)).getText();
        return actualDashboardHeader;
    }

    public static boolean isOnCorrectUrl() throws InterruptedException{
        Thread.sleep(3000);
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.equals(expected_url);
    }

}
