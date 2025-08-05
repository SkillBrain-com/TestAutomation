package org.skillbrain.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.page.LoginPage;
import org.skillbrain.utilities.TestContextSetup;

public class LoginStepDefinition {

    private TestContextSetup testContextSetup;
    private LoginPage loginPage;

    public LoginStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        loginPage = testContextSetup.pageObjectFactory.getLoginPage();
    }

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        loginPage.navigateToLogin();
    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.login();
    }

}
