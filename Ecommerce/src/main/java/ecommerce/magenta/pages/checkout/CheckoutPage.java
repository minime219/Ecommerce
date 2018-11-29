package ecommerce.magenta.pages.checkout;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ecommerce.magenta.pages.checkout.Mapping;

import org.openqa.selenium.*;
public class CheckoutPage {
	WebDriver driver;
	
	@FindBy(id=Mapping.AdressField)
	private WebElement AdressField;
	
	@FindBy(id=Mapping.CityField)
	private WebElement CityField;
	
	@FindBy(id=Mapping.RegionState)
	private WebElement RegionStateDrpdwn;
	
	@FindBy(id=Mapping.ZipField)
	private WebElement ZipField;
	
	@FindBy(id=Mapping.CountryDrpDwn)
	private WebElement CountryDrpDwn;
	
	@FindBy(id=Mapping.TelephoneField)
	private WebElement TelephoneField;
	
	@FindBy(xpath=Mapping.ContinueButton)
	private WebElement ContinueButton;
	
	@FindBy(id=Mapping.ShipToThisAddRadio)
	private WebElement ShipToThisAddRadio;
	
	@FindBy(id=Mapping.ShipToOtherAddRadio)
	private WebElement ShipToOtherAddRadio;
	
	@FindBy(xpath=Mapping.ShippingPrice)
	private WebElement ShippingPrice;
	
	@FindBy(xpath=Mapping.ContinueShippingButton)
	private WebElement ContinueShippingButton;
	
	@FindBy(id=Mapping.MoneyOrder)
	private WebElement MoneyOrderRadio;
	
	@FindBy(id=Mapping.CreditCard)
	private WebElement CreditCardRadio;
	
	@FindBy(xpath=Mapping.ContinueButtonPayment)
	private WebElement ContinueButtonPayment;
	
	@FindBy(xpath=Mapping.PlaceOrderButton)
	private WebElement PlaceOrderButton;
	
	@FindBy(xpath=Mapping.Shipping)
	private WebElement ShippingFee;
	
	@FindBy(xpath=Mapping.SubTotal)
	private WebElement SubToTal;
	
	@FindBy(xpath=Mapping.GrandTotal)
	private WebElement GranTotal;
	
	public String getSubTotal() {
		return SubToTal.getText();
	}
	
	public String getShippingFee() {
		return ShippingFee.getText();
	}
	
	public String getGrandTotal() {
		return GranTotal.getText();
	}
	
	public void continueBillingClick() {
		ContinueButton.click();
	}
	
	public void placeOrder() {
		PlaceOrderButton.click();
	}
	
	public void choosePaymentMethod(String paymentMethod) {
		switch (paymentMethod) {
		case "Money Order": 
			MoneyOrderRadio.click();
			break;
		case "Credit Card":
			CreditCardRadio.click();
			break;
		default: break;
		}
		
		ContinueButtonPayment.click();
	}
	
	public void ContinueShippingButtonClick() {
		ContinueShippingButton.click();
	}
	
	public String getShippingPrice() {
		return ShippingPrice.getText();
	}
	
	public void doCheckout(String address, String City, String State, String Zip, String Country, String Telephone, boolean ShipToThisAdd) {
		AdressField.clear();
		AdressField.sendKeys(address);
		CityField.clear();
		CityField.sendKeys(City);
		Select state = new Select(RegionStateDrpdwn);
		state.selectByVisibleText(State);
		ZipField.clear();
		ZipField.sendKeys(Zip);
		Select country = new Select(CountryDrpDwn);
		country.selectByVisibleText(Country);
		TelephoneField.clear();
		TelephoneField.sendKeys(Telephone);
		if (!ShipToThisAdd) ShipToOtherAddRadio.click();
		ContinueButton.click();
	}
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
