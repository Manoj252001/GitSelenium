
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.apache.logging.log4j.LogManager;
public class Loginpage extends LoginSheet
{
/*	@SuppressWarnings({ "deprecation" })
	public void ituserlogin(WebDriver driver,int i) throws IOException
	{

	    String[] str1 = super.fileinput();
		
//	    System.out.println(str1.length);
//	    
//	    for(int i=0,j=1;i<str1.length;i=i+2,j++)
//	    {
/*	    FileInputStream fis = new FileInputStream("D:\\Softwares\\Selenium\\Manoj1\\src\\test\\resources\\login.xls");
		@SuppressWarnings("resource")
		
//		Workbook workbook;
//		File newFile = new File("D:\\Softwares\\Selenium\\Manoj1\\target\\test-classes\\login.xls");
//		if (newFile.exists()) { 
//		   // Load existing
//		   workbook = WorkbookFactory.create(newFile);
//		} else {
//		   // What kind of file are they trying to ask for?
//		   // Add additional supported types here
//		   if (newFile.getName().endsWith(".xls")) {
//		      workbook = new HSSFWorkbook();
//		   }
//		   else if (newFile.getName().endsWith(".xlsx")) {
//		      workbook = new XSSFWorkbook();
//		   }
//		   else {
//		      throw new IllegalArgumentException("I don't know how to create that kind of new file");
//		   }
//		}
//		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = (HSSFSheet) workbook.getSheetAt(0);    //create sheet object
		int num = sheet.getLastRowNum();			 //get Last row Number
		String[] array=new String[(num+1)*2];
		for(int i=0,k=0;i<=num&k<6;i++,k+=2)
		{
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			Cell cell1 = row.getCell(1);

			array[k]  = cell.toString();
			array[k+1]= cell1.toString();

		}
		
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
		driver.get("https://test.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys(str1[0]);
		
		driver.findElement(By.id("password")).sendKeys(str1[1]);
		
		driver.findElement(By.id("Login")).click();

//	    }
	    
	}
*/
	@SuppressWarnings("deprecation")
	public void ituserlogin(WebDriver driver) throws FileNotFoundException, IOException {

	    String[] str1 = super.fileinput();

	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		driver.get("https://test.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys(str1[0]);
		
		driver.findElement(By.id("password")).sendKeys(str1[1]);
		
		driver.findElement(By.id("Login")).click();
		
	}
	

}
