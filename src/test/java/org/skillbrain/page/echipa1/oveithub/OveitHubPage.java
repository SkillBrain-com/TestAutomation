package org.skillbrain.page.echipa1.oveithub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;


public class OveitHubPage extends BasePage {

    private WebDriver driver;

    public OveitHubPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy (xpath = "//span[normalize-space()='Go to Hub'] //parent::button")
    private WebElement hubButton;

    public void clickHubButton() {
        hubButton.click();
    }

}