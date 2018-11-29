package ecommerce.magenta.pages.checkout;

public class Mapping {
	public static final String AdressField="billing:street1";
	public static final String CityField="billing:city";
	public static final String RegionState="billing:region_id";
	public static final String ZipField="billing:postcode";
	public static final String CountryDrpDwn="billing:country_id";
	public static final String TelephoneField="billing:telephone";
	public static final String ContinueButton="//button[@title='Continue']";
	public static final String ShipToThisAddRadio="billing:use_for_shipping_yes";
	public static final String ShipToOtherAddRadio="billing:use_for_shipping_no";
	public static final String ShippingPrice="//*[@id=\"checkout-shipping-method-load\"]/dl/dd/ul/li/label/span";
	public static final String ContinueShippingButton="//*[@id=\"shipping-method-buttons-container\"]/button";
	public static final String MoneyOrder="p_method_checkmo";
	public static final String CreditCard="p_method_ccsave";
	public static final String ContinueButtonPayment="//*[@id=\"payment-buttons-container\"]/button";
	public static final String PlaceOrderButton="//button[@title='Place Order']";
	public static final String SubTotal="//*[@id=\"checkout-review-table\"]/tfoot/tr[1]/td[2]/span";
	public static final String Shipping="//*[@id=\"checkout-review-table\"]/tfoot/tr[2]/td[2]/span";
	public static final String GrandTotal="//*[@id=\"checkout-review-table\"]/tfoot/tr[3]/td[2]/strong/span";
	//*[@id="payment-buttons-container"]/button
	//*[@id="checkout-shipping-method-load"]/dl/dd/ul/li/label/span
	//*[@id="checkout-review-table"]/tfoot/tr[1]/td[2]/span
}
