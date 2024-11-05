package genericScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjectModel.POM_logout_orangeHRM;

public class Generic_Script_orange_HRM 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openTheApplication()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
	
	@AfterMethod
	public void closeTheApplication() throws Exception
	{
		POM_logout_orangeHRM p3 = new POM_logout_orangeHRM(driver);
		p3.clickOnLogoutDropdown();
		Thread.sleep(1000);
		p3.clickOnLogoutButton();
		Thread.sleep(2000);
		driver.close();
	}
	
}
