package ecommerce.magenta.pages.wishlist;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class MyWishlistPage {
	WebDriver driver;
	
	@FindBy(xpath=Mapping.Message)
	private WebElement Message;
	
	@FindBy(xpath=Mapping.ShareWishlistButton)
	private WebElement ShareWishlistButton;
	
	@FindBy(xpath=Mapping.AddToCartButton)
	private WebElement AddToCartButton;
	
	public void AddToCartClick() {
		AddToCartButton.click();
	}
	
	public String getMessage() {
		return Message.getText();
	}
	
	public void shareWishlist() {
		ShareWishlistButton.click();
	}
	
	public MyWishlistPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
