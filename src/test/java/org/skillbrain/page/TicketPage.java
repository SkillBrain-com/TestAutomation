package org.skillbrain.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TicketPage extends BasePage{
    private WebDriver driver;

    public TicketPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath="//p[normalize-space()='Edit']")
    private WebElement EditAttractionButton;
    @FindBy(xpath = "li[data-step='ticket_types'] a.p2-medium")
    private WebElement TicketPageButton;
    @FindBy(xpath = "//span[contains(text(),'Create ticket')]")
    private WebElement CreateTicketButton;
    @FindBy(css="input[name=\"name\"]")
    private WebElement TicketNameField;
    @FindBy(css="input[data-role=\"price\"]")
    private WebElement TicketPriceField;
    @FindBy(css="button[data-label=\"Save\"]")
    private WebElement SaveTicketButton;
    @FindBy(xpath="//a[normalize-space()='Preview & Publish']")
    private WebElement PreviewTabPage;
    @FindBy(xpath = "//p[@class='p4-regular ml-[4px] text-neutral-800 lowercase']")
    private WebElement TaxFeeBrute;





    public double getTaxFee() {
        String taxFeeString = TaxFeeBrute.getText();
        return Double.parseDouble(taxFeeString.replaceAll("[^0-9,]", "").replace(",", "."));
    }



    public void EditAttraction()
    {
        EditAttractionButton.click();
    }
    public void TicketPageTab()
    {
        TicketPageButton.click();
    }
    public void FillTicketNameAndPrice(int price,String name)
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
    public void PreviewPage()
    {
        PreviewTabPage.click();
    }
    public void CheckingFee(double price) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double taxFee = getTaxFee();
        double expectedTax = price * 0.03;

        if (expectedTax < 1.0) {
            expectedTax = 1.0;
        }

        Assert.assertEquals(taxFee, expectedTax, 0.01,
                "Taxa afișată nu este corectă! Expected: " + expectedTax + ", Actual: " + taxFee);
    }


}