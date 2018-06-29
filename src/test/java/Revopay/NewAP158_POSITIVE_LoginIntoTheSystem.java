package Revopay;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
//import java.util.logging.Logger;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.LandingPage;


public class NewAP158_POSITIVE_LoginIntoTheSystem extends base
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

        Assert.assertEquals(lp2.Reports().isDisplayed(), true);
        // Before clicking on Reports to Expand the various reports:
//        Assert.assertEquals(lp2.ReportsTransaction().isDisplayed(), false);
//        Assert.assertEquals(lp2.ReportsAuditAutopayments().isDisplayed(), false);
//        Assert.assertEquals(lp2.ReportsAutoPayments().isDisplayed(), false); // broken
//        Assert.assertEquals(lp2.ReportsByCategories().isDisplayed(), false);
//        Assert.assertEquals(lp2.ReportsEMAFReports().isDisplayed(), false);
//        Assert.assertEquals(lp2.ReportsEvents().isDisplayed(), false);
//        Assert.assertEquals(lp2.ReportsOutbounds().isDisplayed(), false);
//        Assert.assertEquals(lp2.ReportsSettlements().isDisplayed(), false);

        lp2.Reports().click();
        Thread.sleep(500);
        

        
        // After clicking on Reports to Expand the various reports: 
        Assert.assertEquals(lp2.Reports().isDisplayed(), true);
        Assert.assertEquals(lp2.ReportsTransaction().isDisplayed(), true);
        Assert.assertEquals(lp2.ReportsAuditAutopayments().isDisplayed(), true);
        Assert.assertEquals(lp2.ReportsAutoPayments().isDisplayed(), true);
        Assert.assertEquals(lp2.ReportsByCategories().isDisplayed(), true);
        Assert.assertEquals(lp2.ReportsEMAFReports().isDisplayed(), true);
        Assert.assertEquals(lp2.ReportsEvents().isDisplayed(), true);
        Assert.assertEquals(lp2.ReportsOutbounds().isDisplayed(), true);
        Assert.assertEquals(lp2.ReportsSettlements().isDisplayed(), true);
        
        
//        lp2.Reports().click();
//        Thread.sleep(500);
        
        Assert.assertEquals(lp2.Manage().isDisplayed(),true);
        lp2.Manage().click();
        Thread.sleep(500);
        
        Assert.assertEquals(lp2.Manage().isDisplayed(),true);
        Assert.assertEquals(lp2.ManageUsers().isDisplayed(),true);
        Assert.assertEquals(lp2.ManagePartners().isDisplayed(),true);
        Assert.assertEquals(lp2.ManageGroups().isDisplayed(),true);
        Assert.assertEquals(lp2.ManageMerchants().isDisplayed(),true);
        Assert.assertEquals(lp2.ManagePricingTables(). isDisplayed(),true);        		
        Assert.assertEquals(lp2.ManageBranches().isDisplayed(),true);
        Assert.assertEquals(lp2.ManageTickets().isDisplayed(),true);
        Assert.assertEquals(lp2.ManageAdmins().isDisplayed(),true);
        Assert.assertEquals(lp2.ManageLayout().isDisplayed(),true);

        
        Assert.assertEquals(lp2.Application().isDisplayed(),true);
        lp2.Application().click();
        Thread.sleep(500);
        
        Assert.assertEquals(lp2.ApplicationApplication().isDisplayed(),true);
        
        Assert.assertEquals(lp2.SupportMenu().isDisplayed(),true);
        lp2.SupportMenu().click();
        Thread.sleep(500);
        
        
		//lp2.SupportMenu().click();
		System.out.println("Support Open");
        // this will open up an new tab.
		System.out.println(driver.getTitle());
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Support : RevoPay");
		//System.out.println("1" + driver.getTitle());
        driver.close(); // closes tab
        //System.out.println("2" + driver.getTitle());  // After closing the tab with the previous line, this will return an error!
        driver.switchTo().window(parentid);
        //System.out.println("3" + driver.getTitle());
        
        
//        System.out.println("Before Reports Click is ReportsTransaction Displayed? " + lp2.ReportsTransaction().isDisplayed());
//        System.out.println(lp2.Reports().isDisplayed());
//        lp2.Reports().click();
//        System.out.println("After Reports Click is ReportsTransaction Displayed? " + lp2.ReportsTransaction().isDisplayed());
//        Thread.sleep(500);
//		lp2.ReportsTransaction().click(); 
//		Thread.sleep(500);
//        System.out.println(lp2.ReportsTransaction().isDisplayed());

		
		
		//        
//		lp2.ReportsByCategories().click();  
//		Thread.sleep(500);
//
//		lp2.ReportsEMAFReports().click(); 
//		Thread.sleep(500);
//		
//		lp2.ReportsOutbounds().click(); 
//		Thread.sleep(500);
//
//		lp2.ReportsEvents().click();  
//		Thread.sleep(500);
//		
//		lp2.ReportsAuditAutopayments().click(); 
//		Thread.sleep(500);

		/*
	
		

		



        
        if (LandingPageTitle.equals("Master Toolbox"))
        {
        	System.out.println("pass " + LandingPageTitle + " = Master Toolbox");
        	log.info("pass " + LandingPageTitle + " = Master Toolbox");
        }
        else
        {
        	System.out.println("fail " + LandingPageTitle + " != Master Toolbox");
        	log.error("fail " + LandingPageTitle + " = Master Toolbox");
        }
        
		log.info("Assertion Passed");

		lp2.Dashboard().click();  //good
		Thread.sleep(500);
		
		// Use Verify instead of Assert to continue tests after failures - https://stackoverflow.com/questions/23294281/java-selenium-webdriver-code-to-implement-verify-instead-of-assert
				
		if(driver.getPageSource().contains("Dashboard information and statistics123"))
		{
			System.out.println("FOUND: Dashboard information and statistics");
			Assert.assertTrue(true, "Assert FOUND: Dashboard information and statistics");
			log.info("INFO - FOUND: Dashboard information and statistics");
		} else
		{
			System.out.println("NOT FOUND: Dashboard information and statistics");
			Assert.assertTrue(false, "Assert NOT FOUND: Dashboard information and statistics");
			log.info("ERROR - NOT FOUND: Dashboard information and statistics");
		}
		
		lp2.Reports().click(); // good
		Thread.sleep(500);  // needed to put in delay.  Otherwise, Manage below doesn't expand.
		
		lp2.ReportsAutoPayments().click();  // good
		Thread.sleep(500);
		
		if(driver.getPageSource().contains("Autopayments"))
		{
			System.out.println("FOUND: Autopayments");
			Assert.assertTrue(true, "Assert FOUND: Autopayments");
			log.info("INFO - FOUND: Autopayments");
		}
		
	

		
		lp2.Manage().click();
		Thread.sleep(500);
		
		lp2.ManageMerchants().click();
		Thread.sleep(500);
		
		lp2.ManageUsers().click();
		Thread.sleep(500);

		lp2.ManagePartners().click();
		Thread.sleep(500);

		lp2.ManageGroups().click();
		Thread.sleep(500);
				
		lp2.ManagePricingTables().click();
		Thread.sleep(500);

		lp2.ManageBranches().click();
		Thread.sleep(500);

		lp2.ManageTickets().click();
		Thread.sleep(500);

		lp2.ManageAdmins().click();
		Thread.sleep(500);

		lp2.ManageLayout().click();
		Thread.sleep(500);
	
		lp2.Application().click();
		Thread.sleep(500);
		
		lp2.ApplicationApplication().click();
		Thread.sleep(500);
*/		

	}
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}

	
}
