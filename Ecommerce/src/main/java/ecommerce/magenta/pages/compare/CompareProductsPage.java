package ecommerce.magenta.pages.compare;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class CompareProductsPage {
	WebDriver driver;
	
	@FindBy(xpath=Mapping.Product_1)
	private WebElement Product_1;
	
	@FindBy(xpath=Mapping.Product_2)
	private WebElement Product_2;
	
	@FindBy(xpath=Mapping.CloseButton)
	private WebElement CloseButton;
	
	public void close() {
		CloseButton.click();
	}
	
	public CompareProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getProduct1Name() {
		return Product_1.getText();
	}
	
	public String getProduct2Name() {
		return Product_2.getText();
	}
}
