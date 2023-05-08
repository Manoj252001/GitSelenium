

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Createdclaimsearch {

	public void SearchCreatedclaim(WebDriver driver, String str) throws IOException, InterruptedException {
		Loginpage loginpage = new Loginpage();
		
		loginpage.ituserlogin(driver);
		WebElement search=driver.findElement(By.id("phSearchInput"));
		search.sendKeys(str);
		search.sendKeys(Keys.ENTER);

		Thread.sleep(10000);
	}
}
