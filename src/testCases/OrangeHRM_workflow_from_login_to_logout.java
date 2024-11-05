package testCases;

import org.testng.annotations.Test;

import genericScripts.Generic_Script_orange_HRM;
import pageObjectModel.POM_Homepage_orangeHRM;
import pageObjectModel.POM_Login_orangeHRM;

public class OrangeHRM_workflow_from_login_to_logout extends Generic_Script_orange_HRM
{
	@Test
	public void workflow() throws Exception
	{
		POM_Login_orangeHRM p1 = new POM_Login_orangeHRM(driver);
		p1.enterUsername("Admin");
		Thread.sleep(1000);
		p1.enterPassword("admin123");
		Thread.sleep(1000);
		p1.clickOnLogin();
		
		Thread.sleep(2000);
		
		POM_Homepage_orangeHRM p2 = new POM_Homepage_orangeHRM(driver);
		p2.clickOnPIM();
		Thread.sleep(2000);
		p2.clickOnAddEmployee();
		Thread.sleep(2000);
		p2.enterFirstname("Praveen");
		Thread.sleep(1000);
		p2.enterLastname("Kulkarni");
		Thread.sleep(1000);
		p2.clickOnSave();
		
		Thread.sleep(2000);
	}
}
