package Hybridedemos;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pompages.ClsEbay;
import pompages.browserfactory;
import pompages.ebaytestdeta;

public class Hybridebayprodcatsearchtest {
	@Test(dataProvider = "ebayData")
	public void prodSearch(String cat,String prod) 
	{
		WebDriver driver=browserfactory.startBrowser("Chrome", "http://ebay.com");

		ClsEbay obj=new ClsEbay(driver);
		obj.fnSearch(prod);
		
		Reporter.log("'" + prod + "' product search test is Successful...",true);
	}

	@DataProvider
	public Object[][] ebayData() throws Exception
	{
		Object[][] myData=ebaytestdeta.getExcelData("C:\\\\Users\\\\HARISH\\\\eclipse-workspace\\\\Maven\\\\src\\\\test\\\\resources\\\\ebayprodsarch.xlsx");

		return myData;
	}
}




