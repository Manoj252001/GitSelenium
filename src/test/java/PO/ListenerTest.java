package PO;
import java.io.IOException;

import org.testng.ITestContext;		
import org.testng.ITestListener;		
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import TC.Claim_Testcase;		

public class ListenerTest extends Claim_Testcase implements ITestListener						
{	
	Searchcreatedclaim object = new Searchcreatedclaim();
	ExtentTest test;
	ExtentReports extend = ExtendReports.getreports();

    public void onFinish(ITestContext Result) 					
    {		
        extend.flush();	
    }		

    public void onStart(ITestContext Result)					
    {		
    	System.out.println(Result.getClass()+"testcase is started");	
		
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    		
    }		

    // When Test case get failed, this method is called.		
    public void onTestFailure(ITestResult Result) 					
    {	
    	
    	System.out.println("The name of the testcase failed is :"+Result.getName());	
    	try 
    	{
			String str = object.takescreenshot(Result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(str, Result.getMethod().getMethodName());
		} 
    	catch (IOException e)
    	{
			e.printStackTrace();
		}
    	
        test.fail(Result.getThrowable());
        
    }		

    // When Test case get Skipped, this method is called.		
    public void onTestSkipped(ITestResult Result)					
    {		
    	String str;
		try 
		{
			str = object.takescreenshot(Result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(str, Result.getMethod().getMethodName());

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
     test.log(Status.SKIP, "Test Skipped");
     System.out.println("The name of the testcase Skipped is :"+Result.getName());					
    }		

    // When Test case get Started, this method is called.		
    public void onTestStart(ITestResult Result)					
    {		
    test = extend.createTest(Result.getMethod().getMethodName());
    System.out.println(Result.getName()+" test case started");					
    }		

    // When Test case get passed, this method is called.		
    public void onTestSuccess(ITestResult Result)					
    {		
    String str="";
	try 
	{
		str = object.takescreenshot(Result.getMethod().getMethodName());
	} 
	catch (IOException e)
	{
		e.printStackTrace();
	}
	test.addScreenCaptureFromPath(str, Result.getMethod().getMethodName());
    test.log(Status.PASS, "Test Passed");
    System.out.println("The name of the testcase passed is :"+Result.getName());					
    }		

}