package org.skillbrain.page;

import org.openqa.selenium.WebDriver;

public class PageObjectFactory {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private AttractionForm attractionForm;
    private VoucherPage voucherPage;
   private TicketPage ticketPage;
    private EventsPage eventsPage;
    private BundlesPages bundlesPages;
    private PublishedBundlesPage publishedBundlesPage;
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

    public EventsPage getEventsPage() {
        eventsPage = new EventsPage(driver);
        return eventsPage;
    }
    public BundlesPages getBundlesPages(){
        bundlesPages = new BundlesPages(driver);
        return bundlesPages;
    }
    public PublishedBundlesPage getPublishedBundlesPage(){
        publishedBundlesPage= new PublishedBundlesPage(driver);
        return publishedBundlesPage;
    }


}
