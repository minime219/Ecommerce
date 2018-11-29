package ecommerce.magenta.pages.login;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class LogInPage {
	WebDriver driver;
	
	@FindBy(xpath=Mapping.CreateAccButton)
	private WebElement CreateAccButton;
	
	@FindBy(name=Mapping.EmailField)
	private WebElement EmailField;
	
	@FindBy(name=Mapping.PasswordField)
	private WebElement PasswordField;
	
	@FindBy(id=Mapping.LoginButton)
	private WebElement LoginButton;
	
	public void doLogin(String email,String password) {
		EmailField.clear();
		EmailField.sendKeys(email);
		PasswordField.clear();
		PasswordField.sendKeys(password);
		LoginButton.click();
	}
	
	public void CreateAccButtonClick() {
		CreateAccButton.click();
	}
	
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
