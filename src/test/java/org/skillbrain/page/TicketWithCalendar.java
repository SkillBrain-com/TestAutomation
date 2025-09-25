package org.skillbrain.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TicketWithCalendar extends BasePage {


    public TicketWithCalendar(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        this.driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//input[@id=\"date-interval\"]")
    private WebElement dateInterval;
    @FindBy(xpath = "//input[@name=\"start_date\"]")
    private WebElement dateStart;
    @FindBy(xpath = "//input[@name=\"start_time\"]")
    private WebElement timeStart;
    @FindBy(xpath = "//input[@name=\"end_date\"]")
    private WebElement endData;
    @FindBy(xpath = "//input[@name=\"end_time\"]")
    private WebElement endTime;
    @FindBy(xpath = ("(//div[@class='toggler-container toggle-options'])[2]"))
    private WebElement availabilitySchedule;
    @FindBy(xpath = "//input[@name=\"sold_from_date\"]")
    private WebElement startDateWhenTicketCanBeBuy;
    @FindBy(xpath = "//input[@name=\"sold_from_time\"]")
    private WebElement startTimeWhenTicketCanBeBuy;
    @FindBy(xpath = "//input[@name=\"sold_to_date\"]")
    private WebElement endDateWhenTicketCanBeBuy;
    @FindBy(xpath = "//input[@name=\"sold_to_time\"]")
    private WebElement endTimeWhenTicketCanBeBuy;
    @FindBy(xpath = "//label[normalize-space()=\"On specific weekdays\"]")
    private WebElement specificWeekEnd;
    @FindBy(xpath = "//input[@name=\"timetable[days][start_date]\"]")
    private WebElement addStartSpecificWeekend;
    @FindBy(xpath = "//input[@name=\"timetable[days][end_date]\"]")
    private WebElement addEndSpecificWeekend;
    @FindBy(css = "input[value=\"monday\"]")
    private WebElement addTicketsMonday;
    @FindBy(css = "input[value=\"friday\"]")
    private WebElement addTicketsFriday;
    @FindBy(xpath = "//span[normalize-space()='Next'] //parent::button")
    private WebElement clickOnNext;
    @FindBy(xpath = "//button[@data-role=\"ticket-type-add\"]//div[@class=\"ripple\"]")
    private WebElement newTicket;
    @FindBy(xpath = "//input[@placeholder=\"e.g. VIP Area, Entry ticket, etc.\"]")
    private WebElement name;
    @FindBy(xpath = "(//div[@data-role=\"toggle-options-section\"])[7]")
    private WebElement ticketVisibility;
    @FindBy(xpath = "//label[normalize-space()=\"Private invitation\"]")
    private WebElement privateInvitation;
    @FindBy(xpath = "//input[@placeholder=\"e.g. CNBvXh7d\"]")
    private WebElement privateCode;
    @FindBy(xpath = "//div[@aria-hidden=\"false\"]//div//form//div//span[contains(text(),\"Save\")]")
    private WebElement saveButton;
    @FindBy(xpath = "//iframe[@id='oveit-hub-iframe']")
    private WebElement iframe;
    @FindBy(xpath = "//input[@id=\"voucherCode\"]")
    private WebElement usePrivateCode;
    @FindBy(xpath = "(//button[contains(@data-slot,'button')])[5]")
    private WebElement addPrivateTicket;
    @FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
    private WebElement continueBuyTheTicket;
    @FindBy(xpath = "//input[@name=\"email\"]")
    private WebElement email;
    @FindBy(xpath = "//input[@name=\"name\"]")
    private WebElement completeName;
    @FindBy(css = "input#react-select-3-input")
    private WebElement stateList;
    @FindBy(xpath = "//input[@name=\"city\"]")
    private WebElement completeCity;
    @FindBy(xpath = "//input[@name=\"address\"]")
    private WebElement completeAddress;


    public void clickOnTimeStart() {
        timeStart.click();
    }

    public void clickOnDateStart() {
        dateStart.click();
    }

    public void clickOnEndData() {
        endData.click();
    }

    public void clickOnEndTime() {
        endTime.click();
    }

    public void clickOnStartDateWhenTicketCanBeBuy() {
        startTimeWhenTicketCanBeBuy.click();
    }

    public void clickStartTimeWhenTicketCanBeBuy() {
        startTimeWhenTicketCanBeBuy.click();
    }

    public void clickOnEndDateWhenTicketCanBeBuy() {
        endDateWhenTicketCanBeBuy.click();
    }

    public void clickOnStartTimeWhenTicketCanBeBuy() {
        endTimeWhenTicketCanBeBuy.click();
    }

    public void getStartSpecificWeekEnd() {
        addStartSpecificWeekend.click();

    }

    public void getEndSpecificWeekEnd() {
        addEndSpecificWeekend.click();
    }


    public void clickOnDateInterval() {
        dateInterval.click();
    }

    public void fillDataAndTime(String DataAndTime) {
        endData.sendKeys("2025-10-01");
        endTime.sendKeys("8:00");
        dateStart.sendKeys("2025-07-01");
        timeStart.sendKeys("08:00");
    }

    public void clickOnAvailabilitySchedule() {
        waitForVisibility(availabilitySchedule, Duration.ofSeconds(15));
        scrollToElement(availabilitySchedule);
        availabilitySchedule.click();
    }

    public void clickDateWhenTicketCanBeBuy(String AvailableDateAndTimeTicket) {
        waitForVisibility(startDateWhenTicketCanBeBuy, Duration.ofSeconds(15));
        startDateWhenTicketCanBeBuy.sendKeys("2025-07-03");
        startTimeWhenTicketCanBeBuy.sendKeys("8:00");
        endDateWhenTicketCanBeBuy.sendKeys("2025-09-28");
        endTimeWhenTicketCanBeBuy.sendKeys("00:00");
    }

    public void clickOnSpecificWeekend() {
        waitForVisibility(specificWeekEnd, Duration.ofSeconds(10));
        specificWeekEnd.click();
    }

    public void getSpecificWeekend(String Date) {
        addStartSpecificWeekend.sendKeys("2025-11-01");
        addEndSpecificWeekend.sendKeys("2025-12-20");
    }

    public void getTicketMonday() {
        addTicketsMonday.click();
    }

    public void getTicketFriday() {
        scrollToElement(addTicketsFriday);
        addTicketsFriday.click();
    }

    public void getClickOnNext() {
        scrollToElement(clickOnNext);
        clickOnNext.click();
    }

    public void clickOnNewTicket() {
        waitForVisibility(newTicket, Duration.ofSeconds(10));
        newTicket.click();
    }

    public void putAName(String Name) {
        waitForVisibility(name, Duration.ofSeconds(10));
        name.sendKeys(Name);
    }

    public void clickOnTicketVisibility() {
        waitForVisibility(ticketVisibility, Duration.ofSeconds(10));
        scrollToElement(ticketVisibility);
        ticketVisibility.click();
    }

    public void clickOnPrivateInvitation() {
        waitForVisibility(privateInvitation, Duration.ofSeconds(10));
        scrollToElement(privateInvitation);
        privateInvitation.click();
    }

    public void getPrivateCode(String PrivateCode) {
        scrollToElement(privateCode);
        privateCode.sendKeys(PrivateCode);
    }

    public void clickOnSaveButton() {
        scrollToElement(saveButton);
        saveButton.click();
    }


    public void privateCodeGetUsed(String Code) {
        driver.switchTo().frame(iframe);
        waitForVisibility(usePrivateCode, Duration.ofSeconds(5));
        usePrivateCode.sendKeys(Code);
    }

    public void getPrivateTicket() {
        waitForVisibility(addPrivateTicket, Duration.ofSeconds(10));
        addPrivateTicket.click();
    }

    public void clickOnContinue() {
        scrollToElement(continueBuyTheTicket);
        continueBuyTheTicket.click();
    }

    public void setEmail(String Email) {
        waitForVisibility(email, Duration.ofSeconds(10));
        email.sendKeys(Email);
    }

    public void setName(String Name) {
        completeName.sendKeys(Name);
    }

    public void setState(String State) {
        stateList.sendKeys(State);
        stateList.sendKeys(Keys.ENTER);
    }

    public void setCity(String City) {
        completeCity.sendKeys(City);
    }

    public void setAddress(String Address) {
        completeAddress.sendKeys(Address);
    }
}


