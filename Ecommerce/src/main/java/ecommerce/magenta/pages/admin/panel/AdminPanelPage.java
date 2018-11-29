package ecommerce.magenta.pages.admin.panel;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AdminPanelPage {
	WebDriver driver;
	@FindBy(linkText=Mapping.SalesLinktext)
	private WebElement salesLink;
	
	@FindBy(linkText=Mapping.OrdersLinktext)
	private WebElement ordersLink;
	
	@FindBy(linkText=Mapping.closePopupLink)
	private WebElement closePopupLink;
	
	@FindBy(linkText=Mapping.CatalogLinktext)
	private WebElement catalogLink;
	
	@FindBy(linkText=Mapping.ReviewAndRatingsLink)
	private WebElement reviewAndRatingsLink;
	
	@FindBy(linkText=Mapping.CustomerReviewsLink)
	private WebElement customerReviewsLink;
	
	@FindBy(linkText=Mapping.PendingReviewsLink)
	private WebElement pendingReviewsLink;
	
	@FindBy(linkText=Mapping.InvoicesLinktext)
	private WebElement invoicesLink;
	
	@FindBy(linkText=Mapping.CustomersLinktext)
	private WebElement CustomersLink;
	
	@FindBy(linkText=Mapping.ManageCustomerLinktext)
	private WebElement ManageCustomersLink;
	
	public void manageCustomerLinkClick() {
		Actions builder = new Actions(driver);
		builder.moveToElement(CustomersLink).build().perform();
		ManageCustomersLink.click();
	}
	
	public void invoicesLinkClick() {
		Actions builder = new Actions(driver);
		builder.moveToElement(salesLink).build().perform();
		invoicesLink.click();
	}
	
	public void pendingReviewsLinkClick() {
		Actions builder = new Actions(driver);
		builder.moveToElement(catalogLink).moveToElement(reviewAndRatingsLink).moveToElement(customerReviewsLink).build().perform();
		pendingReviewsLink.click();
	}
	
	public void orderssLinkClick() {
		Actions builder = new Actions(driver);
		builder.moveToElement(salesLink).build().perform();
		ordersLink.click();
	}
	
	
	public AdminPanelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void closeAlert() {
		closePopupLink.click();
	}
}
