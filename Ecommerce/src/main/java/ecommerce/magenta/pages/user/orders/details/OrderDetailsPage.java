package ecommerce.magenta.pages.user.orders.details;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class OrderDetailsPage {
	WebDriver driver;
	
	@FindBy(linkText=Mapping.PrintOrder)
	private WebElement PrintOrder;
	
	public void printOrderClick() {
		PrintOrder.click();
	}

	public OrderDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
