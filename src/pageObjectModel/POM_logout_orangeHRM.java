package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_logout_orangeHRM 
{
	@FindBy(xpath = "//p[text()='FirstNameTest LastNameTest']")
	private WebElement logout_dropdown;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout_button;
	
	
	public POM_logout_orangeHRM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnLogoutDropdown()
	{
		logout_dropdown.click();
	}
	
	public void clickOnLogoutButton()
	{
		logout_button.click();
	}
	
}
