package org.skillbrain.page.echipa1.attractionform;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skillbrain.page.BasePage;
import org.testng.Assert;

import java.time.Duration;
import java.util.Map;

public class AttractionFormPreviewPublishPage extends BasePage {

    private WebDriver driver;

    public AttractionFormPreviewPublishPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//iframe[@id='oveit-hub-iframe']")
    private WebElement iframe;

    @FindBy(xpath = "//li[@data-step=\"preview\"]")
    private WebElement papTabButton;

    @FindBy(xpath = "(//button[@data-slot='button'])[3]")
    private WebElement addButton;
    @FindBy(xpath = "(//button[@data-slot='button'])[5]")
    private WebElement addSecondButton;
    @FindBy(xpath = "(//button[@data-slot='button'])[7]")
    private WebElement addThirdButton;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    private WebElement continueButton;
    @FindBy(xpath = "//p[contains(text(), 'Autoprocess')] //parent::div")
    private WebElement autoProcButton;
    @FindBy(xpath = "//button[normalize-space()='Pay']")
    private WebElement payButton;
    @FindBy(xpath = "//p[contains(text(), 'A company')] //parent::div")
    private WebElement companyButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement publishButton;
    @FindBy(xpath = "//div[@class='ripple']")
    private WebElement shareButton;
    @FindBy(xpath = "//div[@id='hub-share']//a[@class='event-link-redirect']")
    private WebElement redirectLink;

    @FindBy(xpath = "(//input[@type=\"text\"])[1]")
    private WebElement guestField;

    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;
    @FindBy(css = "input[name=\"name\"]")
    private WebElement nameField;
    @FindBy(css = "input#react-select-2-input")
    private WebElement countryDropdown;
    @FindBy(css = "input#react-select-3-input")
    private WebElement stateDropdown;
    @FindBy(css = "input[name=\"city\"]")
    private WebElement cityField;
    @FindBy(css = "input[name=\"address\"]")
    private WebElement addressField;
    @FindBy(css = "input[name=\"tax_id\"]")
    private WebElement taxIdField;

    @FindBy(xpath = "(//input[@type=\"text\"])[7]")
    private WebElement firstCustomerCustomField;

    @FindBy(css = "label[for=\"name\"]")
    private WebElement companyNameField;

    @FindBy(xpath = "//label[normalize-space()=\"Phone Number\"]")
    private WebElement firstCustomTextLabel;
    @FindBy(xpath = "//label[normalize-space()=\"Observations\"]")
    private WebElement secondCustomTextLabel;
    @FindBy(xpath = "(//label[normalize-space()=\"Email address\"])[2]")
    private WebElement thirdCustomTextLabel;
    @FindBy(xpath = "//label[normalize-space()=\"Booking Date\"]")
    private WebElement forthCustomTextLabel;
    @FindBy(xpath = "//label[normalize-space()=\"Professions\"]")
    private WebElement fifthCustomTextLabel;
    @FindBy(xpath = "//label[normalize-space()=\"Smoker?\"]")
    private WebElement sixthCustomTextLabel;

    @FindBy(xpath = "//p[normalize-space()=\"Total\"]")
    private WebElement orderTotalLabel;
    @FindBy(xpath = "//h2[normalize-space()='✅ Order complete']")
    private WebElement orderCompleteLabel;
    @FindBy(xpath = "//label[normalize-space()='Phone Number']")
    private WebElement customerFormCustomTextLabel;

    @FindBy(xpath = "//strong[@class='alert-heading']")
    private WebElement errorMessage;
    @FindBy(xpath = "//h1[normalize-space()='Page not found']")
    private WebElement error404Message;

    public String getRedirectHref() {
        return redirectLink.getAttribute("href");
    }

    public WebElement getCompanyNameField() {
        return companyNameField;
    }

    public WebElement getFirstCustomTextLabel() {
        return firstCustomTextLabel;
    }

    public WebElement getSecondCustomTextLabel() {
        return secondCustomTextLabel;
    }

    public WebElement getThirdCustomTextLabel() {
        return thirdCustomTextLabel;
    }

    public WebElement getForthCustomTextLabel() {
        return forthCustomTextLabel;
    }

    public WebElement getFifthCustomTextLabel() {
        return fifthCustomTextLabel;
    }

    public WebElement getSixthCustomTextLabel() {
        return sixthCustomTextLabel;
    }

    public WebElement getOrderTotalLabel() {
        return orderTotalLabel;
    }

    public WebElement getCustomerFormCustomTextLabel() {
        return customerFormCustomTextLabel;
    }

    public WebElement getOrderCompleteLabel() {
        return orderCompleteLabel;
    }

    public WebElement getError404Message() {
        return error404Message;
    }

    public void clickOnPreviewPublishTab() {
        driver.navigate().refresh();
        waitForClick(papTabButton, Duration.ofSeconds(10));
        papTabButton.click();
    }

    public void clickOnAddButton() {
        driver.switchTo().frame(iframe);

        waitForVisibility(addButton, Duration.ofSeconds(10));
        addButton.click();

        driver.switchTo().defaultContent();
    }

    public void clickOnSecondAddButton() {
        driver.switchTo().frame(iframe);

        waitForVisibility(addSecondButton, Duration.ofSeconds(10));
        addSecondButton.click();

        driver.switchTo().defaultContent();
    }

    public void clickOnThirdAddButton() {
        driver.switchTo().frame(iframe);

        waitForVisibility(addThirdButton, Duration.ofSeconds(10));
        addThirdButton.click();

        driver.switchTo().defaultContent();
    }

    public void clickOnContinueButton() {
        driver.switchTo().frame(iframe);

        waitForClick(continueButton, Duration.ofSeconds(10));
        continueButton.click();

        driver.switchTo().defaultContent();
    }

    public void clickCompanyButton() {
        driver.switchTo().frame(iframe);

        waitForVisibility(companyButton, Duration.ofSeconds(10));
        companyButton.click();

        driver.switchTo().defaultContent();
    }

    public void fillGuestForm(String note) {
        driver.switchTo().frame(iframe);

        waitForVisibility(guestField, Duration.ofSeconds(10));
        guestField.sendKeys(note);

        driver.switchTo().defaultContent();
    }

    public void fillCustomerForm(Map<String, String> data) {
        driver.switchTo().frame(iframe);

        waitForClick(emailField, Duration.ofSeconds(10));

        emailField.sendKeys(data.get("email"));
        nameField.sendKeys(data.get("name"));
        countryDropdown.sendKeys(data.get("country"));
        countryDropdown.sendKeys(Keys.ENTER);
        stateDropdown.sendKeys(data.get("state"));
        stateDropdown.sendKeys(Keys.ENTER);
        cityField.sendKeys(data.get("city"));
        addressField.sendKeys(data.get("address"));

        if (data.containsKey("phone number")
                && data.get("phone number") != null
                && !data.get("phone number").isBlank()) {
            try {
                waitForVisibility(firstCustomerCustomField, Duration.ofSeconds(3));
                firstCustomerCustomField.sendKeys(data.get("phone number"));
            } catch (NoSuchElementException e) {
                System.out.println("Campul nu a fost gasit!");
            }
        }

        if (data.containsKey("tax id")
                && data.get("tax id") != null
                && !data.get("tax id").isBlank()) {
            try {
                waitForVisibility(taxIdField, Duration.ofSeconds(3));
                taxIdField.sendKeys(data.get("tax id"));
            } catch (NoSuchElementException e) {
                System.out.println("Campul nu a fost gasit!");
            }
        }

        driver.switchTo().defaultContent();
    }

    public void clickOnAutoProcButton() {
        ((JavascriptExecutor) driver).executeScript(
                "var nav = document.getElementById('mobile-nav'); if(nav) { nav.style.display='none'; }"
        );

        driver.switchTo().frame(iframe);

        waitForClick(autoProcButton, Duration.ofSeconds(10));
        scrollToElement(autoProcButton);
        autoProcButton.click();

        driver.switchTo().defaultContent();
    }

    public void clickOnPayButton() {
        driver.switchTo().frame(iframe);

        waitForClick(payButton, Duration.ofSeconds(20));
        scrollToElement(payButton);
        payButton.click();

        driver.switchTo().defaultContent();
    }

    public void checkCustomTextFieldLabel(String name) {
        driver.switchTo().frame(iframe);

        waitForText("Phone Number", Duration.ofSeconds(10));
        scrollToElement(customerFormCustomTextLabel);
        Assert.assertEquals(getCustomerFormCustomTextLabel().getText(),name);

        driver.switchTo().defaultContent();
    }

    public void checkSixFieldsCustomerForm() {
        driver.switchTo().frame(iframe);

        waitForText("My billing information", Duration.ofSeconds(10));
        String expectedFirstLabel = "Phone Number";
        String expectedSecondLabel = "Observations";
        String expectedThirdLabel = "Email address";
        String expectedForthLabel = "Booking Date";
        String expectedFifthLabel = "Professions";
        String expectedSixthLabel = "Smoker?";
        Assert.assertEquals(getFirstCustomTextLabel().getText(), expectedFirstLabel, "First label does not match!");
        Assert.assertEquals(getSecondCustomTextLabel().getText(), expectedSecondLabel, "Second label does not match!");
        Assert.assertEquals(getThirdCustomTextLabel().getText(), expectedThirdLabel, "Third label does not match!");
        Assert.assertEquals(getForthCustomTextLabel().getText(), expectedForthLabel, "Forth label does not match!");
        Assert.assertEquals(getFifthCustomTextLabel().getText(), expectedFifthLabel, "Fifth label does not match!");
        Assert.assertEquals(getSixthCustomTextLabel().getText(), expectedSixthLabel, "Sixth label does not match!");

        driver.switchTo().defaultContent();
    }

    public void checkOrderTotal(String total) {
        driver.switchTo().frame(iframe);

        waitForVisibility(orderTotalLabel, Duration.ofSeconds(10));
        scrollToElement(orderTotalLabel);
        Assert.assertEquals(getOrderTotalLabel().getText(), total);

        driver.switchTo().defaultContent();
    }

    public void assertOrderCompleted() {
        driver.switchTo().frame(iframe);

        waitForVisibility(orderCompleteLabel, Duration.ofSeconds(300));
        Assert.assertEquals(orderCompleteLabel.getText(), "✅ Order complete");

        driver.switchTo().defaultContent();
    }

    public void checkErrorMessageForPayment(String expectedMessage) {
        waitForVisibility(errorMessage, Duration.ofSeconds(20));
        String actualMessage = errorMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message did not match");
    }

    public void checkCompanyName(String companyName) {
        driver.switchTo().frame(iframe);

        waitForText("Company name", Duration.ofSeconds(10));
        scrollToElement(companyNameField);
        Assert.assertEquals(getCompanyNameField().getText(),companyName);

        driver.switchTo().defaultContent();
    }

    public void checkErrorMessageForCustomerForm() {
        driver.switchTo().frame(iframe);

        waitForVisibility(error404Message, Duration.ofSeconds(10));
        String expectedError = "Page not found";
        Assert.assertEquals(getError404Message().getText(), expectedError, "An error message appears!");

        driver.switchTo().defaultContent();
    }

    public void clickOnPublishAttractButton() {
        waitForClick(publishButton, Duration.ofSeconds(20));
        publishButton.click();
    }

    public void clickOnShareButton() {
        setWait();
        driver.navigate().refresh();
        waitForClick(shareButton, Duration.ofSeconds(30));
        shareButton.click();
    }

    public void handleRedirect() {
        waitForVisibility(redirectLink, Duration.ofSeconds(10));

        String dynamicHref = getRedirectHref();

        String originalWindow = driver.getWindowHandle();

        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", dynamicHref);

        setWait();

        String newWindowHandle = driver.getWindowHandles().stream()
                .filter(handle -> !handle.equals(originalWindow))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("New window not found"));

        driver.switchTo().window(newWindowHandle);
        waitForText("Location", Duration.ofSeconds(10));

        driver.switchTo().window(originalWindow);
        driver.close();

        driver.switchTo().window(newWindowHandle);

        setWait();
    }

}
