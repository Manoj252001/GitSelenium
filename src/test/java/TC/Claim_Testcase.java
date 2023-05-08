package TC;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.ITestNGListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;
import PO.*;

@Listeners(PO.ListenerTest.class)
public class Claim_Testcase extends ITuserLogin implements IListeners {

	ITuserLogin object3 = new ITuserLogin();
	Searchcreatedclaim object4 = new Searchcreatedclaim();

//	@Parameters("browser")

	@BeforeMethod
	public void Setup1() 
	{
//		if(browser.equalsIgnoreCase("Edge"))
//		{
//			//create firefox instance
//			object3.launchedge();
//			}
//			//Check if parameter passed as 'chrome'
//			else if(browser.equalsIgnoreCase("chrome"))
//			{
//				//set path to chromedriver.exe
//				object3.launchchrome();
//			}
		object3.launchchrome();
		
	}

	@Test(priority = 1)
	public void CreateaclaimwithUser1() throws IOException, InterruptedException {

		int i = 0;
		object3.ituserlogin(i);

		object3.caseadjusterlogin();

		object3.gotocontractsearchpage();

		object3.Searchclaim(i);

		object3.detailsforcreateclaim(i);

		try {
			if (object3.claimno().isDisplayed()) {

				WebElement l = object3.claimno();
				String s4 = l.getText();
				System.out.println("1st " + s4);

				// program to get only the claim number's
				String[] words = s4.split("\\s");
				String str = words[words.length - 1];
				System.out.println(str);

				int scs = i + 1;
				object4.takepassedscreenshot(scs);

				Thread.sleep(3000);
				object4.SearchCreatedclaim(str, i);
				Thread.sleep(10000);

			}

			else {
				int scs = i + 1;
				object4.takefailedscreenshot(scs);
			}

		}

		catch (Exception e) {
			System.out.println(e);
			int scs = i + 1;
			object4.takefailedscreenshot(scs);
		}

	}

//	
//	  @Test(priority = 2)
//	  
//	  public void CreateaclaimwithUser2() throws IOException, InterruptedException
//	  {
//	  
//	  int i = 1; object3.ituserlogin(i);
//	  
//	  object3.caseadjusterlogin();
//	  
//	  object3.gotocontractsearchpage();
//	  
//	  object3.Searchclaim(i);
//	  
//	  object3.detailsforcreateclaim(i);
//	  
//	  try {
//			if (object3.claimno().isDisplayed()) {
//
//				WebElement l = object3.claimno();
//				String s4 = l.getText();
//				System.out.println("1st " + s4);
//
//				// program to get only the claim number's
//				String[] words = s4.split("\\s");
//				String str = words[words.length - 1];
//				System.out.println(str);
//
//				int scs = i + 1;
//				object4.takepassedscreenshot(scs);
//
//				Thread.sleep(3000);
//				object4.SearchCreatedclaim(str, i);
//				Thread.sleep(10000);
//
//			}
//
//			else {
//				int scs = i + 1;
//				object4.takefailedscreenshot(scs);
//			}
//
//		}
//
//		catch (Exception e) {
//			System.out.println(e);
//			int scs = i + 1;
//			object4.takefailedscreenshot(scs);
//		}
//	  }
	 

	/*
	 * @Test(priority = 3) public void CreateaclaimwithUser3() throws IOException,
	 * InterruptedException {
	 * 
	 * int i = 2; object.ituserlogin(i);
	 * 
	 * object.caseadjusterlogin();
	 * 
	 * object.gotocontractsearchpage();
	 * 
	 * object.Searchclaim(i);
	 * 
	 * object.detailsforcreateclaim(i);
	 * 
	 * try {
	 * 
	 * if(object.claimno().isDisplayed()) {
	 * 
	 * WebElement l = object.claimno(); String s4 = l.getText();
	 * System.out.println("1st " + s4);
	 * 
	 * //program to get only the claim number's String[] words=s4.split("\\s");
	 * String str = words[words.length-1]; System.out.println(str);
	 * 
	 * int scs= i+1; object1.takepassedscreenshot(scs);
	 * 
	 * Thread.sleep(3000); object1.SearchCreatedclaim(str,i); Thread.sleep(10000);
	 * 
	 * }
	 * 
	 * else { int scs= i+1; object1.takefailedscreenshot(scs); }
	 * 
	 * }
	 * 
	 * catch(Exception e) { System.out.println(e); int scs= i+1;
	 * object1.takefailedscreenshot(scs); }
	 * 
	 * }
	 * 
	 * 
	 * /* @Test private void pub() throws IOException, InterruptedException { //
	 * File file = new File(
	 * "D:\\Softwares\\Selenium\\Manoj1\\src\\test\\resources\\Claimcreation_database.xls"
	 * ); // FileInputStream fis = new FileInputStream(file);
	 * // @SuppressWarnings("resource") // HSSFWorkbook workbook = new
	 * HSSFWorkbook(fis); // HSSFSheet sheet = workbook.getSheetAt(1); //create
	 * sheet object // // Row row = sheet.getRow(0); //34022970 String str =
	 * "34022970";
	 * 
	 * System.out.println((row.getCell(5).getNumericCellValue())); //
	 * log.SearchCreatedclaim(driver, str);
	 * 
	 * }
	 * 
	 * 
	 * @Test private void pub() throws IOException, InterruptedException {
	 * driver.get("https://test.salesforce.com/"); object.ituserlogin(0);
	 * Thread.sleep(5000);
	 * driver.findElement(By.linkText("Automation Super IT")).sendKeys(Keys.F5);
	 * String str = "dscd"; String str1 = "dsc";
	 * 
	 * Verify.verify(true, "Assert is false", str, str1);
	 * object.caseadjusterlogin();
	 * 
	 * /* driver.get("https://prism.aspiresys.com/Assurant-QA/timesheet/weekly");
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
	 * WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
	 * 
	 * driver.findElement(By.cssSelector("div label input[class^='input']")).
	 * sendKeys("manoj.mohanraj@aspiresys.coxm");
	 * driver.findElement(By.cssSelector("div button[class^='c-']")).click();
	 * 
	 * Thread.sleep(3000);
	 * driver.findElement(By.cssSelector("div label input[class^='input']")).
	 * sendKeys("hopeapril@12345");
	 * driver.findElement(By.cssSelector("div button[class^='c-']")).click();
	 * 
	 * //Element on which need to drop.
	 * driver.findElement(By.cssSelector("div table tbody ul li:nth-child(2)")).
	 * click();
	 * 
	 * //Using Action class for drag and drop. Actions act = new Actions(driver);
	 */
	// Dragged and dropped.
//	         act.dragAndDrop(From, To).build().perform();		
//	   	}

//  		@Test		
//  		public void onTestSuccess(ITestResult Result)					
//  	    {		
//  	    System.out.println("The name of the testcase passed is :"+Result.getName());					
//  	    }	

	@AfterMethod
	public void close() throws IOException {
		driver.close();
	}

	public Class<? extends ITestNGListener>[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setValue(Class<? extends ITestNGListener>[] value) {
		// TODO Auto-generated method stub

	}

}
