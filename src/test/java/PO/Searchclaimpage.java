package PO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 class Searchclaimpage extends DetailsforCreateclaim
{
	WorkBook wb = new WorkBook();
	@SuppressWarnings("deprecation")
	public void Searchclaim(int i) throws InterruptedException, IOException
	{
		Properties prop = Globalprop.property();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HSSFWorkbook workbook = wb.sheet();
		HSSFSheet sheet = workbook.getSheetAt(1);

		Row row = sheet.getRow(i);
		int Lastcell = row.getLastCellNum();
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(prop.getProperty("Searchinput"))).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath(prop.getProperty("Searchinput"))).sendKeys(row.getCell(0).toString());

		driver.findElement(By.xpath(prop.getProperty("mileage"))).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath(prop.getProperty("mileage"))).sendKeys(row.getCell(1).toString());

		driver.findElement(By.xpath(prop.getProperty("searchbutton"))).click();


		try
		{

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("createclaimbutton"))));
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		WebElement confirmationMessage = driver.findElement(By.xpath(prop.getProperty("createclaimbutton")));

        HSSFCell cell = sheet.getRow(i).createCell(Lastcell);
        if(confirmationMessage.isDisplayed())
        {
        	cell.setCellValue("Value's are passed");
        }
        else
        {
        	cell.setCellValue("Value passing was Failed");
        }
        
        workbook.write(wb.sheet1());
        workbook.close();
		driver.findElement(By.xpath(prop.getProperty("createclaimbutton"))).click();
		
		try
		{
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("createclaimcheckbox"))));
		
			driver.findElement(By.xpath(prop.getProperty("createclaimcheckbox"))).click();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("createclaimcontinue"))));
		
			driver.findElement(By.xpath(prop.getProperty("createclaimcontinue"))).click();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
	}
}
