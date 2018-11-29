package ecommerce.magenta.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ecommerce.magenta.testcases.utils.TestCaseUtils;
public class TestCase6 extends TestCaseObject {
	
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.HomepageURL);
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void testOrder() throws InterruptedException, IOException {   
		homePage.accountLinkClick();
		homePage.myAccLinkClick();
		Thread.sleep(2000);
		loginPage.doLogin(TestCaseUtils.Email, TestCaseUtils.Password);
		Thread.sleep(2000);
		userHomePage.MyWishlistLinkClick();
		Thread.sleep(2000);
		myWishlistPage.AddToCartClick();
		Thread.sleep(2000);
		shoppingCartPage.proceedToCheckout();
		Thread.sleep(2000);
		checkOutPage.continueBillingClick();
	//	checkOutPage.doCheckout( TestCaseUtils.Street, TestCaseUtils.City, TestCaseUtils.State, TestCaseUtils.Zip, TestCaseUtils.Country, TestCaseUtils.Telephone, TestCaseUtils.ShipToThisAdd);
		Thread.sleep(2000);
		Assert.assertEquals(checkOutPage.getShippingPrice(), TestCaseUtils.ShippingPrice);
		checkOutPage.ContinueShippingButtonClick();
		Thread.sleep(2000);
		checkOutPage.choosePaymentMethod(TestCaseUtils.PaymentMethod);
		Thread.sleep(2000);
		System.out.println(checkOutPage.getSubTotal());
		System.out.println(checkOutPage.getShippingFee());
		System.out.println(checkOutPage.getGrandTotal());
		String subTotalString= checkOutPage.getSubTotal();
		String subTotalNumber= subTotalString.substring(subTotalString.indexOf("$")+1);
		System.out.println(subTotalNumber);
		double subTotal = Double.parseDouble(subTotalNumber);
		String shippingFeeString=checkOutPage.getShippingFee();
		String shippingNumber=shippingFeeString.substring(shippingFeeString.indexOf("$")+1);
		double shippingFee=Double.parseDouble(shippingNumber);
		
		String grandTotalString=checkOutPage.getGrandTotal();
		String grandTotalNumber=grandTotalString.substring(grandTotalString.indexOf("$")+1);
		double grandTotal=Double.parseDouble(grandTotalNumber);
		
		Assert.assertTrue(subTotal+shippingFee==grandTotal);
		
		checkOutPage.placeOrder();
		Thread.sleep(2000);
		String bestellung = checkoutCompletePage.getOrderNummer();
		
	/*	Sheet sheet = readExcel.readExcelFile(TestCaseUtils.Filepath, TestCaseUtils.Filename, TestCaseUtils.Sheetname);
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row newrow=sheet.createRow(rowCount+1); */
		System.out.println(bestellung);
		readExcel.writeExcelFile(TestCaseUtils.Filepath, TestCaseUtils.Filename, TestCaseUtils.Sheetname, bestellung);
		
		Assert.assertEquals(checkoutCompletePage.getPageTitle(), TestCaseUtils.HeaderOrderSuccess.toUpperCase());
		
	}
}
