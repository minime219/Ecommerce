package ecommerce.magenta.testcases;
import org.testng.Assert;
import org.testng.annotations.*;

import ecommerce.magenta.testcases.utils.TestCaseUtils;

public class TestCase5 extends TestCaseObject {
	
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.HomepageURL);
		
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void testCreateAcc() throws InterruptedException {
		homePage.accountLinkClick();
		Thread.sleep(2000);
		homePage.myAccLinkClick();
		Thread.sleep(2000);
//		loginPage.CreateAccButtonClick();
//		Thread.sleep(2000);
		loginPage.doLogin(TestCaseUtils.Email, TestCaseUtils.Password);

//		createNewAccPage.doRegister(TestCaseUtils.FirstName, TestCaseUtils.LastName, TestCaseUtils.Email, TestCaseUtils.Password, TestCaseUtils.Password);
		Thread.sleep(2000);
	//	Assert.assertEquals(userHomePage.getMessage(), TestCaseUtils.RegisterSuccessMsg);
	}
	
	@Test(dependsOnMethods={"testCreateAcc"})
	public void testShareWishlist() throws InterruptedException {
		userHomePage.tvLinkClick();
		Thread.sleep(2000);
		tvPage.addToWishlistSamsungClick();
		Thread.sleep(2000);
		myWishlistPage.shareWishlist();
		Thread.sleep(2000);
		shareWishlistPage.shareWishlist(TestCaseUtils.EmailShareWishlist, TestCaseUtils.MessageShareWishlist);
		Thread.sleep(2000);
		Assert.assertEquals(myWishlistPage.getMessage(), TestCaseUtils.WishlistSuccessShared);
	}

}
