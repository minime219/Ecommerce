package ecommerce.magenta.pages.checkout.complete;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class CheckoutComplete {
	WebDriver driver;
	
	@FindBy(xpath=Mapping.PageTitle)
	private WebElement PageTitle;
	
	@FindBy(xpath=Mapping.OrderNummer)
	private WebElement OrderNummer;
	
	
	
	public String getOrderNummer() {
		return OrderNummer.getText();
	}
	
	public String getPageTitle() {
		return PageTitle.getText();
	}
	
	public CheckoutComplete(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
