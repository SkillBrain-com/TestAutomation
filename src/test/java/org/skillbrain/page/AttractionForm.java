package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class AttractionForm extends BasePage{

    private WebDriver driver;

    public AttractionForm(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement nextButton;

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



}
