

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LoginSheet extends CaseAdjusterLogin
{

	public String[] fileinput() throws IOException,FileNotFoundException
	{

		File file = new File("D:\\Softwares\\Selenium\\Manoj1\\src\\test\\resources\\Claimcreation_database.xls");
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(0);    //create sheet object
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

		return array;

	}
}
