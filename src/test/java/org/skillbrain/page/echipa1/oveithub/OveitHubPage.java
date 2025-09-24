package org.skillbrain.page.echipa1.oveithub;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;
import org.testng.Assert;

import java.time.Duration;


public class OveitHubPage extends BasePage {

    private WebDriver driver;

    public OveitHubPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Go to Hub'] //parent::button")
    private WebElement hubButton;
    @FindBy(xpath = "//a[normalize-space()='More']")
    private WebElement moreButton;
    @FindBy(xpath = "//h3[text()='TC_OH_002']/ancestor::div[contains(@class,'w-full') and contains(@class,'bg-neutral-0')]//button[@data-slot='button']")
    private WebElement shareAttractButton;

    @FindBy(xpath = "//h3[text()='TC_OH_002']/ancestor::div[contains(@class,'w-full') and contains(@class,'bg-neutral-0')]")
    private WebElement shareCard;

    @FindBy(xpath = "//button[@role='combobox']")
    private WebElement languageSwitcher;

    @FindBy(xpath = "//div[@dir='ltr']")
    private WebElement languageContainer;
    @FindBy(xpath = "//div[@dir='ltr']//div[2]")
    private WebElement koreanItem;

    @FindBy(xpath = "(//span[@class='p1-medium ml-[8px]'])[1]")
    private WebElement priceLabel;
    @FindBy(xpath = "//h2[normalize-space()='Share link']")
    private WebElement shareLabel;

    public WebElement getPriceLabel() {
        return priceLabel;
    }

    public void clickHubButton() {
        hubButton.click();
    }

    public void clickOnMoreButton() {
        waitForClick(moreButton, Duration.ofSeconds(10));
        moreButton.click();
    }

    public void clickOnLanguageDropdown() {
        smoothScrollToBottom(driver);

        Actions actions = new Actions(driver);

        scrollToElement(languageSwitcher);

        waitForClick(languageSwitcher, Duration.ofSeconds(30));
        actions.moveToElement(languageSwitcher)
                .pause(Duration.ofMillis(200))
                .click()
                .perform();

        waitForClick(koreanItem, Duration.ofSeconds(30));
        actions.moveToElement(koreanItem)
                .pause(Duration.ofMillis(200))
                .click()
                .perform();
    }

    public void checkKoreanLanguage(String label) {
        waitForText("영구", Duration.ofSeconds(10));
        Assert.assertEquals(getPriceLabel().getText().trim().split("\\s+")[0], label, "Label not translated properly !!");
    }

    public void clickShareAttractButton() {
        waitForVisibility(shareCard, Duration.ofSeconds(10));

        Actions actions = new Actions(driver);
        actions.moveToElement(shareCard)
                .pause(Duration.ofMillis(300))
                .perform();

        waitForClick(shareAttractButton, Duration.ofSeconds(10));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", shareAttractButton);
    }

    public void checkShareModal() {
        waitForText("Share link", Duration.ofSeconds(10));
        String expectedLabel = "Share link";
        Assert.assertEquals(shareLabel.getText(), expectedLabel, "No sharing options !");
    }
}