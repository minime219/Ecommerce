package ecommerce.magenta.testcases;
import org.testng.annotations.*;

import java.util.LinkedList;

import org.testng.Assert;


import ecommerce.magenta.testcases.utils.TestCaseUtils;
public class TestCase1 extends TestCaseObject {
	
	
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.HomepageURL);
	
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void verifySortBy() throws InterruptedException {
		System.out.println(homePage.getTitle() + "---   " + TestCaseUtils.HomePageTitle);
		Assert.assertTrue(homePage.getTitle().startsWith(TestCaseUtils.HomePageTitle));
		Thread.sleep(4000);
		homePage.mobileLinkClick();
		Thread.sleep(4000);
		Assert.assertEquals(mobilePage.getPageTitle(), TestCaseUtils.MobilePageTitle);
		mobilePage.doSortBy(TestCaseUtils.SortBy);
		LinkedList<String> sortedNameList = (LinkedList<String>) mobilePage.getProductNames();
		for(int i=1;i<sortedNameList.size();i++) {
			System.out.println(sortedNameList.get(i-1));
			Assert.assertTrue(sortedNameList.get(i).compareTo(sortedNameList.get(i-1))>=0);
		}
	}

}
