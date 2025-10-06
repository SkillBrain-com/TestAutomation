package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.page.VoucherPage;
import org.skillbrain.utilities.TestContextSetup;

public class VoucherCreateStepDefinition {
    public VoucherPage voucherPage;
    private final TestContextSetup testContextSetup;

    public VoucherCreateStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        voucherPage = testContextSetup.pageObjectFactory.getVoucherPage();
    }


    @And("I click on Create voucher button")
    public void iClickOnCreateVoucherButton() {
        voucherPage.CreateVoucherButtonClick();
    }

    @And("I input voucher's name")
    public void iInputVoucherSName() {
        voucherPage.FillVoucherName();
    }

    @And("I input voucher's discount")
    public void iInputVoucherSDiscount() {
        voucherPage.InputDiscountPercentage();
    }


    @When("I click on Save button")
    public void iClickOnSaveButton() {
        voucherPage.ClickSaveButton();
    }

    @Then("I check if the {string} appears in list")
    public void iCheckIfTheVouchersAppearsInList(String text) {
        voucherPage.verifyTextPresent(text);
    }

    @And("I input a code manually")
    public void iInputACodeManually() {
        voucherPage.InputaCode();
    }

    @Then("Delete the voucher")
    public void deleteTheVoucher() {
        voucherPage.deleteVoucher();
    }

    @Then("I Open Generator")
    public void iOpenGenerator() {
        voucherPage.OpenGenerator();
    }

    @And("I input number of codes")
    public void iInputNumberOfCodes() {
        voucherPage.setNumberOfCodes();
    }

    @And("I input code lenght")
    public void iInputCodeLenght() {
        voucherPage.leghtOfCodeSet();
    }

    @Then("I Generate codes")
    public void iGenerateCodes() {
        voucherPage.ConfirmGenerateCodes();
    }
}