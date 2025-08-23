package org.skillbrain.page;

import org.bouncycastle.cms.PasswordRecipient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.Instant;

public class AttractionForm extends BasePage{

    private WebDriver driver;

    public AttractionForm(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public WebDriverWait getDriverWait() {
        return super.getDriverWait();
    }

    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement nextButton;
    @FindBy(css="input[name=\"name\"]")
    private WebElement attractionNameField;
    @FindBy(xpath=("//*[normalize-space(text())='Location']"))
    private WebElement locationDropDown;
    @FindBy(xpath=("//input[@name='location' and @type='text']"))
    private WebElement attractionLocationField;
    @FindBy(css="img[alt=\"Location pin\"]")
    WebElement mapPin;
    @FindBy(css = "div[aria-label='Hartă'][role='region']")
    WebElement map;
    public void clickOnNext() {
        nextButton.click();
    }

    public void checkErrorIsDisplayed(String errorMessage) {
        waitForText("Please fix the following issues to continue:", Duration.ofSeconds(10));
        String targetMessage =
                String.format("//li[contains(.,\"%s\")]", errorMessage);
        WebElement errorWebElement = driver.findElement(By.xpath(targetMessage));
        Assert.assertEquals(errorWebElement.getText(), errorMessage);

    }
   public void fillAttractionMandatory(String name,String location)
   {
       waitForText("Attraction name", Duration.ofSeconds(5));
       attractionNameField.sendKeys(name);
       locationDropDown.click();
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
    attractionLocationField.sendKeys(location);
   }


}
