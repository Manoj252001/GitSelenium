package PO;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReports 
{

	public static ExtentReports getreports() 
	{
		String path = System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation result");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		extend.setSystemInfo("Tester", "Manoj1");
		return extend;
		
	}
	
}
