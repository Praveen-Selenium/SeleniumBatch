package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Login_orangeHRM 
{
	@FindBy(name = "username")
	private WebElement user_name;
	
	@FindBy(name = "password")
	private WebElement pswd;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_button;
	
	
	public POM_Login_orangeHRM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUsername(String username)
	{
		user_name.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		pswd.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		login_button.click();
	}
	
}
