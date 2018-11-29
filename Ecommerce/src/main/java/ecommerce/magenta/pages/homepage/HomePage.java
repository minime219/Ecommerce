package ecommerce.magenta.pages.homepage;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath=Mapping.TitleXpath)
	private WebElement Title;
	
	@FindBy(linkText=Mapping.MobileLinkText)
	private WebElement MobileLink;
	
	@FindBy(linkText=Mapping.AccountLinkText)
	private WebElement AccountLink;
	
	@FindBy(linkText=Mapping.MyAccountLinkText)
	private WebElement MyAccountLink;
	
	@FindBy(linkText=Mapping.AdvanceSearchLinkText)
	private WebElement AdvanceSearchLink;
	
	public void advanceSearchClick() {
		AdvanceSearchLink.click();
	}
	
	public void myAccLinkClick() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(MyAccountLink));
		MyAccountLink.click();
	}
	
	public void accountLinkClick() {
		AccountLink.click();
	}
	
	public String getTitle() {
		return Title.getText();
	}
	
	public void mobileLinkClick() {
		MobileLink.click();
	}
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
