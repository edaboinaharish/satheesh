package pomtest;
import org.openqa.selenium.WebDriver;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pompages.ClsEbay;
import pompages.browserfactory;

public class pomebayprodcatsearchtest
{
	
	@Test
	  public void catSearch() 
	  {
		   WebDriver driver=browserfactory.startBrowser("Chrome", "http://ebay.com");

			ClsEbay obj=new ClsEbay(driver);
			obj.fnCatSearch("Cameras & Photo", "Sony");
			
			Reporter.log("Ebay product search in a category test is successful...",true);

	  }
	}