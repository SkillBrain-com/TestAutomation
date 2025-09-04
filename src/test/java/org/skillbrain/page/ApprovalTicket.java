package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ApprovalTicket extends BasePage {
    public ApprovalTicket(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @FindBy(xpath = "//span[contains(text(),'Ticket configuration')] //parent::div")
    private WebElement clickOnTicketConfig;
    @FindBy(xpath = "(//div[@class='toggler-container toggle-options'])[9]")
    private WebElement approvalList;
    @FindBy(xpath = "//label[normalize-space()='Enable']")
    private WebElement enableButton;
    @FindBy(xpath = "//iframe[@id='oveit-hub-iframe']")
    private WebElement iframe;
    @FindBy(css = "input[name='email']")
    private WebElement completeWithEmail;
    @FindBy(xpath = "//button[normalize-space()='Apply']")
    private WebElement applyButton;
    @FindBy(xpath = "(//p[@class='p1-bold mb-[8px]'])[1]")
    private WebElement orderComplete;


    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public void getClickOnTicketConfig() {
        waitForVisibility(clickOnTicketConfig, Duration.ofSeconds(10));
        scrollToElement(clickOnTicketConfig);
        getDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnTicketConfig)).click();
        try {
            getDriverWait().
                    until(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.cssSelector("ticket-type-form-options")));
        } catch (TimeoutException e) {
            getDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnTicketConfig)).click();
        }
    }

    public void clickOnApprovalList() {
        waitForVisibility(approvalList, Duration.ofSeconds(10));
        scrollToElement(approvalList);
        getDriverWait().until(ExpectedConditions.elementToBeClickable(approvalList)).click();
    }

    public void clickOnEnable() {
        waitForVisibility(enableButton, Duration.ofSeconds(5));
        enableButton.click();
    }


    public void addEmail(String email) {
        driver.switchTo().frame(iframe);
        waitForVisibility(completeWithEmail, Duration.ofSeconds(10));
        completeWithEmail.sendKeys("test123@gmail.com");
    }

    public void clickApply() {
        scrollToElement(applyButton);
        applyButton.click();

    }

    public void getOrderCompleted() {
        waitForText("Application submitted", Duration.ofSeconds(35));
        scrollToElement(orderComplete);
        Assert.assertEquals(orderComplete.getText(), "Application submitted");

    }
}
