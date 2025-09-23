package org.skillbrain.stepDefinition.echipa1.defaulthubsteps;

import org.skillbrain.page.echipa1.defaulthub.DefaultHubCheckOutPage;
import org.skillbrain.utilities.TestContextSetup;

public class DefaultHubCheckOutStepDefinition {

    private TestContextSetup testContextSetup;
    private DefaultHubCheckOutPage defaultHubCheckOut;

    public DefaultHubCheckOutStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        defaultHubCheckOut = testContextSetup.pageObjectFactory.getDefaultHubCheckOut();
    }


}