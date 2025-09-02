package org.skillbrain.page;

import org.openqa.selenium.WebDriver;

public class PageObjectFactory {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private AttractionForm attractionForm;
    private VoucherPage voucherPage;
    private TicketPage ticketPage;
    private AttractionForm privateTicket;

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

    public AttractionForm getAttractionForm() {
        attractionForm = new AttractionForm(driver);
        return attractionForm;
    }

    public VoucherPage getVoucherPage() {
        voucherPage = new VoucherPage(driver);
        return voucherPage;
    }

    public TicketPage getTicketPage() {
        ticketPage = new TicketPage(driver);
        return ticketPage;
    }

    public AttractionForm getPrivateTicket() {
        privateTicket = new AttractionForm(driver);
        return privateTicket;
    }
}
