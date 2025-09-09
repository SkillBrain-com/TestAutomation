package org.skillbrain.page.echipa1.attractionform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;

public class AttractionFormAdvancedPage extends BasePage {

    private WebDriver driver;

    public AttractionFormAdvancedPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


}
