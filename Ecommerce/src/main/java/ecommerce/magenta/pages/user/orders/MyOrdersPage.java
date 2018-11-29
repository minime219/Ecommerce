package ecommerce.magenta.pages.user.orders;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;
public class MyOrdersPage {
	WebDriver driver;
	
	@FindBy(xpath=Mapping.FirstOrderNumber)
	private WebElement FirstOrderNumber;
	
	@FindBy(xpath=Mapping.ViewLatestOder)
	private WebElement ViewLastOrderLink;
	
	@FindBy(xpath=Mapping.LastestOrderStatus)
	private WebElement LatestOrderStatus;
	
	public String getLatestOrderStatus() {
		return LatestOrderStatus.getText();
	}
	
	public void viewLastOrder() {
		ViewLastOrderLink.click();
	}
	
	public String getFirstOrderNumber() {
		return FirstOrderNumber.getText();
	}
	
	public MyOrdersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
