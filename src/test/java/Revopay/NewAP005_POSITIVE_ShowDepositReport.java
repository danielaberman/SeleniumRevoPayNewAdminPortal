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


public class NewAP005_POSITIVE_ShowDepositReport extends base
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
		h.basePageNavigation("dberman", "Password1");
		driver.manage().window().maximize();

		log.info("Driver is initialized");
		lp2 = new LandingPage(h.driver);
		
		
		log.info("LandingPage is Loaded");
		System.out.println(lp2.title().getText());
		log.info("Get Title of LandingPage: " + lp2.title().getText());
		String LandingPageTitle = lp2.title().getText();
        Assert.assertEquals(LandingPageTitle, "Master Toolbox");  // NewAP-158 Step 2 Passed
        
        
        
		if(driver.getPageSource().contains("Expected Deposit") && driver.getPageSource().contains("Deposits expected today"))
		{
			System.out.println("FOUND: Expected Deposit & Deposits expected today");
			Assert.assertTrue(true, "Assert FOUND: Expected Deposit & Deposits expected today");
			log.info("INFO - FOUND: Expected Deposit & Deposits expected today");
		} else
		{
			System.out.println("NOT FOUND: Expected Deposit & Deposits expected today");
			Assert.assertTrue(false, "Assert NOT FOUND: Expected Deposit & Deposits expected today");
			log.error("ERROR - NOT FOUND: Expected Deposit & Deposits expected today");
		}   
		
		lp2.ExpectedDepositsGoToReportLink().click();
		
		Thread.sleep(5000);
		
		if(driver.getPageSource().contains("Settlements"))
		{
			System.out.println("FOUND: SETTLEMENTS Report Page");
			Assert.assertTrue(true, "Assert FOUND: SETTLEMENTS Report Page");
			log.info("INFO - FOUND: SETTLEMENTS Report Page");
		} else
		{
			System.out.println("NOT FOUND: SETTLEMENTS Report Page");
			Assert.assertTrue(false, "Assert NOT FOUND: SETTLEMENTS Report Page");
			log.error("ERROR - NOT FOUND: SETTLEMENTS Report Page");
		}   
    }
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}

	
}
