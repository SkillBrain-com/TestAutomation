package org.skillbrain.page.echipa1.defaulthub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

public class DefaultHubCustomerFormPage extends BasePage {

    private WebDriver driver;

    public DefaultHubCustomerFormPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

}