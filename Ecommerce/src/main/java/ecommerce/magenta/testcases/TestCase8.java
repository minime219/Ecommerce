package ecommerce.magenta.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import ecommerce.magenta.testcases.utils.TestCaseUtils;

public class TestCase8 extends TestCaseObject {
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.HomepageURL);
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void testReOrder() throws InterruptedException, IOException {
		homePage.accountLinkClick();
		homePage.myAccLinkClick();
		Thread.sleep(2000);
		loginPage.doLogin(TestCaseUtils.Email, TestCaseUtils.Password);
		Thread.sleep(2000);
		userHomePage.reOrderLastOrder();
		Thread.sleep(2000);
		shoppingCartPage.InputQuantity(TestCaseUtils.updatedQuantity);
		shoppingCartPage.doUpdateCart();
		Thread.sleep(2000);
		try {
			Assert.assertEquals(shoppingCartPage.getGrandTotal(), TestCaseUtils.UpdateGrandTotal);
			System.out.println("***Grand Total has been changed to: "+shoppingCartPage.getGrandTotal()+"***");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("***Wrong, Grand Total has not changed!!!***");
			e.printStackTrace();
		}
		
		shoppingCartPage.proceedToCheckout();
		Thread.sleep(2000);
		
		checkOutPage.continueBillingClick();
		Thread.sleep(2000);
		checkOutPage.ContinueShippingButtonClick();
		Thread.sleep(2000);
		checkOutPage.choosePaymentMethod(TestCaseUtils.PaymentMethod);
		Thread.sleep(2000);
		checkOutPage.placeOrder();
		Thread.sleep(2000);
		String orderNummer=checkoutCompletePage.getOrderNummer();
		System.out.println(orderNummer);
		readExcel.writeUpdateExcelFile(TestCaseUtils.Filepath, TestCaseUtils.Filename, TestCaseUtils.Sheetname, orderNummer);
	}
}
