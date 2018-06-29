package Revopay;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
//import java.util.logging.Logger;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.LandingPage;
import pageObjects.ManageUsersOpenProfilePage;


public class NewAP021_POSITIVE_ManageUserSearchMultipleFieldsVerifyMultipleResults extends base
{
	public static Logger log = LogManager.getLogger(base.class.getName());

public HomePage h;	
public LandingPage lp2;


	
	@Test
	
	public void basePageNavigation2() throws IOException, InterruptedException
	{
		
		h = new HomePage();
		
		// Verify we are at the login page
		
		//h.addTwoNumbers(5, 3);
		h.basePageNavigation("dberman", "Gideon1936");
		driver.manage().window().maximize();

		log.info("Driver is initialized");
		lp2 = new LandingPage(h.driver);
		log.info("LandingPage is Loaded");
		System.out.println(lp2.title().getText());
		log.info("Get Title of LandingPage: " + lp2.title().getText());
		String LandingPageTitle = lp2.title().getText();
        Assert.assertEquals(LandingPageTitle, "Master Toolbox");  // NewAP-158 Step 2 Passed

        lp2.Manage().click();
        lp2.ManageUsers().click();
        lp2.SearchManageUserFirstName().sendKeys("Lisa");
        lp2.SearchManageUserLastName().sendKeys("Holland");
        lp2.SearchManageUserSearchButton().click();

        
		if(driver.getPageSource().contains("1117 North Barrett Lane") && driver.getPageSource().contains("3026 S BROOKRIDGE WAY"))
		{
			System.out.println("FOUND: 1117 North Barrett Lane and 3026 S BROOKRIDGE WAY");
			Assert.assertTrue(true, "Assert FOUND: 1117 North Barrett Lane and 3026 S BROOKRIDGE WAY");
			log.info("INFO - FOUND: 1117 North Barrett Lane and 3026 S BROOKRIDGE WAY");
		} else
		{
			System.out.println("NOT FOUND: 1117 North Barrett Lane and 3026 S BROOKRIDGE WAY");
			Assert.assertTrue(false, "Assert NOT FOUND: 1117 North Barrett Lane and 3026 S BROOKRIDGE WAY");
			log.error("ERROR - NOT FOUND: 1117 North Barrett Lane and 3026 S BROOKRIDGE WAY");
		}
        

		//Click the reset button to remove all filters and click search
		lp2.SearchManageUserResetButton().click();
		//Search ManageUsers for Act # 123
		lp2.SearchManageUserAccountNumber().sendKeys("123");
		lp2.SearchManageUserSearchButton().click();
		
		lp2.SearchManageUserActionButton1().click();  // SearchManageUserActionButton1
		lp2.ActionOpenProfileRow1().click();
		Thread.sleep(2000);
		
		// This code section may not have been necessary.  But after clicking on OpenProfile, the page changed, but the tab stayed the same.  
		// This code will re-identify all the Chrome Browser Tabs by their IDs and make sure to go back to the parent tab.
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

		
		// Now we are operating on the Open Profile Page for a user.  The objects below should probably be moved into a new pageObject file.
		//In the result set, open the first record and capture the full account #, first name and last name
		
		ManageUsersOpenProfilePage mop = new ManageUsersOpenProfilePage(driver); 
		
		WebElement act = mop.accountNumField();
		//WebElement act = driver.findElement(By.id("account_number"));
		String Accountnumber = act.getAttribute("value");
        
		
		WebElement fname = mop.fnameField();
		//WebElement fname = driver.findElement(By.id("first_name"));
		String first_name = fname.getAttribute("value");
		
		WebElement lname = mop.lnameField();
		//WebElement lname = driver.findElement(By.id("last_name"));
		String last_name = lname.getAttribute("value");
		
		System.out.println("First Name = " + first_name + " Last Name = " + last_name + " Account number = " + Accountnumber);
		
		//click on cancel button
		mop.CancelButton().click();
		//driver.findElement(By.xpath("//*[@class='btn btn-default']")).click();
		
		lp2.SearchManageUserResetButton().click();
		//Search ManageUsers for Act # 123
		
		//Then search for the same user by first name last name.
		lp2.SearchManageUserFirstName().sendKeys(first_name);
		lp2.SearchManageUserLastName().sendKeys(last_name);
		lp2.SearchManageUserSearchButton().click();
		
        
		//Make sure that the full account number is displayed in the search results.
		if(driver.getPageSource().contains(Accountnumber))
		{
			System.out.println("FOUND: Account Number: " + Accountnumber);
			Assert.assertTrue(true, "Account Number: " + Accountnumber);
			log.info("INFO - FOUND: Account Number: " + Accountnumber);
		} else
		{
			System.out.println("NOT FOUND:  Account Number: " + Accountnumber);
			Assert.assertTrue(false, "Assert NOT FOUND: Account Number: " + Accountnumber);
			log.error("ERROR - NOT FOUND: Account Number: " + Accountnumber);
		}
		

        
	}
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}

	
}
