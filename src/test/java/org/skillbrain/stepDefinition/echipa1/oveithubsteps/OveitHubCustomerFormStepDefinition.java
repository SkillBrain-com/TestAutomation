package org.skillbrain.stepDefinition.echipa1.oveithubsteps;

import org.skillbrain.page.echipa1.oveithub.OveitHubCustomerFormPage;
import org.skillbrain.utilities.TestContextSetup;

public class OveitHubCustomerFormStepDefinition {

    private TestContextSetup testContextSetup;
    private OveitHubCustomerFormPage oveitHubCustomerForm;

    public OveitHubCustomerFormStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        oveitHubCustomerForm = testContextSetup.pageObjectFactory.getOveitHubCustomerForm();
    }


}