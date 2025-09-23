package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.page.HomePage;
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

    @When("I click on attractions sidebar")
    public void iClickOnAttractionsSidebar() {
        homePage.clickAttractionSidebar();
    }

    @And("I click on my attractions")
    public void iClickOnMyAttractions() {
        homePage.clickMyAttractions();
    }

    @And("Click the Create attraction button")
    public void iClickOnCreateAttractionButton() {
        homePage.createAttraction();
    }

    @When("I click on Vouchers")
    public void iClickOnVouchers() {
        homePage.clickVouchers();
    }


}
