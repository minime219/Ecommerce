package ecommerce.magenta.pages.search;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;

public class SearchResultPage {
	WebDriver driver;
	
	@FindBys(@FindBy(className=Mapping.productNames))
	private   List<WebElement> productNames;
	
	@FindBys(@FindBy(className=Mapping.productPrice))
	private List<WebElement> productPrices;
	
	public SearchResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public List<String> getProductNames(){
		List<String> list = new LinkedList<String>();
		
		for(WebElement product:productNames) {
			list.add(product.getText());
		}
		return list;
	}
	
	public List<String> getProductPrices(){
		List<String> list = new LinkedList<String>();
		
		for(WebElement price:productPrices) {
			list.add(price.getText());
		}
		
		return list;
	}
	
	
}
