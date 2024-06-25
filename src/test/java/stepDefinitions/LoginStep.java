package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginStep {
    @Given("the user is on the login page")
    public void UserIsOnLoginPage() {
        Assert.assertTrue("User is not on the correct URL", LoginPage.isOnCorrectUrl());
    }

    @When("the user enters valid credentials")
    public void UserEntersValidCredentials() {
        LoginPage.sendkeys_username();
        LoginPage.sendkeys_password();
    }

    @And("the user clicks on the login button")
    public void UserClicksOnLoginButton() {
        LoginPage.click_login_btn();
    }
}
