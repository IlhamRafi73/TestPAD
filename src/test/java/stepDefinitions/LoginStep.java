package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.DashboardPage;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoginStep {
    @Given("the user is on the login page")
    public void UserIsOnLoginPage() {
        LoginPage.navigate_to_login_page();
    }

    @When("the user submit valid credentials")
    public void UserEntersValidCredentials() throws Throwable {
        LoginPage.sendkeys_username();
        LoginPage.sendkeys_password();
        LoginPage.click_login_btn();
    }
}
