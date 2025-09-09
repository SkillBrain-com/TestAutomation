package org.skillbrain.stepDefinition.echipa1.attractionformsteps;

import org.skillbrain.page.echipa1.attractionform.AttractionFormAdvancedPage;
import org.skillbrain.utilities.TestContextSetup;

public class AttractionFormAdvancedStepDefinition {

    private TestContextSetup testContextSetup;
    private AttractionFormAdvancedPage attractionFormAdvancedPage;

    public AttractionFormAdvancedStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        attractionFormAdvancedPage = testContextSetup.pageObjectFactory.getAttractionFormAdvanced();
    }


}