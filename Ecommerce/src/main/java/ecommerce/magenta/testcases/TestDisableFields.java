package ecommerce.magenta.testcases;
import org.testng.Assert;
import org.testng.annotations.*;

import ecommerce.magenta.testcases.utils.TestCaseUtils;
public class TestDisableFields extends TestCaseObject {
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.BackendLoginUrl);
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void verifyOpenCustomerDetail() throws InterruptedException {
		adminLoginPage.doLogin(TestCaseUtils.AdminUser, TestCaseUtils.adminPassword);
		Thread.sleep(2000);
		adminPanelPage.closeAlert();
		Thread.sleep(2000);
		adminPanelPage.manageCustomerLinkClick();
		Thread.sleep(2000);
		customerOverviewPage.firstCustomerClick();
		Thread.sleep(2000);
		customerDetailsPage.customerInfoClick();
		Thread.sleep(2000);
		Assert.assertTrue(!customerDetailsPage.isAssociateWebsiteDrpdwnEndable());
		Assert.assertFalse(customerDetailsPage.isCreateFromFieldEndable());
		Assert.assertEquals("", customerDetailsPage.getNewPassword());
	}

}
