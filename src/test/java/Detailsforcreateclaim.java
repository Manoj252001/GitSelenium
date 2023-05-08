

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Detailsforcreateclaim extends Gotocontractsearchpage
{

	@SuppressWarnings("deprecation")
	public void detailsforcreateclaim(WebDriver driver) throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	   //ENTER DETAILS IN ADDITIONAL INFO. PAGE :
		driver.findElement(By.xpath("(//input[@class=\"slds-input\"])[1]")).sendKeys("MSdhoni4");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("(//span[@class=\"slds-checkbox_faux\"])[1]")).click();
		Thread.sleep(3000);
		
		WebElement select1=driver.findElement(By.xpath("(//select[@class='slds-select'])[1]"));
		select1.click();
		Select s1=new Select(select1);
		s1.selectByValue("12/12,000");
		
		WebElement select2=driver.findElement(By.xpath("(//select[@class=\"slds-select\"])[2]"));
		select2.click();
		Select s2=new Select(select2);
		s2.selectByValue("12/12,000");
		WebElement select3=driver.findElement(By.xpath("(//select[@class=\"slds-select\"])[3]"));
		select3.click();
		Select s3=new Select(select3);
		s3.selectByValue("Driven");
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("MSdhoni16");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("9876890543");
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_neutral button-fix'])[1]")));
		
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_neutral button-fix'])[1]")).click();
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		Thread.sleep(3000);
		
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button slds-button_neutral button-fix'])[1]")));
		
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_neutral button-fix'])[1]")).click();
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		Thread.sleep(20000);
		
	}
	
}
