package ecommerce.magenta.testcases;
import org.testng.annotations.*;

import ecommerce.magenta.testcases.utils.TestCaseUtils;

import java.util.List;

import org.testng.Assert;

public class TestSearchFunctionality extends TestCaseObject {
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.HomepageURL);
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void verifySearchFunctionality() throws InterruptedException {
		homePage.advanceSearchClick();
		Thread.sleep(2000);
		advanceSearchPage.fillPriceFromField(TestCaseUtils.priceFromAdvanceSearch1);
		advanceSearchPage.fillPriceToField(TestCaseUtils.priceToAdvanceSearch1);
		advanceSearchPage.searchButtonClick();
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods= {"verifySearchFunctionality"})
	public void verifySearchResult() throws InterruptedException {
		List<String> products = searchResultPage.getProductNames();
		List<String> prices = searchResultPage.getProductPrices();
		for(int i=0;i<products.size();i++) {
			System.out.println("Product: "+products.get(i));
			System.out.println("Price: "+prices.get(i));
		}
	}
	
	@Test(dependsOnMethods= {"verifySearchResult"})
	public void verifySearchFunctionality1() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
		advanceSearchPage.fillPriceFromField(TestCaseUtils.priceFromAdvanceSearch2);
		advanceSearchPage.fillPriceToField(TestCaseUtils.priceToAdvanceSearch2);
		advanceSearchPage.searchButtonClick();
		Thread.sleep(2000);
		List<String> products = searchResultPage.getProductNames();
		List<String> prices = searchResultPage.getProductPrices();
		for(int i=0;i<products.size();i++) {
			System.out.println("Product: "+products.get(i));
			System.out.println("Price: "+prices.get(i));
		}
	}
}
