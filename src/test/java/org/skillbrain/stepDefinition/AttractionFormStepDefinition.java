package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.AttractionForm;
import org.skillbrain.utilities.TestContextSetup;

public class AttractionFormStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionForm attractionForm;

    public AttractionFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionForm = testContextSetup.pageObjectFactory.getAttractionForm();
    }

}
