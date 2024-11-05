package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class POM_Homepage_orangeHRM 
{
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim_buttom;
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement add_emp_button;
	
	@FindBy(name = "firstName")
	private WebElement first_name;
	
	@FindBy(name = "lastName")
	private WebElement last_name;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement save_button;
	
	
	public POM_Homepage_orangeHRM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnPIM()
	{
		pim_buttom.click();
	}
	
	public void clickOnAddEmployee()
	{
		add_emp_button.click();
	}
	
	public void enterFirstname(String fName)
	{
		first_name.sendKeys(fName);
	}
	
	public void enterLastname(String lName)
	{
		last_name.sendKeys(lName);
	}
	
	public void clickOnSave()
	{
		save_button.click();
	}

}
