

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchClaim extends Detailsforcreateclaim
{

	public void Searchclaim(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@id='page:form:lex_component:claimDetailComponent:searchInput']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id='page:form:lex_component:claimDetailComponent:searchInput']")).sendKeys("ENT-77115404");
		
		driver.findElement(By.xpath("//input[@id='page:form:lex_component:claimDetailComponent:mileage']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id='page:form:lex_component:claimDetailComponent:mileage']")).sendKeys("18000");
		
		driver.findElement(By.xpath("//input[@id='page:form:lex_component:claimDetailComponent:searchButton']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[@id='createClaimButton'][1]")).click();
		
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span//label//span[@class='slds-checkbox_faux']")));
		driver.findElement(By.xpath("//span//label//span[@class='slds-checkbox_faux']")).click();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
	}
	
}
