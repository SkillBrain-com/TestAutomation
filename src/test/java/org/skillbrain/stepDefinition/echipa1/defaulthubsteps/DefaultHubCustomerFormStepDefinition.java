package org.skillbrain.stepDefinition.echipa1.defaulthubsteps;

import org.skillbrain.page.echipa1.defaulthub.DefaultHubCustomerFormPage;
import org.skillbrain.utilities.TestContextSetup;

public class DefaultHubCustomerFormStepDefinition {

    private TestContextSetup testContextSetup;
    private DefaultHubCustomerFormPage defaultHubCustomerFormPage;

    public DefaultHubCustomerFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        defaultHubCustomerFormPage = testContextSetup.pageObjectFactory.getDefaultHubCustomerForm();
    }


}