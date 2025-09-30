package org.skillbrain.page.echipa1.oveithub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;
import org.testng.Assert;

import java.time.Duration;

public class OveitHubTicketsPage extends BasePage {

    private WebDriver driver;

    public OveitHubTicketsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Buy now']")
    private WebElement buyNowButton;
    @FindBy(xpath = "//button[normalize-space()='Register now']")
    private WebElement registerNowButton;

    @FindBy(xpath = "//input[@id=\"voucherCode\"]")
    private WebElement privateCustomerInviteCodeField;
    @FindBy(xpath = "//input[@name=\"code\"]")
    private WebElement privateGuestInviteCodeField;

    @FindBy(xpath = "//button[@data-slot='button' and normalize-space()=\"Apply\"]")
    private WebElement applyButton;

    @FindBy(xpath = "(//button[@data-slot='button'])[3]")
    private WebElement addButton;
    @FindBy(xpath = "(//button[@data-slot='button'])[5]")
    private WebElement addSecondButton;
    @FindBy(xpath = "(//button[@data-slot='button'])[7]")
    private WebElement addThirdButton;

    @FindBy(xpath = "//div[@class='relative']//button[1]")
    private WebElement subtractButton;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//p[normalize-space()=\"Private\"]")
    private WebElement privateLabel;
    @FindBy(xpath = "//div[@role=\"alert\"]/div[2]")
    private WebElement toastMessage;

    public void clickOnBuyNowButton() {
        waitForClick(buyNowButton, Duration.ofSeconds(10));
        buyNowButton.click();
    }

    public void clickOnRegisterNowButton() {
        waitForClick(registerNowButton, Duration.ofSeconds(10));
        registerNowButton.click();
    }

    public void clickMultipleOnAddButton(int nr) {
        waitForClick(addButton, Duration.ofSeconds(10));
        for (int i = 0; i < nr; i++) {
            addButton.click();
        }
    }

    public void checkTicketPlus() {
        Assert.assertFalse(addButton.isEnabled(), "Add button should be disabled");

        String disabledAdd = addButton.getAttribute("disabled");
        assert disabledAdd != null : "Add button does not have disabled attribute";
    }

    public void checkContinueMinus() {
        waitForVisibility(subtractButton, Duration.ofSeconds(10));
        waitForVisibility(continueButton, Duration.ofSeconds(10));

        Assert.assertFalse(subtractButton.isEnabled(), "Minus button should be disabled");;

        String disabledMinus = subtractButton.getAttribute("disabled");
        assert disabledMinus != null : "Minus button does not have disabled attribute";

        Assert.assertFalse(continueButton.isEnabled(), "Continue button should be disabled");

        String disabledContinue = continueButton.getAttribute("disabled");
        assert disabledContinue != null : "Continue button does not have disabled attribute";
    }

    public void clickSimpleContinueButton() {
        waitForClick(continueButton, Duration.ofSeconds(20));
        continueButton.click();
    }

    public void clickSimpleAddButton() {
        waitForClick(addButton, Duration.ofSeconds(10));
        addButton.click();
    }

    public void clickSimpleSecondAddButton() {
        waitForClick(addSecondButton, Duration.ofSeconds(10));
        addSecondButton.click();
    }

    public void clickSimpleThirdAddButton() {
        waitForClick(addThirdButton, Duration.ofSeconds(10));
        addThirdButton.click();
    }

    public void fillSimpleCustomerInviteCodeField(String code) {
        waitForClick(privateCustomerInviteCodeField, Duration.ofSeconds(30));
        privateCustomerInviteCodeField.sendKeys(code);
    }

    public void fillSimpleGuestInviteCodeField(String code) {
        waitForClick(privateGuestInviteCodeField, Duration.ofSeconds(30));
        privateGuestInviteCodeField.sendKeys(code);
    }

    public void clickSimpleApplyButton() {
        waitForClick(applyButton, Duration.ofSeconds(10));
        applyButton.click();
    }

    public void checkSimplePrivateLabel(String tag) {
        waitForVisibility(privateLabel, Duration.ofSeconds(3));
        Assert.assertEquals(privateLabel.getText(), tag, "The tag does not match!");
    }

    public void checkSimpleToastMessage(String toast) {
        waitForVisibility(toastMessage, Duration.ofSeconds(3));
        Assert.assertEquals(toastMessage.getText(), toast, "The invite code was not applied!");
    }
}