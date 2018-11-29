package ecommerce.magenta.pages.search;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvanceSearch {
	WebDriver driver;
	@FindBy(id=Mapping.priceFromID)
	private WebElement priceFromField;
	
	@FindBy(id=Mapping.priceToID)
	private WebElement priceToField;
	
	@FindBy(xpath=Mapping.searchButtonXpath)
	private WebElement searchButton;
	
	public AdvanceSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillPriceFromField(String priceFrom) {
		priceFromField.clear();
		priceFromField.sendKeys(priceFrom);
	}
	
	public void fillPriceToField(String priceTo) {
		priceToField.clear();
		priceToField.sendKeys(priceTo);
	}
	
	public void searchButtonClick() {
		searchButton.click();
	}
}
