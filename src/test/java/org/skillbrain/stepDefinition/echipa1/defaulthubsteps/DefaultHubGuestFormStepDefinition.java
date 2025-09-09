package org.skillbrain.stepDefinition.echipa1.defaulthubsteps;

import org.skillbrain.page.echipa1.defaulthub.DefaultHubGuestFormPage;
import org.skillbrain.utilities.TestContextSetup;

public class DefaultHubGuestFormStepDefinition {

    private TestContextSetup testContextSetup;
    private DefaultHubGuestFormPage DefaultHubGuestFormPage;

    public DefaultHubGuestFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        DefaultHubGuestFormPage = testContextSetup.pageObjectFactory.getDefaultHubGuestForm();
    }


}