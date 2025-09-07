package org.skillbrain.stepDefinition.echipa1.oveithubsteps;

import org.skillbrain.page.echipa1.oveithub.OveitHubTicketsPage;
import org.skillbrain.utilities.TestContextSetup;

public class OveitHubTicketsStepDefinition {

    private TestContextSetup testContextSetup;
    private OveitHubTicketsPage oveitHubTickets;

    public OveitHubTicketsStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        oveitHubTickets = testContextSetup.pageObjectFactory.getOveitHubTickets();
    }


}