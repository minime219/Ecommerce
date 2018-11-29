package ecommerce.magenta.pages.admin.review;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
public class ReviewAdminPage {
	WebDriver driver;
	
	@FindBy(name=Mapping.ID)
	private WebElement IDButton;
	
	@FindBy(xpath=Mapping.FirstReviewCheckboxXpath)
	private WebElement FirstReviewCheckbox;
	
	@FindBy(xpath=Mapping.EditFirstReviewLinkXpath)
	private WebElement EditFirstReview;
	
	public void editFirstReview() {
		EditFirstReview.click();
	}
	
	public void chooseFirstReview() {
		FirstReviewCheckbox.click();
	}
	
	public ReviewAdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sortByID() {
		IDButton.click();
	}
	
}
