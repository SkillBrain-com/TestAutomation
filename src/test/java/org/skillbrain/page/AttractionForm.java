package org.skillbrain.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AttractionForm extends BasePage {

    private WebDriver driver;

    public AttractionForm(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    // Common page
}