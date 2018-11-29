package ecommerce.magenta.pages.admin.invoices;

public class Mapping {
	public static final String invoiceDateHeader="//*[@id=\"sales_invoice_grid_table\"]/thead/tr[1]/th[3]/span/a/span";
	public static final String invoiceDates="//table/tbody/tr/td[count(//table/thead/tr/th[.=\"Invoice Date\"]/preceding-sibling::th)+1]";
}
