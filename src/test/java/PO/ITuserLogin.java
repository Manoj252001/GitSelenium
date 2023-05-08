package PO;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PO.*;

@SuppressWarnings("unused")
public class ITuserLogin extends CaseAdjusterLogin
{
//	ITuserLogin object = new ITuserLogin();
	WorkBook wb = new WorkBook();
	
	@SuppressWarnings("deprecation")
	public void ituserlogin(int i) throws IOException
	{
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	    Properties prop = Globalprop.property();
	    
		HSSFWorkbook workbook = wb.sheet();
		HSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(i);
		int lastcell = row.getLastCellNum();
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id(prop.getProperty("firstpageusername"))).sendKeys((row.getCell(0)).toString());
		
		driver.findElement(By.id(prop.getProperty("firstpagePassword"))).sendKeys((row.getCell(1)).toString());
		
		driver.findElement(By.id(prop.getProperty("firstpageloginbutton"))).click();

		try
		{
		if(driver.findElement(By.id(prop.getProperty("phsearch"))).isDisplayed())
		{
			WebElement confirmationMessage = driver.findElement(By.id(prop.getProperty("phsearch")));

			Assert.assertEquals(confirmationMessage, confirmationMessage); 	
			
		 }

		}
		catch(Exception e)
		{
			WebElement findElement = driver.findElement(By.xpath(prop.getProperty("loginerror")));
			String str = findElement.getText();
			System.out.println(str);
		}
		
		WebElement confirmationMessage = driver.findElement(By.id(prop.getProperty("phsearch")));

		HSSFCell cell = sheet.getRow(i).createCell(lastcell);
     	if(confirmationMessage.isDisplayed())
        {
        	cell.setCellValue("Value's are passed");
        }
        else
        {
        	cell.setCellValue("Value's passing was Failed");
        }
        
        workbook.write(wb.sheet1());
        workbook.close();
	    
	}
	
	public WebElement claimno() throws IOException
	{
		
	    Properties prop = Globalprop.property();
		WebElement element = driver.findElement(By.xpath(prop.getProperty("claimno")));
		
		return element;
	}

}
	