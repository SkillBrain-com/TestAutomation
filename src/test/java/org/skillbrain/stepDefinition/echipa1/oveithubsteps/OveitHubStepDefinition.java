package org.skillbrain.stepDefinition.echipa1.oveithubsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.oveithub.OveitHubPage;
import org.skillbrain.utilities.TestContextSetup;

public class OveitHubStepDefinition {

    private TestContextSetup testContextSetup;
    private OveitHubPage oveitHubPage;

    public OveitHubStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        oveitHubPage = testContextSetup.pageObjectFactory.getOveitHub();
    }

    @And("Click the More button")
    public void publishAttraction() {
        oveitHubPage.clickOnMoreButton();
    }

    @And("Select Korean item from the language dropdown")
    public void languageDropdown() {
        oveitHubPage.clickOnLanguageDropdown();
    }

    @Then("Check if the hub language is set to Korean, and the {string} text is translated correct")
    public void checkIfTheHubLanguageIsSetToKoreanAndTheTextIsTranslatedCorrect(String label) {
        oveitHubPage.checkKoreanLanguage(label);
    }

    @And("Click the Share attraction button")
    public void clickTheShareAttractionButton() {
        oveitHubPage.clickShareAttractButton();
    }

    @Then("The modal with sharing options appear")
    public void theModalWithSharingOptionsAppear() {
        oveitHubPage.checkShareModal();
    }
}