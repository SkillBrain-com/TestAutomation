package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

public class VoucherPageImport extends BasePage {

    private final WebDriver driver;
    @FindBy(xpath = ("//input[@name='name']"))
    private WebElement voucherNameBox;
    @FindBy(xpath = ("//input[@name='discount']"))
    private WebElement discountBox;
    //@FindBy(css = (".btn.btn-default.btn-file.btn-sm"))
    //WebElement BrowseButton;
    @FindBy(xpath = ("//div[@class='form-control-file']//input[@type='text']"))
    private WebElement importCodes;
    @FindBy(xpath = ("(//button[@class='btn btn-primary btn-sm'])[2]"))
    private WebElement importButton;
    @FindBy(xpath = ("//span[text()=' Save '] //parent::button"))
    private WebElement saveButton;
    @FindBy(css = ".alert-message")
    private WebElement importResultMessage;
    @FindBy(xpath = ("//h2[normalize-space()='All discount vouchers']"))
    private WebElement allDiscountVouchers;
    @FindBy(xpath = ("//input[@placeholder='Code']"))
    private WebElement addCodeBox;
    @FindBy(xpath = ("//button[normalize-space()='Add']"))
    private WebElement addButton;
    @FindBy(xpath = ("//button[normalize-space()='Continue']"))
    private WebElement continueButton;
    @FindBy(xpath = ("//label[normalize-space()='First Name'] //following-sibling::input "))
    private WebElement firstNameBox;
    @FindBy(xpath = ("//label[normalize-space()='Last Name'] //following-sibling::input "))
    private WebElement lastNameBox;
    @FindBy(xpath = ("//label[normalize-space()='email'] //following-sibling::input "))
    private WebElement emailBox;
    @FindBy(xpath = ("//label[normalize-space()='company'] //following-sibling::input "))
    private WebElement companyBox;
    @FindBy(xpath = ("//label[normalize-space()='position'] //following-sibling::input "))
    private WebElement positionBox;
    @FindBy(css = ("button[type='submit']"))
    private WebElement continue2Button;
    @FindBy(xpath = ("//input[@name='email']"))
    private WebElement emailBillingInfo;
    @FindBy(xpath = ("//input[@name='name']"))
    private WebElement nameBillingInfo;
    @FindBy(css = "input#react-select-2-input")
    private WebElement countryBillingInfoDropDown;
    @FindBy(xpath = ("//div[text()='" + "Romania" +"'"))
    private WebElement selectCountry;
    @FindBy(css = "input#react-select-3-input")
    private WebElement countyBillingInfoDropDown;
    @FindBy(xpath = ("//input[@name='city']"))
    private WebElement cityBillingInfo;
    @FindBy(xpath = ("//input[@name='address']"))
    private WebElement adressBillingInfo;
    @FindBy(xpath = "//p[normalize-space()='Autoprocess']/ancestor::div[contains(@class,'tab-item')]")
    private WebElement autoprocessButton;
    @FindBy(xpath = ("//button[normalize-space()='Pay']"))
    private WebElement payButton;


    public VoucherPageImport(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    public void FillVoucherBoxName(String voucherName) {
        voucherNameBox.sendKeys(voucherName);
    }

    public void FillDiscountBox(String discount) {
        discountBox.sendKeys(discount);
    }

    private void FillInTxtFile(String file) {

        String baseDir = System.getProperty("user.dir") + "/src/test/resources/toUpload/";
        String filePath = Paths.get(baseDir, file).toString();
        File f = new File(filePath);
        if (!f.exists()) {
            throw new RuntimeException("Fișierul nu există: " + filePath);
        }

        importCodes.sendKeys(filePath);
        System.out.println("Uploading file from: " + filePath);
    }

    public void ImportTxtFile(String file) {
        FillInTxtFile(file);
        waitForVisibility(importButton, Duration.ofSeconds(200));
        importButton.click();
    }


    public void FillAddCodeBox(String series) {
        addCodeBox.sendKeys(series);
        addButton.click();

    }

    public void ClickSaveButton() {
        waitForVisibility(saveButton, Duration.ofSeconds(20));
        saveButton.click();
    }

    public void verifyVoucherPresence(String voucher) {

        Assert.assertTrue(driver.getPageSource().contains("VTest1"), "voucherul a fost creat");
    }

    public void deleteVoucher() {
        waitForText("All discount vouchers", Duration.ofSeconds(10));


    }

    public void pressContinueButton() {

        scrollToElement(continueButton);
        waitForClick(continueButton, Duration.ofSeconds(30));
        continueButton.click();
    }

    public void fillInMandatoryFields() {
        waitForVisibility(firstNameBox, Duration.ofSeconds(20));
        firstNameBox.sendKeys("Daniela");
        lastNameBox.sendKeys("Moldoveanu");
        emailBox.sendKeys("moldoveanudaniela25@gmail.com");
        companyBox.sendKeys("Oveit");
        positionBox.sendKeys("QA");
    }

    public void pressContinue2Button() {
        waitForClick(continue2Button, Duration.ofSeconds(40));
        scrollToElement(continue2Button);
        continue2Button.sendKeys(Keys.ENTER);
    }

    public void selectCountry(String countryName) {
        selectCountry.click();
    }


    public void fillInMandatoryFieldsForPayment() {
        waitForClick(emailBillingInfo, Duration.ofSeconds(30));
        emailBillingInfo.sendKeys("moldoveanudaniela25@gmail.com");
        nameBillingInfo.sendKeys("Moldoveanu Daniela");
        countryBillingInfoDropDown.sendKeys("Romania");
        countryBillingInfoDropDown.sendKeys(Keys.ENTER);
        countyBillingInfoDropDown.sendKeys("Ilfov");
        //scrollToElement(countyBillingInfoDropDown);
        //waitForClick(countyBillingInfoDropDown, Duration.ofSeconds(30));
        countyBillingInfoDropDown.sendKeys(Keys.ENTER);
        cityBillingInfo.sendKeys("Berceni");
        adressBillingInfo.sendKeys("Oituzel");


    }

    public void selectPaymentAndPay() {

        Actions actions = new Actions(driver);
        actions.moveToElement(autoprocessButton).click().perform();
        payButton.sendKeys(Keys.ENTER);
    }
}
