package ecommerce.magenta.pages.mobile;

public class Mapping {
	
	public static final String PageTitleXpath="//*[@class='page-title category-title']";
	public static final String SortByXpath="//*[@title='Sort By']";
	public static final String ProductListXpath="//li//a[@class='product-image']";
	public static final String ProductNameAttribute = "title";
	public static final String SonyPriceXpath = "//*[@id='product-price-1']/span";
	public static final String SonyLinkXpath = "//a[@title='Sony Xperia']";
	//*[@id="top"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button
	public static final String AddToCartXperia="//a[@title='Xperia']/following-sibling::div/div[@class='actions']/button[@title='Add to Cart']";
	public static final String AddToCompareXperia="//a[@title='Xperia']/following-sibling::div/div[@class='actions']/ul/li/a[@class='link-compare']";
	public static final String AddToCompareIphone="//a[@title='IPhone']/following-sibling::div/div[@class='actions']/ul/li/a[@class='link-compare']";
	public static final String CompareButton="//button[@title='Compare']";
}

