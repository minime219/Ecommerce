package ecommerce.magenta.pages.admin.invoices;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;

public class InvoicesAdminPage {
	WebDriver driver;
	
	@FindBys(@FindBy(xpath=Mapping.invoiceDates))
	private List<WebElement> InvoiceDates;
	
	@FindBy(xpath=Mapping.invoiceDateHeader)
	private WebElement invoicesDateHeader;
	
	public void sortDate() {
		invoicesDateHeader.click();
	}
	
	public List<String> getSortedDate() {
		List<String> list = new LinkedList<String>();
		for (WebElement e: InvoiceDates) {
			if(!e.getText().contentEquals("Reset FilterSearch")) {
			list.add(e.getText());
			}
		}
		return list;
		
	}
	
	
	public InvoicesAdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
