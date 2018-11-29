package ecommerce.magenta.pages.admin.customer;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class CustomerDetailsPage {
	private WebDriver driver;
	
	@FindBy(id=Mapping.createFromID)
	private WebElement createFromField;
	
	@FindBy(id=Mapping.newPasswordField)
	private WebElement newPasswordField;
	
	@FindBy(id=Mapping.associateWebsiteID)
	private WebElement associateWebsiteDrpdwn;
	
	@FindBy(id=Mapping.customerInfoID)
	private WebElement customerInfoTab;
	
	public CustomerDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void customerInfoClick() {
		customerInfoTab.click();
	}
	
	public boolean isAssociateWebsiteDrpdwnEndable() {
		return associateWebsiteDrpdwn.isEnabled();
	}
	
	public String getNewPassword() {
		return newPasswordField.getText();
	}
	
	public boolean isCreateFromFieldEndable() {
		return createFromField.isEnabled();
	}
	
	
}
