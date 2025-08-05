package org.skillbrain.stepDefinition;

import io.cucumber.java.en.Then;
import org.skillbrain.page.HomePage;
import org.skillbrain.page.LoginPage;
import org.skillbrain.utilities.TestContextSetup;

public class HomePageStepDefinition {

    private TestContextSetup testContextSetup;
    private HomePage homePage;

    public HomePageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        homePage = testContextSetup.pageObjectFactory.getHomePage();
    }


    @Then("Check user is logged in")
    public void check_user_is_logged_in() {
        homePage.checkUserIsLoggedIn();
    }

}
