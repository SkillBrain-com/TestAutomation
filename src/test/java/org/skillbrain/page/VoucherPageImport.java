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

public class VoucherPageImport extends BasePage {

    private final WebDriver driver;
    @FindBy(xpath = ("//input[@name='name']"))
    private WebElement voucherNameBox;
    @FindBy(xpath = ("//input[@name='discount']"))
    WebElement DiscountBox;
    //@FindBy(css = (".btn.btn-default.btn-file.btn-sm"))
    //WebElement BrowseButton;
    @FindBy(xpath = ("//div[@class='form-control-file']//input[@type='text']"))
    WebElement ImportCodes;
    @FindBy(xpath = ("(//button[@class='btn btn-primary btn-sm'])[2]"))
    WebElement ImportButton;
    @FindBy(xpath = ("//span[text()=' Save '] //parent::button"))
    WebElement SaveButton;
    @FindBy(xpath = ("//h2[normalize-space()='All discount vouchers']"))
    WebElement AllDiscountVouchers;


    public VoucherPageImport(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        PageFactory.initElements(this.voucherNameBox, this);
    }

    public void FillVoucherBoxName(){
        voucherNameBox.sendKeys("TC10 import vouchers");
    }

    public void FillDiscountBox(){
        DiscountBox.sendKeys("10");
    }
    //public void PressBrowseButton(){
      //  BrowseButton.click();
   // }


    private void FillInTxtFile() {
        Properties prop = new Properties();

        try {
          prop.load(Files.newInputStream(
              Paths.get(System.getProperty("user.dir") + "/src/test/resources/toUpload/tc1.csv")));
           //String file1Prop = prop.getProperty("file1.txt");
           ImportCodes.sendKeys(System.getProperty("user.dir") + "/src/test/resources/toUpload/tc1.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void ImportTxtFile(){
        FillInTxtFile();
        ImportButton.click();
    }

    public void ClickSaveButton(){
        waitForVisibility(SaveButton, Duration.ofSeconds(5));
        SaveButton.click();
    }

    public void CheckedSavedVouchers(){
        Assert.assertTrue(AllDiscountVouchers.isDisplayed());
    }

}
