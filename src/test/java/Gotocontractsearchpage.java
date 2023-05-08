

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Gotocontractsearchpage extends Createdclaimsearch
{

	public void gotocontractsearchpage(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.className("allTabsArrow")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='listRelatedObject Custom35Block title']")).click();
		
	}
	
}
