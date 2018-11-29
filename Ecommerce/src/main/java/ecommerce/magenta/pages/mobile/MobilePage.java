package ecommerce.magenta.pages.mobile;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.*;
public class MobilePage {
	
	WebDriver driver;
	//*[@id="product-price-1"]/span
	//*[@id="product-price-2"]/span
	@FindBy(xpath=Mapping.SonyPriceXpath)
	private WebElement SonyPrice;
	
	@FindBy(xpath=Mapping.PageTitleXpath)
	private WebElement PageTitle;
	
	@FindBy(xpath=Mapping.SortByXpath)
	private WebElement SortByDropDwn;
	
	@FindAll({@FindBy(xpath=Mapping.ProductListXpath)})
	private List<WebElement> Products;
	
	@FindBy(xpath=Mapping.SonyLinkXpath)
	private WebElement SonyLink;
	
	@FindBy(xpath=Mapping.AddToCartXperia)
	private WebElement AddToCartXperia;
	
	@FindBy(xpath=Mapping.AddToCompareXperia)
	private WebElement AddToCompareXperia;
	
	@FindBy(xpath=Mapping.AddToCompareIphone)
	private WebElement AddToCompareIphone;
	
	@FindBy(xpath=Mapping.CompareButton)
	private WebElement CompareButton;
	
	public void doCompare() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(CompareButton));
		CompareButton.click();
	}
	
	public void doAddToCompare(String product) {
		switch (product) {
		case "Iphone": AddToCompareIphone.click(); break;
		case "Xperia": AddToCompareXperia.click(); break;
		default: break;
		}
	}
	
	public void addToCartXperia() {
		AddToCartXperia.click();
	}
	
	public void sonyLinkClick() {
		SonyLink.click();
	}
	
	public String getSonyPrice() {
		return SonyPrice.getText();
	}
	
	public String getPageTitle() {
		return PageTitle.getText();
	}
	
	public void doSortBy(String valueToSort) {
		Select select = new Select(SortByDropDwn);
		select.selectByVisibleText(valueToSort);
	}
	
	public List<String> getProductNames(){
		List<String> list = new LinkedList<String>();
		for (int i=0;i<Products.size();i++) {
			list.add(Products.get(i).getAttribute(Mapping.ProductNameAttribute));
		}
		return list;
	}
	
	public MobilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
