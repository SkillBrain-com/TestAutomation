package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.page.VoucherPageImport;
import org.skillbrain.utilities.TestContextSetup;
import org.testng.Assert;

public class VoucherCreateStepDefinitionByImport {
    public VoucherPageImport voucherPageImport;
    private final TestContextSetup testContextSetup;


    public VoucherCreateStepDefinitionByImport(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        voucherPageImport= testContextSetup.pageObjectFactory.getVoucherPageImport();
    }

    @And("I fill the Name box with {string}")
    public void iFillTheNameBoxWith(String voucherName) {
        voucherPageImport.FillVoucherBoxName(voucherName);
    }

    @And("I fil the value of the discount {string} in the text box Discount")
    public void iFilTheValueOfTheDiscountInTheTextBoxDiscount(String discount) {
        voucherPageImport.FillDiscountBox(discount);
    }

    @Then("I fill the box for import codes from {string}  and press Import button")
    public void iFillTheBoxForImportCodesFromAndPressImportButton(String file) {
        voucherPageImport.ImportTxtFile(file);
    }

    @And("I click Save button")
    public void iClickSaveButton() {
        voucherPageImport.ClickSaveButton();
    }

    @Then("The result is {string}")
    public void theResultIsString( String voucherName) {

        boolean exists = voucherPageImport.isVoucherPresent(voucherName);

        if (exists) {
            System.out.println("Import reușit: voucherul \"" + voucherName + "\" a fost găsit în tabel.");
        } else {
            System.out.println("Import eșuat: voucherul \"" + voucherName + "\" NU a fost găsit în tabel.");
        }

        Assert.assertTrue(exists, "Voucherul " + voucherName + " nu a fost găsit în tabel!");
    }

}
