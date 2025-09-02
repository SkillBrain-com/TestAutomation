package org.skillbrain.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Properties;

public class LoginPage extends BasePage {

    private WebDriver driver;

    private static final String URL = "https://web02.stg.oveit.com/seller/vouchers/add";

    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "password")
    private WebElement pass;
    @FindBy(css = ".ripple-button.blue-contained")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public void navigateToLogin() {
        driver.get(URL);
    }

    public void login() {
        fillInDetails();
        loginButton.click();
    }

    private void fillInDetails() {
        Properties prop = new Properties();
        try {
            prop.load(Files.newInputStream(
                    Paths.get(System.getProperty("user.dir") + "/src/test/resources/credentials.properties")));
            String emailProp = prop.getProperty("email");
            String passProp = prop.getProperty("pass");
            email.sendKeys(emailProp);
            pass.sendKeys(passProp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
