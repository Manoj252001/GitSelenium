
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaseAdjusterLogin extends SearchClaim{

	public void caseadjusterlogin(WebDriver driver) throws InterruptedException, IOException
	{
	
	WebElement search=driver.findElement(By.id("phSearchInput"));
	search.sendKeys("Bnp_Case_Adjustor_User1 LAIZ");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	
	driver.findElement(By.linkText("BnP_Case_Adjustor_User1 LAIZ")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[@id='moderatorMutton']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("#USER_DETAIL")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@name='login'])[1]")).click();
	
//	//Screenshot
//	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//	File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
//	File target = new File(System.getProperty("user.div")+"Caseadjuster successfully Logged in" +".png");
//	FileUtils.copyFile(screenshotAs,target);
//	
//	}
//	catch (Exception e) {
//		System.out.println(e);
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		File target = new File(System.getProperty("user.div")+"Caseadjuster Logged in Failed" +".png");
//		FileUtils.copyFile(screenshotAs,target);
//	}
	}

}
