package ecommerce.magenta.testcases;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.*;

import ecommerce.magenta.testcases.utils.TestCaseUtils;
public class TestCase7 extends TestCaseObject {
	
	@BeforeTest
	public void init() {
		super.init(TestCaseUtils.HomepageURL);
	}
	
	@AfterTest
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void verifyOrders() throws InterruptedException, IOException {
		homePage.accountLinkClick();
		homePage.myAccLinkClick();
		Thread.sleep(2000);
		loginPage.doLogin(TestCaseUtils.Email, TestCaseUtils.Password);
		Thread.sleep(2000);
		userHomePage.myOdersLinkClick();
		Thread.sleep(2000);
		String actualLastOrderNumber = myOrdersPage.getFirstOrderNumber();
		Sheet sheet = readExcel.readExcelFile(TestCaseUtils.Filepath, TestCaseUtils.Filename, TestCaseUtils.Sheetname);
		String lastOrderNumber= sheet.getRow(sheet.getLastRowNum()).getCell(0).getStringCellValue();
		System.out.println(actualLastOrderNumber+"---"+lastOrderNumber);
		
		Assert.assertEquals(actualLastOrderNumber, lastOrderNumber);
		System.out.println(myOrdersPage.getLatestOrderStatus()+"---"+TestCaseUtils.LastOrderStatus);
		Assert.assertEquals(myOrdersPage.getLatestOrderStatus(), TestCaseUtils.LastOrderStatus);
		myOrdersPage.viewLastOrder();
		Thread.sleep(2000);
		
		
	}

}
