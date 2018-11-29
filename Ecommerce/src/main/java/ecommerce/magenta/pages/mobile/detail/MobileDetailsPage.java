package ecommerce.magenta.pages.mobile.detail;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
public class MobileDetailsPage {
	
	WebDriver driver;
	
	@FindBy(xpath=Mapping.firstReviewXpath)
	private WebElement firstReview;
	
	@FindBy(xpath=Mapping.reviewTabXpath)
	private WebElement reviewTab;
	
	@FindBy(id=Mapping.ReviewFieldID)
	private WebElement ReviewField;
	
	@FindBy(id=Mapping.SummaryFieldID)
	private WebElement SummaryField;
	
	@FindBy(id=Mapping.NicknameFieldID)
	private WebElement NicknameField;
	
	@FindBy(xpath=Mapping.SubmitButtonXpath)
	private WebElement SubmitButton;
	
	@FindBy(xpath=Mapping.PriceXpath)
	private WebElement MobilePrice;
	
	public MobileDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getLatestReview() {
		return firstReview.getText();
	}
	
	public void clickReviewTab() {
		reviewTab.click();
	}
	
	public String getMobilePrice() {
		return MobilePrice.getText();
	}
	
	public void sendReview(String review) {
		ReviewField.clear();
		ReviewField.sendKeys(review);
	}
	
	public void sendSummary(String summary) {
		SummaryField.clear();
		SummaryField.sendKeys(summary);
	}
	
	public void sendNickname(String nickname) {
		NicknameField.clear();
		NicknameField.sendKeys(nickname);
	}
	
	public void submit() {
		SubmitButton.click();
	}

}
