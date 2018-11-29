package ecommerce.magenta.pages.user.homepage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;
public class UserHomePage {
	WebDriver driver;
	
	@FindBy(xpath=Mapping.Messages)
	private WebElement Messages;
	
	@FindBy(linkText=Mapping.TVLink)
	private WebElement TVLink;
	
	@FindBy(linkText=Mapping.MyWishlistLink)
	private WebElement MyWishlistLink;
	
	@FindBy(linkText=Mapping.MyOrdersLink)
	private WebElement MyOrdersLink;
	
	@FindBy(xpath=Mapping.ReOrderLastOder)
	private WebElement ReOrderLastOder;
	
	public void reOrderLastOrder() {
		ReOrderLastOder.click();
	}
	
	public void myOdersLinkClick() {
		MyOrdersLink.click();
	}
	
	public void MyWishlistLinkClick() {
		MyWishlistLink.click();
	}
	
	public void tvLinkClick() {
		TVLink.click();
	}
	
	public String getMessage() {
		return Messages.getText();
	}
	
	public UserHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
}
