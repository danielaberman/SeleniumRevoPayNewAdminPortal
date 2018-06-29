package Revopay;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends base{

	@Test(dataProvider="getData")
	
	public WebDriver basePageNavigation(String username, String password) throws IOException, InterruptedException
	{
		driver=initializeDriver();
		//driver.get("https://qa3-admin-app.revopay.com/");
		driver.get(prop.getProperty("url"));
		//System.out.println(prop.getProperty("url"));
		
		//System.out.println(prop.getProperty("browser"));
		LoginPage l = new LoginPage(driver);
		
		//System.out.println(l.getUsername().isDisplayed());
		Assert.assertEquals(true, l.getUsername().isDisplayed()); //NewAP-158 Step 1 Passed
		//System.out.println(l.getPassword().isDisplayed());
		Assert.assertEquals(true, l.getPassword().isDisplayed()); //NewAP-158 Step 1 Passed
		//System.out.println(l.getLoginButton().isDisplayed());
		Assert.assertEquals(true, l.getLoginButton().isDisplayed()); //NewAP-158 Step 1 Passed
		
		
		
		l.getUsername().sendKeys(username);
		l.getPassword().sendKeys(password);
		//System.out.println(text);
		l.getLoginButton().click();
		
		/* Good code, but should be moved to another test case
				LandingPage lp = new LandingPage(driver);
				lp.Dashboard().click();
				lp.Reports().click();
				Thread.sleep(1000);  // needed to put in delay.  Otherwise, Manage below doesn't expand.
				lp.Manage().click();
				lp.ManageMerchants().click();
		*/
		return driver;
	}
	
	
	public void addTwoNumbers(int a, int b)
	{
		int sum;
		sum=a+b;
		
		//return sum;
	}
	
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="dberman";
		data[0][1]="Password1";
		//data[0][2]="Restricted User";
		
//		data[1][0]="John";
//		data[1][1]="Password2";
		//data[0][2]="Non-Restricted User";
		
		return data;
		
		
	}
}
