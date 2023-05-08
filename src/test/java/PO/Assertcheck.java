package PO;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

 class Assertcheck extends Screenshot
{
	WorkBook wb = new WorkBook();
	public void checking(int i) throws IOException
	{
		
		WebElement contract = driver.findElement(By.xpath("(//td[@class=\"dataCol col02\"]//a)[1]"));
		String str = contract.getText();
		HSSFWorkbook workbook = wb.sheet();
		HSSFSheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(i);
		HSSFSheet sheet1 = workbook.getSheetAt(2);
		Row row1 = sheet1.getRow(i);
		
		Assert.assertEquals((row.getCell(0).toString()),driver.findElement(By.xpath("(//td[@class=\"dataCol col02\"]//a)[1]")).getText()); 
		Assert.assertEquals((row1.getCell(0).toString()),driver.findElement(By.xpath("(//table[@class=\"detailList\"]//td[@class=\"dataCol col02\"])[20]")).getText()); 
		Assert.assertEquals((row1.getCell(3).toString()),driver.findElement(By.xpath("(//table[@class=\"detailList\"]//td[@class=\"dataCol col02\"])[21]")).getText()); 
		Assert.assertEquals((row1.getCell(4).toString()),driver.findElement(By.xpath("(//table[@class=\"detailList\"]//tr//td[@class=\"dataCol\"])[22]")).getText());
		
		System.out.println(str);
		
	}
}
