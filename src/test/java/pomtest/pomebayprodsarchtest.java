package pomtest;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pompages.ClsEbay;
import pompages.browserfactory;


public class pomebayprodsarchtest {
	

	@Test
	public void prodSearch()
	{
		WebDriver driver=browserfactory.startBrowser("Chrome", "http://ebay.com");

		ClsEbay obj=new ClsEbay(driver);
		obj.fnSearch("Sony");
		
		Reporter.log("Ebay product search test is successful...",true);

	}
	  
  }

