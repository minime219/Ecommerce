package ecommerce.magenta.pages.wishlist.share;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;
public class ShareWishlistPage {
	WebDriver driver;
	
	@FindBy(id=Mapping.EmailBox)
	private WebElement EmailBox;
	
	@FindBy(id=Mapping.MessageBox)
	private WebElement MessageBox;
	
	@FindBy(xpath=Mapping.ShareWishlistButton)
	private WebElement ShareWishlistButton;
	
	public void shareWishlist(String email, String message) {
		EmailBox.clear();
		EmailBox.sendKeys(email);
		MessageBox.clear();
		MessageBox.sendKeys(message);
		ShareWishlistButton.click();
		
	}
	public ShareWishlistPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
