package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

 class GetDriver
{
	public static WebDriver driver;

	public WebDriver launchchrome()
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj.mohanraj\\eclipse-workspace\\Manoj1\\src\\test\\resources\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("-Xiss512KB");
	options.addArguments("-XX:MainThreadStackSize=512KB");
	options.addArguments("--remote-allow-origins=*");

	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	return driver;
	
	}
	
	public WebDriver launchedge()
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj.mohanraj\\eclipse-workspace\\Manoj1\\src\\test\\resources\\msedgedriver.exe");
	EdgeOptions options = new EdgeOptions();
	options.addArguments("-Xiss512KB");
	options.addArguments("-XX:MainThreadStackSize=512KB");
	options.addArguments("--remote-allow-origins=*");

	driver = new EdgeDriver(options);
	driver.manage().window().maximize();
	
	return driver;
	
	}
}
