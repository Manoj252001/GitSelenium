package TC;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PO.Globalprop;
import PO.ITuserLogin;

public class Paralleltest1 extends ITuserLogin
{
	public WebDriver driver;
	ITuserLogin object = new ITuserLogin();
	@Test
	public void Setup1() throws IOException 
	{
//		if(browser.equalsIgnoreCase("Edge"))
//		{
//			//create firefox instance
//			object3.launchedge();
//			}
//			//Check if parameter passed as 'chrome'
//			else if(browser.equalsIgnoreCase("chrome"))
//			{
//				//set path to chromedriver.exe
//				object3.launchchrome();
//			}
		Properties prop = Globalprop.property();
		driver = object.launchchrome();
		driver.get(prop.getProperty("url"));
	}
}
