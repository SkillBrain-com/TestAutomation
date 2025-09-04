package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.VoucherPageImport;
import org.skillbrain.utilities.TestContextSetup;

public class VoucherCreateStepDefinitionByImport {
    public VoucherPageImport voucherPageImport;
    private final TestContextSetup testContextSetup;


    public VoucherCreateStepDefinitionByImport(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        voucherPageImport= testContextSetup.pageObjectFactory.getVoucherPageImport();
    }



    @And("I fill the Name box with {string}")
    public void iFillTheNameBoxWith(String args) {
        voucherPageImport.FillVoucherBoxName();
    }

    @And("I fil the value of the discount {string} in the text box Discount")
    public void iFilTheValueOfTheDiscountInTheTextBoxDiscount(String arg0) {
        voucherPageImport.FillDiscountBox();
    }
    
    @Then("I fill the box for import codes with the path of the .txt files and press Import button")
    public void iFillTheBoxForImportCodesWithThePathOfTheTxtFiles() {
        voucherPageImport.ImportTxtFile();
    }


    @And("I click Save button")
    public void iClickSaveButton() {
        voucherPageImport.ClickSaveButton();
    }

    @Then("I check if the vouchers have been saved")
    public void iCheckIfTheVouchersHaveBeenSaved() {
        voucherPageImport.CheckedSavedVouchers();
    }


}
