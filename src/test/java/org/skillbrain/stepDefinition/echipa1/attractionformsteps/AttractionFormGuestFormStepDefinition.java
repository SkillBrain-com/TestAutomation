package org.skillbrain.stepDefinition.echipa1.attractionformsteps;

import io.cucumber.java.en.And;
import org.skillbrain.page.echipa1.attractionform.AttractionFormGuestFormPage;
import org.skillbrain.utilities.TestContextSetup;

public class AttractionFormGuestFormStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionFormGuestFormPage attractionFormGuestForm;

    public AttractionFormGuestFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionFormGuestForm = testContextSetup.pageObjectFactory.getAttractionFormGuestForm();
    }

    @And("Fill the First Guest Custom Name Field with {string}")
    public void fillTheFirstGuestCustomNameFieldWith(String name) {
        attractionFormGuestForm.fillFirstGuestCustomNameField(name);
    }

}
