package org.skillbrain.page.echipa1.oveithub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

public class OveitHubTicketsPage extends BasePage {

    private WebDriver driver;

    public OveitHubTicketsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

}