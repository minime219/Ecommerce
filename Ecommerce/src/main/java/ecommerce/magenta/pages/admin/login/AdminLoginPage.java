package ecommerce.magenta.pages.admin.login;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {
	
	WebDriver driver;
	
	@FindBy(id=Mapping.UserNameField)
	private WebElement usernameField;
	
	@FindBy(id=Mapping.PasswordField)
	private WebElement passwordField;
	
	@FindBy(xpath=Mapping.LoginButton)
	private WebElement logInButton;
	
	public AdminLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void doLogin(String username, String password) {
		usernameField.clear();
		usernameField.sendKeys(username);
		passwordField.clear();
		passwordField.sendKeys(password);
		logInButton.click();
	}

}
