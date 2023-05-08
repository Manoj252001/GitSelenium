package PO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

class WorkBook
{
	public HSSFWorkbook sheet() throws IOException {
		File file = new File("C:\\Users\\manoj.mohanraj\\eclipse-workspace\\Manoj1\\src\\test\\resources\\Claimcreation_database.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		return workbook;
	}
	public FileOutputStream sheet1() throws IOException {
		File file = new File("C:\\Users\\manoj.mohanraj\\eclipse-workspace\\Manoj1\\src\\test\\resources\\Claimcreation_database.xls");
		FileOutputStream fis = new FileOutputStream(file);
		return fis;
	}
}
