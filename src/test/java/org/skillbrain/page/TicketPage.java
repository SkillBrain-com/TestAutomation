package org.skillbrain.page;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;
public class TicketPage extends BasePage {
    private final WebDriver driver;
    @FindBy(xpath = "//p[normalize-space()='Edit']")
    private WebElement EditAttractionButton;
    @FindBy(css = "li[data-step='ticket_types'] button[name='redirect-to']")
    private WebElement TicketPageButton;
    @FindBy(xpath = "//button[.//span[normalize-space()='Create ticket']]")
    private WebElement CreateTicketButton;
    @FindBy(css = "input[name=\"name\"]")
    private WebElement TicketNameField;
    @FindBy(css = "input[data-role=\"price\"]")
    private WebElement TicketPriceField;
    @FindBy(css = "button[data-label=\"Save\"]")
    private WebElement SaveTicketButton;
    @FindBy(xpath = "//a[contains(normalize-space(.), 'Preview & Publish')]")
    private WebElement PreviewTabPage;
    @FindBy(xpath = "//button[@type='submit' and .//img[@alt='delete']]")
    private WebElement DeleteTicketButton;
    @FindBy(id = "#oveit-hub-iframe")
    private WebElement Iframe;
    @FindBy(css = "p[class=\"p4-regular ml-[4px] text-neutral-800 lowercase\"]")
    private WebElement TaxFeeBrute;
    @FindBy(css = "button[type=\"submit\"]")
    private WebElement PublishAttractionButton;
    @FindBy(xpath = "//p[normalize-space()='More']")
    private WebElement MoreAttractionButton;
    @FindBy(xpath = "//button[contains(text(),'Remove attraction')]")
    private WebElement RemoveAttractionButton;
    @FindBy(css = "button[data-role=\"share\"]")
    private WebElement shareAttractionButton;
    @FindBy(css = "a.event-link-redirect")
    private WebElement redirectAttractionButton;
    @FindBy(xpath = "//button[@data-slot='button' and normalize-space()='Buy now']")
    private WebElement BuyNowButton;
    @FindBy(css = "p.p4-regular.ml-\\[4px\\].text-neutral-800.lowercase")
    private WebElement AttractionPageFeeBrute;
    @FindBy(xpath = "//button[normalize-space()='Close']")
    private WebElement closeButtonShareMenu;

    public TicketPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public double getTaxFee() {
        String taxFeeString = TaxFeeBrute.getText();
        return Double.parseDouble(taxFeeString.replaceAll("[^0-9,]", "").replace(",", "."));
    }

    public double getTaxFeeAttraction() {
        String taxFeeString = AttractionPageFeeBrute.getText();
        return Double.parseDouble(taxFeeString.replaceAll("[^0-9,]", "").replace(",", "."));
    }







    public void FillTicketNameAndPrice(double price, String name) {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(CreateTicketButton));}

        public void EditAttraction ()
        {
            EditAttractionButton.click();
        }
        public void TicketPageTab ()
        {
            TicketPageButton.click();
        }
        public void FillTicketNameAndPrice ( int price, String name)
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            CreateTicketButton.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TicketNameField.sendKeys(name);
            TicketPriceField.sendKeys(String.valueOf(price));
            SaveTicketButton.click();
        }


            public void PreviewPage ()
            {
                PreviewTabPage.click();
            }
            public void CheckingFee ( double price){

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                driver.switchTo().frame("oveit-hub-iframe");

                driverWait.until(ExpectedConditions.visibilityOf(TaxFeeBrute));

                double taxFee = getTaxFee();
                double expectedTax = price * 0.03;

                if (expectedTax < 4.34) {
                    expectedTax = 4.34;
                }

                Assert.assertEquals(taxFee, expectedTax, 0.01, "Taxa  nu este corecta! Expected: " + expectedTax + ", Actual: " + taxFee);
                driver.switchTo().defaultContent();
            }

            public void publishAttraction () {
                PublishAttractionButton.click();
            }

            public void deleteAttraction () {
                setWait();
                WebDriverWait driverWait = getDriverWait();
                driverWait.until(ExpectedConditions.visibilityOf(MoreAttractionButton));
                MoreAttractionButton.click();
                waitForText("Remove attraction", Duration.ofSeconds(5));
                RemoveAttractionButton.click();
                Alert alert = driverWait.until(ExpectedConditions.alertIsPresent());
                alert.accept();
            }

            public void shareAttractionMenu () {
                waitForText("Your attraction was published successfully", Duration.ofSeconds(5));
                shareAttractionButton.click();
            }

            public void RedirectToAttractionPage () {
                setWait();
                WebDriverWait driverWait = getDriverWait();
                driverWait.until(ExpectedConditions.visibilityOf(redirectAttractionButton));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                redirectAttractionButton.click();
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(1));

            }

            public void BuyNow () {
                setWait();
                WebDriverWait driverWait = getDriverWait();
                driverWait.until(ExpectedConditions.elementToBeClickable(BuyNowButton));
                BuyNowButton.click();

            }

            public void CheckingFeeAttractionPage ( double price){
                setWait();
                WebDriverWait driverWait = getDriverWait();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                double taxFee = getTaxFeeAttraction();
                double expectedTax = price * 0.03;

                if (expectedTax < 4.34) {
                    expectedTax = 4.34;
                }

                Assert.assertEquals(taxFee, expectedTax, 0.01, "Taxa  nu este corecta! Expected: " + expectedTax + ", Actual: " + taxFee);
            }







    public void ChangeToHomePage() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeShareMenu() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", closeButtonShareMenu);
        closeButtonShareMenu.click();
    }


}