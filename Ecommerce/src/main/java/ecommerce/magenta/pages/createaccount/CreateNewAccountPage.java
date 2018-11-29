package ecommerce.magenta.pages.createaccount;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;
public class CreateNewAccountPage {
	
	WebDriver driver;
	
	@FindBy(id=Mapping.FirstNameField)
	private WebElement FirstNameField;
	
	@FindBy(id=Mapping.LastNameField)
	private WebElement LastNameField;
	
	@FindBy(id=Mapping.MiddleNameField)
	private WebElement MiddleNameField;
	
	@FindBy(id=Mapping.EmailField)
	private WebElement EmailField;
	
	@FindBy(id=Mapping.PasswordField)
	private WebElement PasswordField;
	
	@FindBy(id=Mapping.PassConfirmField)
	private WebElement PassConfirmField;
	
	@FindBy(xpath=Mapping.RegisterButton)
	private WebElement RegisterButton;
	
	public void doRegister(String firstname,String lastname,String email,String password, String passwordconfirm) {
		FirstNameField.clear();
		FirstNameField.sendKeys(firstname);
		LastNameField.clear();
		LastNameField.sendKeys(lastname);
		EmailField.clear();
		EmailField.sendKeys(email);
		PasswordField.clear();
		PasswordField.sendKeys(password);
		PassConfirmField.clear();
		PassConfirmField.sendKeys(passwordconfirm);
		RegisterButton.click();
	}
	
	public CreateNewAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
