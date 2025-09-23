package org.skillbrain.stepDefinition.echipa1.merchantsteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.echipa1.merchant.StripePaymentPage;
import org.skillbrain.utilities.TestContextSetup;

import java.util.Map;

public class StripePaymentStepDefinition {

    private TestContextSetup testContextSetup;
    private StripePaymentPage stripePayment;

    public StripePaymentStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        stripePayment = testContextSetup.pageObjectFactory.getStripePayment();
    }

    @And("Fill all Payment fields with:")
    public void fillAllPaymentFieldsWith(DataTable table) {
        Map<String, String> data = table.asMaps(String.class, String.class).getFirst();

        stripePayment.fillPaymentMethod(
                data.get("email"),
                data.get("card nr"),
                data.get("card expiry"),
                data.get("card cvc"),
                data.get("cardholder name"),
                data.get("country"),
                data.get("zip")
        );
    }

    @And("Click the Pay Payment button")
    public void clickThePayPaymentButton() {
        stripePayment.clickPayPaymentButton();
    }

    @Then("Check if the simple order is completed")
    public void checkIfTheSimpleOrderIsCompleted() {
        stripePayment.assertOveitOrderCompleted();
    }
}