package PO;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 class DetailsforCreateclaim extends GetDriver
{
	WorkBook wb = new WorkBook();
	
	@SuppressWarnings("deprecation")
	public void detailsforcreateclaim(int i) throws InterruptedException, IOException
	{
		Properties prop = Globalprop.property();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HSSFWorkbook workbook = wb.sheet();
		HSSFSheet sheet = workbook.getSheetAt(2);
		Row row = sheet.getRow(i);
		int Lastcell=row.getLastCellNum();

	   //ENTER DETAILS IN ADDITIONAL INFO. PAGE :
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(prop.getProperty("RO_Number")))));
		
		driver.findElement(By.xpath(prop.getProperty("RO_Number"))).sendKeys((row.getCell(0)).toString());
		Thread.sleep(6000);
		
		driver.findElement(By.xpath(prop.getProperty("At_Selling_Dealer"))).click();
		Thread.sleep(3000);
		
		WebElement select1=driver.findElement(By.xpath(prop.getProperty("Parts_Guarantee")));
		select1.click();
		Select s1=new Select(select1);
		s1.selectByValue((row.getCell(1)).toString());
		
		WebElement select2=driver.findElement(By.xpath(prop.getProperty("Labor_Guarantee")));
		select2.click();
		Select s2=new Select(select2);
		s2.selectByValue((row.getCell(2)).toString());
		WebElement select3=driver.findElement(By.xpath(prop.getProperty("Driven/Towed")));
		select3.click();
		Select s3=new Select(select3);
		s3.selectByValue((row.getCell(3)).toString());
		
		driver.findElement(By.xpath(prop.getProperty("Caller_Name"))).sendKeys((row.getCell(4)).toString());
		driver.findElement(By.xpath(prop.getProperty("Caller_Phone_Number"))).sendKeys((row.getCell(5)).toString());

		driver.findElement(By.xpath(prop.getProperty("last1_continue"))).click();
		Thread.sleep(5000);

		try
		{
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("last2_continue"))));
		
		driver.findElement(By.xpath(prop.getProperty("last2_continue"))).click();
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
        WebElement confirmationMessage = driver.findElement(By.xpath(prop.getProperty("last2_continue")));

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
        
		/*
		 * try {
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("(//button[@class='slds-button slds-button_neutral button-fix'])[1]")))
		 * ;
		 * 
		 * driver.findElement(By.
		 * xpath("(//button[@class='slds-button slds-button_neutral button-fix'])[1]")).
		 * click();
		 * 
		 * } catch(Exception e) { System.out.println(e); }
		 */
        
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("claimnumber"))));
		
		Thread.sleep(20000);
		
	}
}
