package org.skillbrain.page;

import org.openqa.selenium.WebDriver;

import org.skillbrain.page.echipa1.attractionform.*;
import org.skillbrain.page.echipa1.defaulthub.*;
import org.skillbrain.page.echipa1.merchant.*;
import org.skillbrain.page.echipa1.oveithub.*;

public class PageObjectFactory {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private AttractionForm attractionForm;
    private VoucherPage voucherPage;
    private TicketPage ticketPage;
    private AttractionFormOverviewPage attractionFormOverview;
    private AttractionFormTicketsPage attractionFormTickets;
    private AttractionFormAdvancedPage attractionFormAdvanced;
    private AttractionFormCustomerFormPage attractionFormCustomerForm;
    private AttractionFormGuestFormPage attractionFormGuestForm;
    private AttractionFormPreviewPublishPage attractionFormPreviewPublish;
    private DefaultHubCheckOutPage defaultHubCheckOut;
    private DefaultHubCustomerFormPage defaultHubCustomerForm;
    private DefaultHubGuestFormPage defaultHubGuestForm;
    private DefaultHubTicketsPage defaultHubTickets;
    private StripePaymentPage stripePayment;
    private OveitHubCustomerFormPage oveitHubCustomerForm;
    private OveitHubGuestFormPage oveitHubGuestForm;
    private OveitHubPage oveitHub;
    private OveitHubTicketsPage oveitHubTickets;

   private ApprovalTicket approvalTicket;
   private ApproveTicketOrder approveATicketOrder;
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
    public ApprovalTicket getApprovalTicket(){
        approvalTicket = new ApprovalTicket(driver);
        return approvalTicket;
    }
    public ApproveTicketOrder getApproveATicketOrder() {
        approveATicketOrder = new ApproveTicketOrder(driver);
        return approveATicketOrder;
    }

    public AttractionFormOverviewPage getAttractionFormOverview() {
        attractionFormOverview = new AttractionFormOverviewPage(driver);
        return attractionFormOverview;
    }

    public AttractionFormTicketsPage getAttractionFormTickets() {
        attractionFormTickets = new AttractionFormTicketsPage(driver);
        return attractionFormTickets;
    }

    public AttractionFormAdvancedPage getAttractionFormAdvanced() {
        attractionFormAdvanced = new AttractionFormAdvancedPage(driver);
        return attractionFormAdvanced;
    }

    public AttractionFormCustomerFormPage getAttractionFormCustomerForm() {
        attractionFormCustomerForm = new AttractionFormCustomerFormPage(driver);
        return attractionFormCustomerForm;
    }

    public AttractionFormGuestFormPage getAttractionFormGuestForm() {
        attractionFormGuestForm = new AttractionFormGuestFormPage(driver);
        return attractionFormGuestForm;
    }

    public AttractionFormPreviewPublishPage getAttractionFormPreviewPublish() {
        attractionFormPreviewPublish = new AttractionFormPreviewPublishPage(driver);
        return attractionFormPreviewPublish;
    }

    public DefaultHubCheckOutPage getDefaultHubCheckOut() {
        defaultHubCheckOut = new DefaultHubCheckOutPage(driver);
        return defaultHubCheckOut;
    }

    public DefaultHubCustomerFormPage getDefaultHubCustomerForm() {
        defaultHubCustomerForm = new DefaultHubCustomerFormPage(driver);
        return defaultHubCustomerForm;
    }

    public DefaultHubGuestFormPage getDefaultHubGuestForm() {
        defaultHubGuestForm = new DefaultHubGuestFormPage(driver);
        return defaultHubGuestForm;
    }

    public DefaultHubTicketsPage getDefaultHubTickets() {
        defaultHubTickets = new DefaultHubTicketsPage(driver);
        return defaultHubTickets;
    }

    public StripePaymentPage getStripePayment() {
        stripePayment = new StripePaymentPage(driver);
        return stripePayment;
    }

    public OveitHubCustomerFormPage getOveitHubCustomerForm() {
        oveitHubCustomerForm = new OveitHubCustomerFormPage(driver);
        return oveitHubCustomerForm;
    }

    public OveitHubGuestFormPage getOveitHubGuestForm() {
        oveitHubGuestForm = new OveitHubGuestFormPage(driver);
        return oveitHubGuestForm;
    }

    public OveitHubPage getOveitHub() {
        oveitHub = new OveitHubPage(driver);
        return oveitHub;
    }

    public OveitHubTicketsPage getOveitHubTickets() {
        oveitHubTickets = new OveitHubTicketsPage(driver);
        return oveitHubTickets;
    }
}
