package org.skillbrain.page.echipa1.defaulthub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;
import org.testng.Assert;

import java.time.Duration;

public class DefaultHubTicketsPage extends BasePage {

    private WebDriver driver;

    public DefaultHubTicketsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//input[@name='visibility_code']")
    private WebElement oldInviteCodeField;
    @FindBy(xpath = "//button[@data-role=\"apply-visibility-code\"]")
    private WebElement oldApplyButton;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement reserveTicketsButton;

    @FindBy(xpath = "//div[@class=\"alert alert-success\"]")
    private WebElement oldPrivateLabel;

    public WebElement getOldPrivateLabel() {
        return oldPrivateLabel;
    }

    public void fillOldCustomerPrivateInviteCodeField(String code) {
        waitForClick(oldInviteCodeField, Duration.ofSeconds(10));
        oldInviteCodeField.sendKeys(code);
    }

    public void clickOldApplyButton() {
        setWait();
        waitForClick(oldApplyButton, Duration.ofSeconds(10));
        oldApplyButton.click();
    }

    public void clickReserveTicketsButton() {
        setWait();
        waitForClick(reserveTicketsButton, Duration.ofSeconds(10));
        reserveTicketsButton.click();
    }

    public void checkOldPrivateLabel(String tag) {
        waitForVisibility(oldPrivateLabel, Duration.ofSeconds(30));
        Assert.assertEquals(getOldPrivateLabel().getText(),tag, "The tag does not match!");
    }

    public void checkOldToastMessage(String toast) {
        waitForVisibility(oldPrivateLabel, Duration.ofSeconds(30));
        Assert.assertEquals(getOldPrivateLabel().getText(),toast,"The invite code failed to apply!");
    }
}