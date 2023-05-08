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
public class Claim_Testcase2 extends ITuserLogin implements IListeners
{

		ITuserLogin object1 = new ITuserLogin();
		Searchcreatedclaim object2 = new Searchcreatedclaim();
		
		@BeforeMethod
//		@Parameters("browser")
		public void Setup1() 
		{
//			if(browser.equalsIgnoreCase("Edge"))
//			{
//				//create firefox instance
//				object1.launchedge();
//				}
//				//Check if parameter passed as 'chrome'
//				else if(browser.equalsIgnoreCase("chrome"))
//				{
//					//set path to chromedriver.exe
//					object1.launchchrome();
//				}
			object1.launchedge();
		}

		@Test(priority = 1)
		
		public void CreateaclaimwithUser3() throws IOException, InterruptedException
		{

			int i = 1;
			object1.ituserlogin(i);
			
			object1.caseadjusterlogin();
			
			object1.gotocontractsearchpage();
			
			object1.Searchclaim(i);
			
			object1.detailsforcreateclaim(i);
			
			try
			{
			 
			if(object1.claimno().isDisplayed())
			  {
				
				WebElement l = object1.claimno();
				String s4 = l.getText();
				System.out.println("2nd " + s4);
				
				//program to get only the claim number's
				String[] words=s4.split("\\s");
			 	String str = words[words.length-1];
				System.out.println(str);

				int scs= i+1;
				object2.takepassedscreenshot(scs);
				
				Thread.sleep(3000);
				object2.SearchCreatedclaim(str,i);
				Thread.sleep(10000);
				
			  }

			  else
			  {
				int scs= i+1;
				object2.takefailedscreenshot(scs);
			  }
			
			}
			
			catch(Exception e)
			{
				System.out.println(e);
				int scs= i+1;
				object2.takefailedscreenshot(scs);
			}
			
		}		

//		 @Test(priority = 2)
//		  
//		  public void CreateaclaimwithUser4() throws IOException, InterruptedException
//		  {
//		  
//		  int i = 1; object1.ituserlogin(i);
//		  
//		  object1.caseadjusterlogin();
//		  
//		  object1.gotocontractsearchpage();
//		  
//		  object1.Searchclaim(i);
//		  
//		  object1.detailsforcreateclaim(i);
//		  
//		  try {
//				if (object1.claimno().isDisplayed()) {
//
//					WebElement l = object1.claimno();
//					String s4 = l.getText();
//					System.out.println("1st " + s4);
//
//					// program to get only the claim number's
//					String[] words = s4.split("\\s");
//					String str = words[words.length - 1];
//					System.out.println(str);
//
//					int scs = i + 1;
//					object2.takepassedscreenshot(scs);
//
//					Thread.sleep(3000);
//					object2.SearchCreatedclaim(str, i);
//					Thread.sleep(10000);
//
//				}
//
//				else {
//					int scs = i + 1;
//					object2.takefailedscreenshot(scs);
//				}
//
//			}
//
//			catch (Exception e) {
//				System.out.println(e);
//				int scs = i + 1;
//				object2.takefailedscreenshot(scs);
//			}
//		  }
		 
		
		@AfterMethod
		public void close() throws IOException
		{
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

