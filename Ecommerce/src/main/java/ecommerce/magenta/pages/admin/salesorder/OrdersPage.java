package ecommerce.magenta.pages.admin.salesorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class OrdersPage {
	WebDriver driver;
	
	@FindBy(id=Mapping.StatusSelect)
	private WebElement StatusSelect;
	
	@FindBy(xpath=Mapping.SearchButton)
	private WebElement SearchButton;
	
	@FindBy(xpath=Mapping.checkboxFirstOrder)
	private WebElement CheckboxFirstOrder;
	
	@FindBy(id=Mapping.actionSelect)
	private WebElement ActionSelect;
	
	@FindBy(xpath=Mapping.SubmitButton)
	private WebElement SubmitButton;
	
	@FindBy(xpath=Mapping.ErrorMessageXpath)
	private WebElement ErrorMessage;
	
	public String getErrorMessage() {
		return ErrorMessage.getText();
	}
	
	public void clickSubmitButton() {
		SubmitButton.click();
	}
	
	public void selectAction(String actionToSelect) {
		Select select = new Select(ActionSelect);
		select.selectByVisibleText(actionToSelect);
	}
	
	public void tickCheckboxFirstOrder() {
		CheckboxFirstOrder.click();
	}
	
	
	public OrdersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectStatus(String statusToSelect) {
		Select select = new Select(StatusSelect);
		select.selectByVisibleText(statusToSelect);
	}
	
	public void searchButtonClick() {
		SearchButton.click();
	}
	
	
}
