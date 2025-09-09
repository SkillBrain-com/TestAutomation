package org.skillbrain.page.echipa1.defaulthub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

public class DefaultHubTicketsPage extends BasePage {

    private WebDriver driver;

    public DefaultHubTicketsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

}