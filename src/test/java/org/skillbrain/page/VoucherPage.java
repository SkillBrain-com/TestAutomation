package org.skillbrain.page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class VoucherPage extends BasePage {
    private final WebDriver driver;
    @FindBy(css = ("div[class='ripple']"))
    WebElement CreateVoucherButton;
    @FindBy(css = ("input[name=\"name\"]"))
    WebElement VoucherNameInput;
    @FindBy(css = ("input[name=\"discount\"]"))
    WebElement DiscoutPercentInput;
    @FindBy(css = ("input[name=\"code\"]"))
    WebElement ManualCodeInput;
    @FindBy(css = ("button[type=\"submit\"]"))
    WebElement AddCodeButton;
    String voucherName = "VOUCHERTEST22142";
    @FindBy(css = "button[data-role=\"delete\"]")
    WebElement removeButtonCode;
    @FindBy(xpath = "//button[.//span[normalize-space()='Save']]")
    private WebElement saveButton;
    @FindBy(css = "button[class=\"btn btn-link btn-xs\"]")
    private WebElement deleteButton;
    @FindBy(css = "a[class=\"btn btn-primary btn-sm\"]")
    private WebElement openGeneratorButton;
    @FindBy(css = "input[name=\"amount\"]")
    private WebElement numberOfCodesField;
    @FindBy(xpath = "//input[@name='prefix']")
    private WebElement prefixOfCodeField;
    @FindBy(css = "input[name=\"length\"]")
    private WebElement lenghtOfCodeField;
    @FindBy(css = "button[class=\"ripple-button green-contained\"]")
    private WebElement generateCodesButton;
    @FindBy(xpath = "//button[span[normalize-space()='OK']]")
    private WebElement okAfterGeneratedCodes;
    @FindBy(css = "input[value=\"alpha_lower\"]")
    private WebElement LowerCaseCheckBox;
    @FindBy(css = "input[value=\"alpha_upper\"]")
    private WebElement UpperCaseCheckBox;
    @FindBy(css = "input[value=\"digits\"]")
    private WebElement DigitCheckBox;
    @FindBy(css = "div[class=\"alert alert-error\"]")
    private WebElement ErrorMandatoryFields;
    @FindBy(xpath = "//*[contains(text(),'Browse')]")
    private WebElement browseButton;
    @FindBy(css = "button svg[data-icon='upload']")
    private WebElement submitFileButton;
    @FindBy(css = "input[name=\"valid_to_date\"]")
    private WebElement untilDateField;
    @FindBy(css = "div[class=\"modal-body alert alert-danger\"]")
    private WebElement codegeneratorError;
    @FindBy(css = "input[name=\"valid_from_date\"]")
    private WebElement activeFromField;

    public VoucherPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void CreateVoucherButtonClick() {
        CreateVoucherButton.click();
    }

    public void FillVoucherName(String name) {
        VoucherNameInput.sendKeys(name);
    }

    public void InputDiscountPercentage(double x) {
        DiscoutPercentInput.sendKeys(String.valueOf(x));
    }

    public void InputDiscountPercentageString(String discount) {
        DiscoutPercentInput.clear();
        DiscoutPercentInput.sendKeys(discount);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void InputaCode(String code) {
        ManualCodeInput.sendKeys(code);
        AddCodeButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ClickSaveButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(saveButton).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        saveButton.click();
    }

    public void verifyTextPresent(String voucherName) {

        boolean isPresent = driver.getPageSource().contains(voucherName);
        Assert.assertTrue(isPresent, "Nu exista voucherul");
    }

    public void deleteVoucher() {
        deleteButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void OpenGenerator() {
        openGeneratorButton.click();
    }

    public void setNumberOfCodes() {
        numberOfCodesField.sendKeys("5");
    }

    public void codePrefixSet() {
        prefixOfCodeField.sendKeys("test");
    }

    public void leghtOfCodeSet() {
        lenghtOfCodeField.sendKeys("");
    }

    public void ConfirmGenerateCodes() {


        for (int i = 0; i < 3; i++) {
            try {


                waitForText("Code generator", Duration.ofSeconds(5));
                generateCodesButton.click();
                waitForText("Results", Duration.ofSeconds(5));
                okAfterGeneratedCodes.click();
                break;
            } catch (ElementNotInteractableException E) {


                continue;

            }

        }

    }

    public void GenerateCodeEveryCase() {
        setWait();
        WebDriverWait driverWait = getDriverWait();

        for (int i = 1; i <= 7; i++) {
            switch (i) {
                case 1: // toate
                    driverWait.until(ExpectedConditions.elementToBeClickable(openGeneratorButton)).click();
                    numberOfCodesField.sendKeys("1");
                    driverWait.until(ExpectedConditions.elementToBeClickable(generateCodesButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(okAfterGeneratedCodes)).click();
                    break;

                case 2: // mici + cifre
                    driverWait.until(ExpectedConditions.elementToBeClickable(openGeneratorButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(UpperCaseCheckBox)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(generateCodesButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(okAfterGeneratedCodes)).click();
                    break;

                case 3: // mici
                    driverWait.until(ExpectedConditions.elementToBeClickable(openGeneratorButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(DigitCheckBox)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(generateCodesButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(okAfterGeneratedCodes)).click();
                    break;

                case 4: // mari
                    driverWait.until(ExpectedConditions.elementToBeClickable(openGeneratorButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(LowerCaseCheckBox)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(DigitCheckBox)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(generateCodesButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(okAfterGeneratedCodes)).click();
                    break;

                case 5: // mari + cifre
                    driverWait.until(ExpectedConditions.elementToBeClickable(openGeneratorButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(LowerCaseCheckBox)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(generateCodesButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(okAfterGeneratedCodes)).click();
                    break;

                case 6: // cifre
                    driverWait.until(ExpectedConditions.elementToBeClickable(openGeneratorButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(UpperCaseCheckBox)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(LowerCaseCheckBox)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(generateCodesButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(okAfterGeneratedCodes)).click();
                    break;

                case 7: // mici + mari
                    driverWait.until(ExpectedConditions.elementToBeClickable(openGeneratorButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(DigitCheckBox)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(generateCodesButton)).click();
                    driverWait.until(ExpectedConditions.elementToBeClickable(okAfterGeneratedCodes)).click();
                    break;
            }
        }
    }

    public void verifyGeneratedCodes() {
        setWait();
        WebDriverWait driverWait = getDriverWait();


        List<WebElement> codeElements = driver.findElements(By.xpath("//table[contains(@class,'dataTable')]//tbody//tr/td[1]//code"));


        ArrayList<String> codes = new ArrayList<>();
        for (WebElement el : codeElements) {
            codes.add(el.getText().trim());
        }


        for (int i = 0; i < codes.size(); i++) {
            String code = codes.get(i);
            boolean ok;

            switch (i + 1) {
                case 1: // L U D -> lowercase + uppercase + digits permise
                    ok = code.matches("^[a-zA-Z0-9]+$");
                    break;

                case 2: // L D -> lowercase + digits
                    ok = code.matches("^[a-z0-9]+$");
                    break;

                case 3: // L -> doar lowercase
                    ok = code.matches("^[a-z]+$");
                    break;

                case 4: // D -> doar cifre
                    ok = code.matches("^\\d+$");
                    break;

                case 5: // L D -> lowercase + digits
                    ok = code.matches("^[a-z0-9]+$");
                    break;

                case 6: // U D -> uppercase + digits
                    ok = code.matches("^[A-Z0-9]+$");
                    break;

                case 7: // U -> doar uppercase
                    ok = code.matches("^[A-Z]+$");
                    break;

                default:
                    ok = false;
                    break;
            }

            Assert.assertTrue(ok, "Case " + (i + 1) + " FAIL " + code);
        }
    }

    public void MandatoryFieldsErrorCheck() {
        setWait();
        WebDriverWait driverWait = getDriverWait();

        try {
            driverWait.withTimeout(Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(ErrorMandatoryFields));

            Assert.assertTrue(ErrorMandatoryFields.isDisplayed(), "e vizibila");

        } catch (TimeoutException e) {
            Assert.fail("nu a aparut");
        }
    }

    public void doublecodealert() {
        setWait();
        WebDriverWait wait = getDriverWait();

        try {

            Alert alert = wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.alertIsPresent());
            alert.accept();

        } catch (TimeoutException e) {
            Assert.fail("NU apare eroare");
        }

    }

    public void AddCodeFile() {
        setWait();
        WebDriverWait wait = getDriverWait();
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys("C:\\Users\\User\\Desktop\\oveit\\src\\test\\resources\\codecorecte.txt");
        wait.withTimeout(Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(submitFileButton));
        submitFileButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void IclickOKAllert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void VerifyCode(String code) {
        waitForText(code, Duration.ofSeconds(2));
        String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(bodyText.contains(code));
    }

    public void UntilDateFill(String date) {
        setWait();
        WebDriverWait driverWait = getDriverWait();
        driverWait.until(ExpectedConditions.elementToBeClickable(untilDateField)).sendKeys(date);
    }

    public void UntildateVerify() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedToday = today.format(formatter);
        String untilDateText = untilDateField.getAttribute("value").trim();
        Assert.assertEquals(untilDateText, formattedToday, "not good");
    }

    public void importaImagine() {
        setWait();
        WebDriverWait wait = getDriverWait();
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys("C:\\Users\\User\\Desktop\\oveit\\src\\test\\resources\\poza.jpg");
        wait.withTimeout(Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(submitFileButton));
        submitFileButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void ErrorTextVerify(String error) {
        setWait();
        WebDriverWait driverWait = getDriverWait();
        Alert alert = driverWait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        Assert.assertEquals(alertText, error, "error");
        alert.accept();
    }

    public void importaBadCode() {
        setWait();
        WebDriverWait wait = getDriverWait();
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys("C:\\Users\\User\\Desktop\\oveit\\src\\test\\resources\\codrau.txt");
        wait.withTimeout(Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(submitFileButton));
        submitFileButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void setnumberofcodes(String text) {
        numberOfCodesField.sendKeys(text);

    }

    public void CheckForCodeGeneratorError() {
        try {
            setWait();
            WebDriverWait driverWait = getDriverWait();
            driverWait.until(ExpectedConditions.visibilityOf(codegeneratorError));
        } catch (TimeoutException e) {
            Assert.fail("nu apare erroarea");
        }
    }

    public void setleghtofcodes(String text) {
        lenghtOfCodeField.sendKeys(text);

    }


    public void okafterGeneratedcodesclick() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        okAfterGeneratedCodes.click();
    }

    public void fillActiveFromField(String data) {
        activeFromField.clear();
        activeFromField.sendKeys(data);
    }

    public void ActiveFromdateVerify() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedToday = today.format(formatter);
        String untilDateText = activeFromField.getAttribute("value").trim();
        Assert.assertEquals(untilDateText, formattedToday, "not good");
    }

    public void RemoveCode() {
        removeButtonCode.click();
    }


    public void verifyIfCodeisActive(String code) {
        boolean notFound = false;

        for (int i = 0; i < 3; i++) {
            try {
                driver.findElement(By.xpath("//*[contains(text(),'" + code + "')]"));
                Thread.sleep(1000);
            } catch (Exception e) {
                notFound = true;
                break;
            }
        }

        Assert.assertTrue(notFound, "nu e ok");
    }
}



