package org.skillbrain.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        PageFactory.initElements(this.driver, this);
    }

    public void clickSidebar(){
        eventsSidebar.click();

    }

    public void
}
