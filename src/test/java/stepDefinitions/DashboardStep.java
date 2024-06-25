package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.DashboardPage;

import static org.junit.Assert.assertEquals;

public class DashboardStep {

    @Then("the user should be redirected to the dashboard page")
    public void UserIsRedirectedToDashboardPage() throws Throwable {
        String actualDashboardHeader = DashboardPage.visibility_headingDashboard();
        assertEquals(actualDashboardHeader, "Please create or select a project first.");
    }
}
