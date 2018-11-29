package ecommerce.magenta.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ecommerce.magenta.testcases.utils.TestCaseUtils;

public class TestCase9 extends TestCaseObject {
	
	
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.BackendLoginUrl);
	}
	
	@AfterTest
	public void tearDown() {
		//super.tearDown();
	}
	
	@Test
	public void verifyLogin() throws InterruptedException {
		adminLoginPage.doLogin(TestCaseUtils.AdminUser, TestCaseUtils.adminPassword);
		Thread.sleep(2000);
		adminPanelPage.closeAlert();
		Thread.sleep(2000);
		adminPanelPage.orderssLinkClick();
	}
	
	@Test(dependsOnMethods= {"verifyLogin"})
	public void verifyCancelledOrders() throws InterruptedException {
		ordersPage.selectStatus(TestCaseUtils.StatusToSelect);
		ordersPage.searchButtonClick();
		Thread.sleep(2000);
		System.out.println("search button ok");
		ordersPage.tickCheckboxFirstOrder();
		Thread.sleep(2000);
		ordersPage.selectAction(TestCaseUtils.ActionToSelect);
		System.out.println("select ok");
		ordersPage.clickSubmitButton();
		Thread.sleep(2000);
		Assert.assertEquals(ordersPage.getErrorMessage(), TestCaseUtils.ErrorMessage);
		ordersPage.selectStatus(TestCaseUtils.StatusComplete);
		ordersPage.searchButtonClick();
		Thread.sleep(2000);
		
		ordersPage.tickCheckboxFirstOrder();
		ordersPage.selectAction(TestCaseUtils.ActionToSelect);
		Thread.sleep(2000);
		ordersPage.clickSubmitButton();
		
	}

}
