package ecommerce.magenta.pages.tv;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;
public class TvPage {
	WebDriver driver;
	
	@FindBy(xpath=Mapping.AddToWishlistSamsung)
	private WebElement AddToWishlistSamsung;
	
	public void addToWishlistSamsungClick() {
		AddToWishlistSamsung.click();
	}
	
	public TvPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
