package org.skillbrain.stepDefinition.echipa1.defaulthubsteps;

import org.skillbrain.page.echipa1.defaulthub.DefaultHubTicketsPage;
import org.skillbrain.utilities.TestContextSetup;

public class DefaultHubTicketsStepDefinition {

    private TestContextSetup testContextSetup;
    private DefaultHubTicketsPage defaultHubTicketsPage;

    public DefaultHubTicketsStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        defaultHubTicketsPage = testContextSetup.pageObjectFactory.getDefaultHubTickets();
    }


}