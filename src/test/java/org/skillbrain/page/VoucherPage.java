package org.skillbrain.page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class VoucherPage extends BasePage {


    private final WebDriver driver;
    @FindBy(css = ("div[class='ripple']"))
    WebElement CreateVoucherButton;
    @FindBy(css = ("input[name=\"name\"]"))
    WebElement VoucherNameInput;
    @FindBy(css = ("input[name=\"discount\"]"))
    WebElement DiscoutPercentInput;
    @FindBy(css = ("input[name=\"code\"]"))
    WebElement ManualCodeInput;
    @FindBy(css = ("button[type=\"submit\"]"))
    WebElement AddCodeButton;
    String voucherName = "VOUCHERTEST22142";
    @FindBy(xpath = "//button[.//span[normalize-space()='Save']]")
    private WebElement saveButton;
    @FindBy(css = "button[class=\"btn btn-link btn-xs\"]")
    private WebElement deleteButton;
    @FindBy(css = "a[class=\"btn btn-primary btn-sm\"]")
    private WebElement openGeneratorButton;
    @FindBy(css = "input[name=\"amount\"]")
    private WebElement numberOfCodesField;
    @FindBy(xpath = "//input[@name='prefix']")
    private WebElement prefixOfCodeField;
    @FindBy(css = "input[name=\"length\"]")
    private WebElement lenghtOfCodeField;
    @FindBy(css = "button[class=\"ripple-button green-contained\"]")
    private WebElement generateCodesButton;
    @FindBy(xpath = "//button[span[normalize-space()='OK']]")
    private WebElement okAfterGeneratedCodes;



    public VoucherPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void CreateVoucherButtonClick() {
        CreateVoucherButton.click();
    }

    public void FillVoucherName() {
        VoucherNameInput.sendKeys("VOUCHERTEST22142");
    }

    public void InputDiscountPercentage() {
        DiscoutPercentInput.sendKeys("22");
    }

    public void InputaCode() {
        ManualCodeInput.sendKeys("celmaitestatcod");
        AddCodeButton.click();
    }

    public void ClickSaveButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(saveButton).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        saveButton.click();
    }

    public void verifyTextPresent(String voucherName) {

        boolean isPresent = driver.getPageSource().contains(voucherName);
        Assert.assertTrue(isPresent, "Nu exista voucherul");
    }

    public void deleteVoucher() {
        deleteButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void OpenGenerator() {
        openGeneratorButton.click();
    }

    public void setNumberOfCodes() {
        numberOfCodesField.sendKeys("5");
    }

    public void codePrefixSet() {
        prefixOfCodeField.sendKeys("test");
    }

    public void leghtOfCodeSet() {
        lenghtOfCodeField.sendKeys("");
    }

    public void ConfirmGenerateCodes() {
        for (int i = 0; i < 3; i++) {
            try {
                waitForText("Code generator", Duration.ofSeconds(5));
                generateCodesButton.click();
                waitForText("Results", Duration.ofSeconds(5));
                okAfterGeneratedCodes.click();
                break;
            } catch (ElementNotInteractableException E) {
                continue;
            }


        }

    }

}
