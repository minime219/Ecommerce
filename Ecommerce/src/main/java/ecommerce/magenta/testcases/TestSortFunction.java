package ecommerce.magenta.testcases;
import org.testng.annotations.*;

import ecommerce.magenta.testcases.utils.TestCaseUtils;

import java.util.List;

import org.testng.Assert;

public class TestSortFunction extends TestCaseObject {
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.BackendLoginUrl);
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void verifySortFunction() throws InterruptedException{
		adminLoginPage.doLogin(TestCaseUtils.AdminUser, TestCaseUtils.adminPassword);
		Thread.sleep(2000);
		adminPanelPage.closeAlert();
		Thread.sleep(2000);
		adminPanelPage.invoicesLinkClick();
		Thread.sleep(2000);
		invoiceAdminPage.sortDate();
		Thread.sleep(2000);
		List<String> datesSorted = invoiceAdminPage.getSortedDate();
		for(String s:datesSorted) {
			System.out.println(s);
		}
	}
}
