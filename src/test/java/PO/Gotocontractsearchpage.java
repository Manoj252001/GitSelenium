package PO;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

class Gotocontractsearchpage extends Searchclaimpage
{
	@SuppressWarnings("deprecation")
	public void gotocontractsearchpage() throws InterruptedException, IOException
	{
		Properties prop = Globalprop.property();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className(prop.getProperty("alltabsarrow"))).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("contractsearchlink"))).click();
		
	}
}
