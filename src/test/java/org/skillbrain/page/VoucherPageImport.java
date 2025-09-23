package org.skillbrain.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

public class VoucherPageImport extends BasePage {

    private final WebDriver driver;
    @FindBy(xpath = ("//input[@name='name']"))
    private WebElement voucherNameBox;
    @FindBy(xpath = ("//input[@name='discount']"))
    private WebElement discountBox;
    //@FindBy(css = (".btn.btn-default.btn-file.btn-sm"))
    //WebElement BrowseButton;
    @FindBy(xpath = ("//div[@class='form-control-file']//input[@type='text']"))
    private WebElement importCodes;
    @FindBy(xpath = ("(//button[@class='btn btn-primary btn-sm'])[2]"))
    private WebElement importButton;
    @FindBy(xpath = ("//span[text()=' Save '] //parent::button"))
    private WebElement saveButton;
    @FindBy(css = ".alert-message")
    private WebElement importResultMessage;
    @FindBy(xpath = ("//h2[normalize-space()='All discount vouchers']"))
    private WebElement allDiscountVouchers;
    @FindBy(xpath = ("//input[@placeholder='Code']"))
    private WebElement addCodeBox;
    @FindBy(xpath = ("//button[normalize-space()='Add']"))
    private WebElement addButton;


    public VoucherPageImport(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    public void FillVoucherBoxName(String voucherName){
        voucherNameBox.sendKeys(voucherName);
    }

    public void FillDiscountBox(String discount){
        discountBox.sendKeys(discount);
    }

    private void FillInTxtFile(String file){

        String baseDir = System.getProperty("user.dir") + "/src/test/resources/toUpload/";
        String filePath = Paths.get(baseDir, file).toString();
        File f = new File(filePath);
        if (!f.exists()) {
            throw new RuntimeException("Fișierul nu există: " + filePath);
        }

        importCodes.sendKeys(filePath);
        System.out.println("Uploading file from: " + filePath);
    }

    public void ImportTxtFile( String file){
        FillInTxtFile(file);
        importButton.click();
    }

    public void ClickSaveButton(){
        waitForText("Save", Duration.ofSeconds(20));
        saveButton.click();
    }

    public boolean isVoucherPresent(String voucherName) {
        List<WebElement> vouchers = driver.findElements(
                By.xpath("//table//td[normalize-space(text())='" + voucherName + "']")
        );
        return !vouchers.isEmpty();
    }

    public void FillAddCodeBox(String series) {
        addCodeBox.sendKeys(series);
        addButton.click();

    }
}
