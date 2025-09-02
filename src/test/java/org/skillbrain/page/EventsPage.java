package org.skillbrain.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class EventsPage extends BasePage{
    private WebDriver driver;
    @FindBy(xpath = "//p[normalize-space()='Events'] //parent::div")
    private WebElement eventsSidebar;
    @FindBy(xpath= "//a[normalize-space()='Vouchers']")
    private WebElement vouchers;
    @FindBy(css = "button[type='button'] div[class='ripple']")
    private WebElement createVoucher;

    public EventsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.eventsSidebar = eventsSidebar;
        this.vouchers = vouchers;
        this.createVoucher = createVoucher;
        PageFactory.initElements(this.driver, this);
    }

//    public EventsPage(WebDriver driver) {
//        super(driver);
//    }

    public void clickSidebar(){
            eventsSidebar.click();
    }

    public void clickVouchers(){
        waitForText("Vouchers", Duration.ofSeconds(5));
        vouchers.click();
    }

    public void clickCreateVoucherButton(){
        createVoucher.click();
    }
}
