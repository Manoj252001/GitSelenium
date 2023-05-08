
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Firstclaim {

		WebDriver driver;
		Loginpage log = new Loginpage();
		
		@SuppressWarnings("deprecation")
		@BeforeMethod
		public void Setup()
		{
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
	/*	
		@Test(priority = 1)
		public void loginasITUser() throws IOException
		{
			try
			{	
			log.ituserlogin(driver);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1//a[text()='Automation Super IT']")));
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			if(driver.findElement(By.xpath("//h1//a[text()='Automation Super IT']")).isDisplayed())
			{
				//Screenshot
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"/ITUser Successfully Logged in.png");
				FileUtils.copyFile(screenshotAs,target);
			}
			
			else
			{
				//Screenshot
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"ITUser Logged in Failed" +".png");
				FileUtils.copyFile(screenshotAs,target);
			}
			
		}
		
		@Test(priority = 2)
		public void loginasCSRUser() throws InterruptedException, IOException
		{
			try
			{
			log.ituserlogin(driver);
			
			log.caseadjusterlogin(driver);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1//a[text()='BnP_Case_Adjustor_User1 LAIZ']")));
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			if(driver.findElement(By.xpath("//h1//a[text()='BnP_Case_Adjustor_User1 LAIZ']")).isDisplayed())
			{
				//Screenshot
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"Caseadjuster successfully Logged in" +".png");
				FileUtils.copyFile(screenshotAs,target);
				
		    }
			
			else
			{
				//Screenshot
		    	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"Caseadjuster Logged in Failed" +".png");
				FileUtils.copyFile(screenshotAs,target);
			}
			
		}
		
		@Test(priority = 3)
		public void gotosearchclaimpage() throws IOException, InterruptedException
		{
			try
			{
			log.ituserlogin(driver);
			
			log.caseadjusterlogin(driver);
			
			log.gotocontractsearchpage(driver);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1//strong[text()='Enter Caller Information']")));
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			if(driver.findElement(By.xpath("//h1//strong[text()='Enter Caller Information']")).isDisplayed())
			{
			//Screenshot
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"/Successfully goto Search Claim page" +".png");
				FileUtils.copyFile(screenshotAs,target);
				
		    }
			
			else
			{
				//Screenshot
		    	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"/Failed to goto Search Claim page" +".png");
				FileUtils.copyFile(screenshotAs,target);
			}
			
		}
		
		@Test(priority = 4)
		public void gotoclaimcreationpage() throws InterruptedException, IOException
		{

			try
			{
			log.ituserlogin(driver);
			
			log.caseadjusterlogin(driver);
			
			log.gotocontractsearchpage(driver);
			
			log.Searchclaim(driver);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Please Provide Additional Information']")));
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			if(driver.findElement(By.xpath("//h4[text()='Please Provide Additional Information']")).isDisplayed())
			{
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"/Successfully goto the claimcreation page" +".png");
				FileUtils.copyFile(screenshotAs,target);
				
		    }
			
			else
			{
		    	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"/Failed goto the claimcreation page" +".png");
				FileUtils.copyFile(screenshotAs,target);
			}
			
		}

		@Test(priority = 5)
		
		public void createaclaim() throws IOException, InterruptedException
		{

			log.ituserlogin(driver);
			
			log.caseadjusterlogin(driver);
			
			log.gotocontractsearchpage(driver);
			
			log.Searchclaim(driver);
			
			log.detailsforcreateclaim(driver);
			
			try
			{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()=\"Claim Number\"]")));
			Thread.sleep(5000);
			
			if(driver.findElement(By.xpath("//b[text()=\"Claim Number\"]")).isDisplayed())
			  {
				WebElement l = driver.findElement(By.xpath("//b[text()=\"Claim Number\"]"));
				String s4 = l.getText();
				System.out.println("Text is: " + s4);
				
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"/Claim Details" +".png");
				FileUtils.copyFile(screenshotAs,target);
								
			  }

			  else
			  {
				  
		    	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"/Failed Claim" +".png");
				FileUtils.copyFile(screenshotAs,target);
				
			  }
			
			}
			
			catch(Exception e)
			{
				System.out.println(e);
				
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.div")+"/Failed Claim" +".png");
				FileUtils.copyFile(screenshotAs,target);
			}
			
		}
	*/
		@Test
		private void pub() throws FileNotFoundException, IOException
		{
			Loginpage login = new Loginpage();
			login.ituserlogin(driver);
		}
		
		@AfterMethod
		public void close() throws IOException
		{
			driver.close();
		}

}
