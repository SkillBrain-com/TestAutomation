package org.skillbrain.page.echipa1.attractionform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

import java.time.Duration;

public class AttractionFormGuestFormPage extends BasePage {

    private WebDriver driver;

    public AttractionFormGuestFormPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//li[@data-step=\"fields\"]")
    private WebElement guestFormTabButton;

    @FindBy(xpath = "(//input[@type=\"text\"])[1]")
    private WebElement guestCustomTextField;

    public void fillFirstGuestCustomNameField(String name) {
        waitForClick(guestCustomTextField, Duration.ofSeconds(10));
        scrollToElement(guestCustomTextField);
        guestCustomTextField.sendKeys(name);
    }

}
