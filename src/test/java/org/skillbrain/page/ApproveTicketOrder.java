package org.skillbrain.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class ApproveTicketOrder extends BasePage {


    public ApproveTicketOrder(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));


    }

    @FindBy(xpath = "//div[@class='sidebar-items-container']//div[2]//div[1]")
    private WebElement reportSideBar;
    @FindBy(xpath = "//a[normalize-space()='Order history']")
    private WebElement orderHistory;
    @FindBy(xpath = "//a[normalize-space()='97812']")
    private WebElement clickOnTicket;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement approveButton;
    @FindBy(xpath = "//span[@class='status status-order-approved']")
    private WebElement orderApproved;

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public void clickOnReports() {
        reportSideBar.click();
    }

    public void clickOnOrders() {
        waitForVisibility(orderHistory, Duration.ofSeconds(10));
        orderHistory.click();
    }

    public void getClickOnTicket() {
        waitForVisibility(clickOnTicket, Duration.ofSeconds(10));
        scrollToElement(clickOnTicket);
        clickOnTicket.click();
    }

    public void clickOnApprove() {
        waitForVisibility(approveButton, Duration.ofSeconds(20));
        approveButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }


    public void orderApprovedVerification() {
        waitForText("Approved", Duration.ofSeconds(40));
        Assert.assertEquals(orderApproved.getText(), "APPROVED");
    }
}
