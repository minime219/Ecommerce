package ecommerce.magenta.pages.admin.customer;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class CustomerOverview {
	private WebDriver driver;
	
	@FindBy(xpath=Mapping.firstCustomerXpath)
	private WebElement firstCustomer;
	
	public void firstCustomerClick() {
		firstCustomer.click();
	}
	
	public CustomerOverview(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
