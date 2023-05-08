package PO;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Searchcreatedclaim extends Assertcheck
{
//	ITuserLogin obj = new ITuserLogin();
	ITuserLogin object = new ITuserLogin();

	Assertcheck as = new Assertcheck();
	
	@SuppressWarnings("deprecation")
	public void SearchCreatedclaim(String str,int i) throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		object.ituserlogin(1);
		object.caseadjusterlogin();
		WebElement search=driver.findElement(By.id("phSearchInput"));
		search.sendKeys(str);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//td//a[@data-seclke=\"Case\"])[2]")).click();
		as.checking(i);
		
	}
}
