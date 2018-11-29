package ecommerce.magenta.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ecommerce.magenta.testcases.utils.TestCaseUtils;

public class TestCase4 extends TestCaseObject {
	
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.HomepageURL);
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void testCompare() throws InterruptedException {
		
		homePage.mobileLinkClick();
		Thread.sleep(2000);
		mobilePage.doAddToCompare(TestCaseUtils.ProductToCompare1);
		Thread.sleep(2000);
		mobilePage.doAddToCompare(TestCaseUtils.ProductToCompare2);
		mobilePage.doCompare();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		for (String winHandle: driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(comparePage.getProduct1Name());
		System.out.println(comparePage.getProduct2Name());
		Assert.assertEquals(comparePage.getProduct1Name(), TestCaseUtils.Product1.toUpperCase());
		Assert.assertEquals(comparePage.getProduct2Name(), TestCaseUtils.ProductToCompare2.toUpperCase());
		comparePage.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
	}
}
