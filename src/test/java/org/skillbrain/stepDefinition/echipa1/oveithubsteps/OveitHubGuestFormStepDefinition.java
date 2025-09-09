package org.skillbrain.stepDefinition.echipa1.oveithubsteps;

import org.skillbrain.page.echipa1.oveithub.OveitHubGuestFormPage;
import org.skillbrain.utilities.TestContextSetup;

public class OveitHubGuestFormStepDefinition {

    private TestContextSetup testContextSetup;
    private OveitHubGuestFormPage oveitHubGuestForm;

    public OveitHubGuestFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        oveitHubGuestForm = testContextSetup.pageObjectFactory.getOveitHubGuestForm();
    }


}