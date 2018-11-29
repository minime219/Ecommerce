package ecommerce.magenta.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ecommerce.magenta.testcases.utils.TestCaseUtils;

public class TestCase2 extends TestCaseObject {

	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.HomepageURL);

	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void comparePrice() throws InterruptedException {
		Thread.sleep(2000);
		homePage.mobileLinkClick();
		Thread.sleep(3000);
		String priceSonyOutside = mobilePage.getSonyPrice();
		System.out.println(priceSonyOutside);
		mobilePage.sonyLinkClick();
		Thread.sleep(2000);
		String priceSonyInside = mobileDetailsPage.getMobilePrice();
		System.out.println(priceSonyInside);
		Assert.assertEquals(priceSonyOutside, priceSonyInside);
	}

}
