package org.skillbrain.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.page.VoucherPage;
import org.skillbrain.utilities.TestContextSetup;

import static org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data;

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


    @When("I click on Save button")
    public void iClickOnSaveButton() {
        voucherPage.ClickSaveButton();
    }

    @Then("I check if the {string} appears in list")
    public void iCheckIfTheVouchersAppearsInList(String text) {
        voucherPage.verifyTextPresent(text);
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


    @And("I generate a code with each posible combination settings")
    public void iGenerateACodeWithEachPosibleCombinationSettings() {
        voucherPage.GenerateCodeEveryCase();
    }

    @Then("I check the codes if they respect the pattern")
    public void iCheckTheCodesIfTheyRespectThePattern() {
        voucherPage.verifyGeneratedCodes();

    }

    @Then("I input a {string} manually")
    public void iInputAManually(String code) {
        voucherPage.InputaCode(code);
    }

    //MARIA
    @Then("I Enter the name of the voucher")
    public void nameVoucher() {
        voucherPage.NameVoucher();
    }

    @And("I input voucher discount")
    public void discountVoucher() {
        voucherPage.DiscountVoucher();
    }

    @Then("Select the attraction for which the voucher applies")
    public void attractionVoucher() {
        voucherPage.AttractionVoucher();
    }

    @And("Add a code")
    public void voucherCode() {
        voucherPage.VoucherCode();
    }

    @Then("Enter the code")
    public void enterCode() {
        voucherPage.EnterCode();
    }
    // scenariu 3
    @And("Add a code with special characters")
    public void specialCode() {
        voucherPage.SpecialCode();
    }

    @And("Check if the error appears")
    public void errorMessage() {
        voucherPage.ErrorMessage();
    }


    @And("Verify if the code works")
    public void codeWorks() {
        voucherPage.CodeWorks("50% OFF");
    }


    @And("Check if the error with invalid code appears")
    public void codeIncorrect() {
        voucherPage.CodeIncorect("Invalid coupon code");
    }


    @Then("I input voucher's discount of {string} \\(STRING)")
    public void iInputVoucherSDiscountOfSTRING(String discount) {
        voucherPage.InputDiscountPercentageString(discount);
    }

    @Then("I check if mandatory fields error appears")
    public void iCheckIfMandatoryFieldsErrorAppears() {
        voucherPage.MandatoryFieldsErrorCheck();
    }

    @Then("I check if the duplicate code error appears.")
    public void iCheckIfICanHaveDuplicatesCode() {
        voucherPage.doublecodealert();
    }


    @Then("I input voucher's discount of {double}")
    public void iInputVoucherSDiscountOf(double x) {
        voucherPage.InputDiscountPercentage(x);
    }

    @Then("I import good codes from a txt file")
    public void iImportGoodCodesFromATxtFile() {
        voucherPage.AddCodeFile();
    }

    @Then("I verify if the good code is imported {string}")
    public void iVerifyIfTheGoodCodeIsImported(String code) {
        voucherPage.VerifyCode(code);
    }

    @Then("I click ok on alert")
    public void iClicOkOnAlert() {
        voucherPage.IclickOKAllert();
    }

    @Then("I input voucher's name of {string}")
    public void iInputVoucherSNameOf(String name) {
        voucherPage.FillVoucherName(name);
    }

    @Then("I input the until date to {string}")
    public void iInputTheUntilDateTo(String date) {
        voucherPage.UntilDateFill(date);
    }

    @Then("I verify if the until date changed to today's date")
    public void iVerifyIfTheUntilDateChangedToTodaySDate() {
        voucherPage.UntildateVerify();
    }

    @And("I import a imagine to code section")
    public void iImportAImagineToCodeSection() {
        voucherPage.importaImagine();
    }

    @And("Verify if i get the {string} error")
    public void verifyIfIGetTheError(String error) {
        voucherPage.ErrorTextVerify(error);
    }

    @And("I import a bad format code")
    public void iImportABadFormatCode() {
        voucherPage.importaBadCode();
    }

    @Then("I set number of codes to {string}")
    public void iSetNumberOfCodesTo(String numberofcodes) {
        voucherPage.setnumberofcodes(numberofcodes);
    }

    @Then("I check if an error appears")
    public void iCheckIfAnErrorAppears() {
        voucherPage.CheckForCodeGeneratorError();
    }

    @Then("I set codes length to {string}")
    public void iSetCodesLenghtTo(String text) {
        voucherPage.setleghtofcodes(text);
    }

    @And("I delete the code")
    public void iDeleteTheCode() {
        voucherPage.RemoveCode();
    }

    @Then("I click ok after i generate codes")
    public void iClickOkAfterIGenerateCodes() {
        voucherPage.okafterGeneratedcodesclick();
    }


    @Then("I verify if the Active from date changed to today's date")
    public void iVerifyIfTheActiveFromDateChangedToTodaySDate() {
        voucherPage.ActiveFromdateVerify();
    }

    @Then("I input the active date to {string}")
    public void iInputTheActiveDateTo(String data) {
        voucherPage.fillActiveFromField(data);
    }


    @And("Verify if the code {string} is still active")
    public void verifyIfTheCodeIsStillActive(String code) {
        voucherPage.verifyIfCodeisActive(code);
    }


    @And("I apply the voucher code {string}")
    public void iApplyTheVoucherCode(String code) {
        voucherPage.ApplyVoucherOnTicket(code);
    }

    @And("I check if the discount of {double} applied to the price of {double}")
    public void iCheckIfTheDiscountOfAppliedToThePriceOf(double discount, double price) {
        voucherPage.checkFeeAfterVoucher(discount,price);
    }

    @And("i input every code generated and check if the prices is discount by {double} from {double} lei")
    public void iInputEveryCodeGeneratedAndCheckIfThePricesIsDiscountByFromLei(double discount, double price) {
        voucherPage.applyAllSavedCodesAndVerify(discount,price);
    }

    @And("I refresh the page")
    public void iRefreshThePage() {
        voucherPage.RefreshPage();
    }

}
