package ecommerce.magenta.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ecommerce.magenta.testcases.utils.TestCaseUtils;

public class TestCase10 extends TestCaseObject {
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.ReviewURL);
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void verifyReview() throws InterruptedException {
		mobileDetailsPage.sendReview(TestCaseUtils.Review);
		Thread.sleep(1000);
		mobileDetailsPage.sendSummary(TestCaseUtils.Summary);
		Thread.sleep(1000);
		mobileDetailsPage.sendNickname(TestCaseUtils.Nickname);
		Thread.sleep(1000);
		mobileDetailsPage.submit();
	}
	
	@Test(dependsOnMethods= {"verifyReview"})
	public void verifyReviewAdmin() throws InterruptedException {
		driver.navigate().to(TestCaseUtils.BackendLoginUrl);
		
		Thread.sleep(2000);
		adminLoginPage.doLogin(TestCaseUtils.AdminUser, TestCaseUtils.adminPassword);
		Thread.sleep(2000);
		adminPanelPage.closeAlert();
		adminPanelPage.pendingReviewsLinkClick();
		Thread.sleep(2000);
		reviewAdminPage.sortByID();
		Thread.sleep(2000);
		reviewAdminPage.sortByID();
		Thread.sleep(2000);
		reviewAdminPage.chooseFirstReview();
		Thread.sleep(2000);
		reviewAdminPage.editFirstReview();
		Thread.sleep(2000);
		editReviewAdminPage.chooseStatus(TestCaseUtils.statusReviewApproved);
		Thread.sleep(2000);
		editReviewAdminPage.saveReview();
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods= {"verifyReviewAdmin"})
	public void verifyUserReviewIsShown() throws InterruptedException {
		driver.navigate().to(TestCaseUtils.HomepageURL);
		Thread.sleep(2000);
		homePage.mobileLinkClick();
		Thread.sleep(2000);
		mobilePage.sonyLinkClick();
		Thread.sleep(2000);
		mobileDetailsPage.clickReviewTab();
		String latestComment= mobileDetailsPage.getLatestReview();
		Assert.assertEquals(latestComment, TestCaseUtils.Summary.toUpperCase());
		
	}
}
