package ecommerce.magenta.pages.admin.review;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditReviewAdminPage {
	WebDriver driver;
	@FindBy(id=Mapping.StatusID)
	private WebElement StatusIDDropdwn;
	
	@FindBy(id=Mapping.SaveButton)
	private WebElement SaveButton;
	
	public EditReviewAdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void chooseStatus(String statusToChoose) {
		Select drpdwn = new Select(StatusIDDropdwn);
		drpdwn.selectByVisibleText(statusToChoose);
	}
	
	public void saveReview() {
		SaveButton.click();
	}
}
