package ecommerce.magenta.pages.shoppingcart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {
	WebDriver driver;
	
	@FindBy(xpath=Mapping.QuantityField)
	private WebElement QuantityField;
	
	@FindBy(xpath=Mapping.UpdateCartButton)
	private WebElement UpdateCartButton;
	
	@FindBy(xpath=Mapping.Message)
	private WebElement Message;
	
	@FindBy(id=Mapping.EmptyCartButton)
	private WebElement EmptyCartButton;
	
	@FindBy(xpath=Mapping.PageTitleXpath)
	private WebElement PageTitle;
	
	@FindBy(xpath=Mapping.ProceedToCheckOutButton)
	private WebElement ProceedToCheckOutButton;
	
	@FindBy(xpath=Mapping.GrandTotal)
	private WebElement GrandTotal;
	
	public String getGrandTotal() {
		return GrandTotal.getText();
	}
	
	public void proceedToCheckout() {
		ProceedToCheckOutButton.click();
	}
	
	public String getPageTitle() {
		return PageTitle.getText();
	}
	
	public void doEmpty() {
		EmptyCartButton.click();
	}
	
	public String getMessage() {
		return Message.getText();
	}
	
	public void doUpdateCart() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(UpdateCartButton));
		UpdateCartButton.click();
	}
	
	public void InputQuantity(String quantity) {
		QuantityField.clear();
		QuantityField.sendKeys(quantity);
	}
	
	public ShoppingCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
