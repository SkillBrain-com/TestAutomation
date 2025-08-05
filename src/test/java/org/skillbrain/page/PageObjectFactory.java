package org.skillbrain.page;

import org.openqa.selenium.WebDriver;

public class PageObjectFactory {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

//    dependency injection
    public PageObjectFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public HomePage getHomePage() {
        homePage = new HomePage(driver);
        return homePage;
    }


}
