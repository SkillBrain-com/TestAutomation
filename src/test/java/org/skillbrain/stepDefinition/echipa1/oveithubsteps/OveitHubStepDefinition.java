package org.skillbrain.stepDefinition.echipa1.oveithubsteps;

import org.skillbrain.page.echipa1.oveithub.OveitHubPage;
import org.skillbrain.utilities.TestContextSetup;

public class OveitHubStepDefinition {

    private TestContextSetup testContextSetup;
    private OveitHubPage oveitHubPage;

    public OveitHubStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        oveitHubPage = testContextSetup.pageObjectFactory.getOveitHub();
    }


}