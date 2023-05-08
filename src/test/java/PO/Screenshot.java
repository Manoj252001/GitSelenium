package PO;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

 class Screenshot extends GetDriver
{

	public String takefailedscreenshot(int scs) throws IOException
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File target1 = new File(System.getProperty("user.div")+"/Claim Details"+ scs +".png");
		String target =System.getProperty("user.div")+"/Claim Details"+ scs +".png";
		FileUtils.copyFile(screenshotAs,target1);
		return target;
		
	}

	public void takepassedscreenshot(int scs) throws IOException
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File target1 = new File(System.getProperty("user.div")+"/Claim Details"+ scs +".png");
		FileUtils.copyFile(screenshotAs,target1);
		
	}
	
	public String takescreenshot(String Classname) throws IOException
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/reports/"+ Classname + String.valueOf(new 
                SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date())) 
               + ".png");
		FileUtils.copyFile(screenshotAs,target);
		
		return (System.getProperty("user.dir")+"/reports/"+ Classname + String.valueOf(new 
                SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date())) 
               + ".png");
	}
	
}
