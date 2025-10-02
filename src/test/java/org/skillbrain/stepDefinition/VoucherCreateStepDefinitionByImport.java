package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.VoucherPageImport;
import org.skillbrain.utilities.TestContextSetup;
import org.testng.Assert;

public class VoucherCreateStepDefinitionByImport {
    public VoucherPageImport voucherPageImport;
    private final TestContextSetup testContextSetup;


    public VoucherCreateStepDefinitionByImport(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        voucherPageImport = testContextSetup.pageObjectFactory.getVoucherPageImport();
    }

    @And("I fill the Name box with {string}")
    public void iFillTheNameBoxWithVoucherName(String voucherName) {
        voucherPageImport.FillVoucherBoxName((voucherName));
    }

    @And("I fill the value of the discount {string} in the text box Discount")
    public void iFilTheValueOfTheDiscountInTheTextBoxDiscount(String discount) {
        voucherPageImport.FillDiscountBox(discount);
    }

    @Then("I fill the box for import codes from {string}  and press Import button")
    public void iFillTheBoxForImportCodesFromAndPressImportButton(String file) {
        voucherPageImport.ImportTxtFile(file);
    }


    @And("I fill the Name box test with {string}")
    public void iFillTheNameBoxTestWith(String arg0) {
        voucherPageImport.FillVoucherBoxName("VTest1");

    }

    @And("I fill the value of the discount {string} in the text box discount")
    public void iFillTheValueOfTheDiscountInTheTextBoxDiscount(String arg0) {
        voucherPageImport.FillDiscountBox("22.5");
    }

    @Then("I fill the box Add code with series {string} and press Add button")
    public void iFillTheBoxWithSeriesSeriesAndPressAddButton(String arg0) {
        voucherPageImport.FillAddCodeBox("124gt");
    }
    @And("I click Save button")
    public void iClickSaveButton() {
        voucherPageImport.ClickSaveButton();
    }



    @Then("I check if the voucher {string} appears in list")
    public void iCheckIfTheVoucherAppearsInList(String voucher ) {
        voucherPageImport.verifyVoucherPresence(voucher);
    }

    @Then("Delete the voucher {string}")
    public void deleteTheVoucher(String arg0) {
        voucherPageImport.deleteVoucher();
    }
    @And("Press on Continue button")
    public void pressOnContinueButton() {
        voucherPageImport.pressContinueButton();
    }

    @Then("Fill in mandatory fields with First name, Last name, email, company and position")
    public void fillInMandatoryFieldsWithFirstNameLastNameEmailCompanyAndPosition() {

        voucherPageImport.fillInMandatoryFields();
    }

    @And("Press on Continue2 button")
    public void pressOnContinue2Button() {
        voucherPageImport.pressContinue2Button();
    }


    @Then("The result is <voucherName>")
    public void theResultIsVoucherName() {
    }

    @Then("Fill in mandatory fields with email, name, country, state and adress")
    public void fillInMandatoryFieldsWithEmailNameCountryStateAndAdress() {
        voucherPageImport.fillInMandatoryFieldsForPayment();

    }

    @And("Choose autoprocess method for payment and click Pay button")
    public void chooseAutoprocessMethodForPaymentAndClickPayButton() {
        voucherPageImport.selectPaymentAndPay();
    }
}
