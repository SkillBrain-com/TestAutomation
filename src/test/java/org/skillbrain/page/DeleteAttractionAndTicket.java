package org.skillbrain.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DeleteAttractionAndTicket extends BasePage {

    public DeleteAttractionAndTicket(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @FindBy(xpath = "(//img[@alt='delete'])[2]")
    private WebElement deleteTicket;
    @FindBy(xpath = "(//img[@alt='more'])[2]")
    private WebElement moreAttractionSettings;
    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Remove attraction'])[2]")
    private WebElement removeAttraction;
    @FindBy(xpath = "(//div[@class='sidebar-item-header'])[1]")
    private WebElement attractionSideBar;
  
    public void deleteATicket() {
        waitForVisibility(deleteTicket, Duration.ofSeconds(10));
        deleteTicket.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        waitForText("Tickets", Duration.ofSeconds(5));

    }

    public void clickOnMoreAttractionSettings(){
        moreAttractionSettings.click();
    }

    public void clickOnRemoveAttraction(){
        waitForVisibility(removeAttraction, Duration.ofSeconds(10));
        removeAttraction.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        waitForText("My attractions", Duration.ofSeconds(10));

    }

    public void clickOnAttractionSideBar(){
        waitForVisibility(attractionSideBar,Duration.ofSeconds(10));
        attractionSideBar.click();
    }

}