package org.skillbrain.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class EventsPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//p[normalize-space()='Events'] //parent::div")
    private WebElement eventsSidebar;
    @FindBy(xpath = "//a[normalize-space()='Vouchers']")
    private WebElement vouchers;
    @FindBy(css = "button[type='button'] div[class='ripple']")
    private WebElement createVoucher;
    @FindBy(xpath = "//a[normalize-space()='My events']")
    private WebElement myEvents;
    @FindBy(xpath = "//span[normalize-space()='Go to Hub'] //parent::button")
    private  WebElement goToHub;
    @FindBy(xpath = "//h3[normalize-space()='testareBugFix']")
    private WebElement testareBugFixEvent;
    @FindBy(xpath = "//button[normalize-space()='Buy now']")
    private WebElement buyNowButton;
    @FindBy(xpath = "//input[@id='voucherCode']")
    private WebElement codeBox;
    @FindBy(xpath = "//button[normalize-space()='Apply']")
    private WebElement applyButton;
    @FindBy(xpath = "//div[@class='relative']//button[2]")
    private WebElement plusButton;
    @FindBy(xpath = "//p[@class='green-label']")
    private WebElement discountValue;


    public EventsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;

        PageFactory.initElements(this.driver, this);
    }


    public void clickSidebar() {
        eventsSidebar.click();
    }

    public void clickVouchers() {
        waitForText("Vouchers", Duration.ofSeconds(5));
        vouchers.click();
    }

    public void clickCreateVoucherButton() {
        createVoucher.click();
    }

    public void clickMyEvents() {
       // waitForText("My events", Duration.ofSeconds(5));
        myEvents.click();
    }

    public void clickGoToHub() {
        waitForVisibility(goToHub,Duration.ofSeconds(5));
        goToHub.click();
    }

    public void clickTestareBugFixEvent() {
        switchToSecondWindow();
        waitForVisibility(testareBugFixEvent, Duration.ofSeconds(20));
        testareBugFixEvent.click();
    }

    public void clickBuyNowButton() {
        waitForVisibility(buyNowButton, Duration.ofSeconds(10));
        buyNowButton.click();
    }

    public void fillInTheCodeBox() {
       // setWait();
        //WebDriverWait driverWait = getDriverWait();
        //driverWait.until(ExpectedConditions.visibilityOf(codeBox));
        waitForVisibility(codeBox, Duration.ofSeconds(10));
        codeBox.sendKeys("123gh");
    }

    public void clickApplyButton() {
        applyButton.click();
    }

    public void increasingQtyBy1() {
        plusButton.click();
    }

    private WebElement getDiscountValue() {

        return discountValue;
    }

    public void checkValueOfAppliedDiscount() {
        waitForText("22.5", Duration.ofSeconds(5));
        Assert.assertEquals(getDiscountValue().getText(), "22.5% OFF");
    }


}
