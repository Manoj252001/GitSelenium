package PO;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

class CaseAdjusterLogin extends Gotocontractsearchpage
{
	WorkBook wb = new WorkBook();

	public void caseadjusterlogin() throws InterruptedException, IOException
	{
	
	Properties prop= Globalprop.property();
	WebElement search=driver.findElement(By.id(prop.getProperty("phsearch")));
	search.sendKeys("Bnp_Case_Adjustor_User1 LAIZ");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	
	driver.findElement(By.linkText(prop.getProperty("caseadjustername"))).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath(prop.getProperty("moderatorbutton"))).click();
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector(prop.getProperty("userdetail"))).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(prop.getProperty("secondloginbutton"))).click();
	
	}

}