package org.skillbrain.page.echipa1.oveithub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

import java.time.Duration;

import static org.testng.Assert.assertFalse;

public class OveitHubTicketsPage extends BasePage {

    private WebDriver driver;

    public OveitHubTicketsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Buy now']")
    private WebElement buyNowButton;

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

    public void clickOnBuyNowButton() {
        waitForClick(buyNowButton, Duration.ofSeconds(10));
        buyNowButton.click();
    }

    public void clickMultipleOnAddButton(int nr) {
        waitForClick(addButton, Duration.ofSeconds(10));
        for (int i = 0; i < nr; i++) {
            addButton.click();
        }
    }

    public void checkTicketPlus() {
        assertFalse(addButton.isEnabled(), "Add button should be disabled");

        String disabledAdd = addButton.getAttribute("disabled");
        assert disabledAdd != null : "Add button does not have disabled attribute";
    }

    public void checkContinueMinus() {
        waitForVisibility(subtractButton, Duration.ofSeconds(10));
        waitForVisibility(continueButton, Duration.ofSeconds(10));

        assertFalse(subtractButton.isEnabled(), "Minus button should be disabled");

        String disabledMinus = subtractButton.getAttribute("disabled");
        assert disabledMinus != null : "Minus button does not have disabled attribute";

        assertFalse(continueButton.isEnabled(), "Continue button should be disabled");

        String disabledContinue = continueButton.getAttribute("disabled");
        assert disabledContinue != null : "Continue button does not have disabled attribute";
    }

    public void clickSimpleContinueButton() {
        waitForClick(continueButton, Duration.ofSeconds(10));
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
}