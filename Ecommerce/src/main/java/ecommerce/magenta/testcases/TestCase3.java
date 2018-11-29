package ecommerce.magenta.testcases;
import org.testng.annotations.*;

import ecommerce.magenta.testcases.utils.TestCaseUtils;

import org.testng.Assert;

public class TestCase3 extends TestCaseObject {
	
	
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.HomepageURL);
		}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void testOverOder() throws InterruptedException {
		homePage.mobileLinkClick();
		Thread.sleep(2000);
		mobilePage.addToCartXperia();
		Thread.sleep(3000);
		shoppingCartPage.InputQuantity(TestCaseUtils.OverQuantity);
		shoppingCartPage.doUpdateCart();
		Thread.sleep(2000);
		Assert.assertEquals(shoppingCartPage.getMessage(), TestCaseUtils.OverOrderMessage);
		System.out.println(shoppingCartPage.getMessage()+"---"+ TestCaseUtils.OverOrderMessage);
		shoppingCartPage.doEmpty();
		Thread.sleep(2000);
		Assert.assertEquals(shoppingCartPage.getPageTitle(), TestCaseUtils.ShoppingCartEmptyMsg);
		System.out.println(shoppingCartPage.getPageTitle()+"---"+TestCaseUtils.ShoppingCartEmptyMsg);
	}
}
