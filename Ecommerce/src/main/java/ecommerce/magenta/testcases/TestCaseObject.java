package ecommerce.magenta.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ecommerce.magenta.pages.admin.customer.CustomerDetailsPage;
import ecommerce.magenta.pages.admin.customer.CustomerOverview;
import ecommerce.magenta.pages.admin.invoices.InvoicesAdminPage;
import ecommerce.magenta.pages.admin.login.AdminLoginPage;
import ecommerce.magenta.pages.admin.panel.AdminPanelPage;
import ecommerce.magenta.pages.admin.review.EditReviewAdminPage;
import ecommerce.magenta.pages.admin.review.ReviewAdminPage;
import ecommerce.magenta.pages.admin.salesorder.OrdersPage;
import ecommerce.magenta.pages.checkout.CheckoutPage;
import ecommerce.magenta.pages.checkout.complete.CheckoutComplete;
import ecommerce.magenta.pages.compare.CompareProductsPage;
import ecommerce.magenta.pages.createaccount.CreateNewAccountPage;
import ecommerce.magenta.pages.homepage.HomePage;
import ecommerce.magenta.pages.login.LogInPage;
import ecommerce.magenta.pages.mobile.MobilePage;
import ecommerce.magenta.pages.mobile.detail.MobileDetailsPage;
import ecommerce.magenta.pages.search.AdvanceSearch;
import ecommerce.magenta.pages.search.SearchResultPage;
import ecommerce.magenta.pages.shoppingcart.ShoppingCartPage;
import ecommerce.magenta.pages.tv.TvPage;
import ecommerce.magenta.pages.user.homepage.UserHomePage;
import ecommerce.magenta.pages.user.orders.MyOrdersPage;
import ecommerce.magenta.pages.user.orders.details.OrderDetailsPage;
import ecommerce.magenta.pages.wishlist.MyWishlistPage;
import ecommerce.magenta.pages.wishlist.share.ShareWishlistPage;
import ecommerce.magenta.testcases.utils.ReadExcelFile;

public class TestCaseObject {
	WebDriver driver;
	HomePage homePage;
	MobilePage mobilePage;
	MobileDetailsPage mobileDetailsPage;
	CompareProductsPage comparePage;
	LogInPage loginPage;
	ShoppingCartPage shoppingCartPage;
	CreateNewAccountPage createNewAccPage;
	UserHomePage userHomePage;
	MyWishlistPage myWishlistPage;
	ShareWishlistPage shareWishlistPage;
	TvPage tvPage;
	CheckoutPage checkOutPage;
	CheckoutComplete checkoutCompletePage;
	MyOrdersPage myOrdersPage;
	ReadExcelFile readExcel;
	OrderDetailsPage orderDetailsPage;
	AdminLoginPage adminLoginPage;
	AdminPanelPage adminPanelPage;
	OrdersPage ordersPage;
	ReviewAdminPage reviewAdminPage;
	EditReviewAdminPage editReviewAdminPage;
	InvoicesAdminPage invoiceAdminPage;
	AdvanceSearch advanceSearchPage;
	SearchResultPage searchResultPage;
	CustomerOverview customerOverviewPage;
	CustomerDetailsPage customerDetailsPage;
	
	public void init(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homePage = new HomePage(driver);
		mobilePage = new MobilePage(driver);
		mobileDetailsPage = new MobileDetailsPage(driver);
		shoppingCartPage = new ShoppingCartPage(driver);
		comparePage = new CompareProductsPage(driver);
		loginPage = new LogInPage(driver);
		createNewAccPage = new CreateNewAccountPage(driver);
		userHomePage=new UserHomePage(driver);
		myWishlistPage=new MyWishlistPage(driver);
		shareWishlistPage=new ShareWishlistPage(driver);
		tvPage=new TvPage(driver);
		checkOutPage=new CheckoutPage(driver);
		checkoutCompletePage = new CheckoutComplete(driver);
		myOrdersPage=new MyOrdersPage(driver);
		readExcel = new ReadExcelFile();
		orderDetailsPage = new OrderDetailsPage(driver);
		adminLoginPage = new AdminLoginPage(driver);
		adminPanelPage = new AdminPanelPage(driver);
		ordersPage = new OrdersPage(driver);
		reviewAdminPage = new ReviewAdminPage(driver);
		editReviewAdminPage = new EditReviewAdminPage(driver);
		invoiceAdminPage = new InvoicesAdminPage(driver);
		advanceSearchPage = new AdvanceSearch(driver);
		searchResultPage = new SearchResultPage(driver);
		customerOverviewPage = new CustomerOverview(driver);
		customerDetailsPage = new CustomerDetailsPage(driver);
	}
	
	public void tearDown() {
		driver.close();
	}
}
