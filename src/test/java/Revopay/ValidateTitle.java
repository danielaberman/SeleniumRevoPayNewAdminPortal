package Revopay;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
//import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.LandingPage;


public class ValidateTitle extends base
{
	public static Logger log = LogManager.getLogger(base.class.getName());

public HomePage h;	
public LandingPage lp2;


	
	@Test
	
	public void basePageNavigation2() throws IOException, InterruptedException
	{
		
		h = new HomePage();
		h.basePageNavigation("dberman", "Gideon1936");
		driver.manage().window().maximize();
		log.info("Driver is initialized");
		lp2 = new LandingPage(h.driver);
		log.info("LandingPage is Loaded");
		

		
		System.out.println(lp2.title().getText());
		log.info("Get Title of LandingPage: " + lp2.title().getText());
		String x = h.prop.getProperty("url");
		System.out.println(x);
		String LandingPageTitle = lp2.title().getText();
        Assert.assertEquals(LandingPageTitle, "Master Toolbox");
        
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
				
		if(driver.getPageSource().contains("Dashboard information and statistics"))
		{
			System.out.println("FOUND: Dashboard information and statistics");
			Assert.assertTrue(true, "Assert FOUND: Dashboard information and statistics");
			log.info("INFO - FOUND: Dashboard information and statistics");
		} else
		{
			System.out.println("NOT FOUND: Dashboard information and statistics");
			Assert.assertTrue(false, "Assert NOT FOUND: Dashboard information and statistics");
			log.error("ERROR - NOT FOUND: Dashboard information and statistics");
		}
		
		lp2.Reports().click(); // good
		Thread.sleep(500);  // needed to put in delay.  Otherwise, Manage below doesn't expand.
		
		
		if(driver.getPageSource().contains("Transactions"))
		{
			System.out.println("FOUND: Transactions");
			Assert.assertTrue(true, "Assert FOUND: Transactions");
			log.info("INFO - FOUND: Transactions");
		} else
		{
			System.out.println("NOT FOUND: Transactions");
			Assert.assertTrue(false, "Assert NOT FOUND: Transactions");
			log.error("ERROR - NOT FOUND: Transactions");
		}
		
		
		
		
		lp2.ReportsAutoPayments().click();  // good
		Thread.sleep(500);
		
		if(driver.getPageSource().contains("Autopayments"))
		{
			System.out.println("FOUND: Autopayments");
			Assert.assertTrue(true, "Assert FOUND: Autopayments");
			log.info("INFO - FOUND: Autopayments");
		} else
		{
			System.out.println("NOT FOUND: Autopayments");
			Assert.assertTrue(false, "Assert NOT FOUND: Autopayments");
			log.error("INFO - NOT FOUND: Autopayments");
		}
	
		lp2.ReportsByCategories().click();  // good
		Thread.sleep(500);
		
		if(driver.getPageSource().contains("Transactions By Categories"))
		{
			System.out.println("FOUND: Transactions By Categories");
			Assert.assertTrue(true, "Assert FOUND: Transactions By Categories");
			log.info("INFO - FOUND: Transactions By Categories");
		} else
		{
			System.out.println("NOT FOUND: Transactions By Categories");
			Assert.assertTrue(false, "Assert NOT FOUND: Transactions By Categories");
			log.error("ERROR - NOT FOUND: Transactions By Categories");
		}

		lp2.ReportsEMAFReports().click(); //good
		Thread.sleep(500);
		
		if(driver.getPageSource().contains("EMAF"))
		{
			System.out.println("FOUND: EMAF");
			Assert.assertTrue(true, "Assert FOUND: EMAF");
			log.info("INFO - FOUND: EMAF");
		} else
		{
			System.out.println("NOT FOUND: EMAF");
			Assert.assertTrue(false, "Assert NOT FOUND: EMAF");
			log.error("ERROR - NOT FOUND: EMAF");
		}

		
		
		lp2.ReportsOutbounds().click(); //good
		Thread.sleep(500);
		
		if(driver.getPageSource().contains("Outbounds"))
		{
			System.out.println("FOUND: Outbounds");
			Assert.assertTrue(true, "Assert FOUND: Outbounds");
			log.info("INFO - FOUND: Outbounds");
		} else
		{
			System.out.println("NOT FOUND: Outbounds");
			Assert.assertTrue(false, "Assert NOT FOUND: Outbounds");
			log.error("ERROR - NOT FOUND: Outbounds");
		}
		
		lp2.ReportsTransaction().click(); //bad
		Thread.sleep(500);
		
		if(driver.getPageSource().contains("Transactions"))
		{
			System.out.println("FOUND: Transactions");
			Assert.assertTrue(true, "Assert FOUND: Transactions");
			log.info("INFO - FOUND: Transactions");
		} else
		{
			System.out.println("NOT FOUND: Transactions");
			Assert.assertTrue(false, "Assert NOT FOUND: Transactions");
			log.error("ERROR - NOT FOUND: Transactions");
		}
		

		lp2.ReportsEvents().click();  // good -- Note, the title of this report = Audit and Events
		Thread.sleep(500);
		if(driver.getPageSource().contains("Audit"))
		{
			System.out.println("FOUND: Audit");
			Assert.assertTrue(true, "Assert FOUND: Audit");
			log.info("INFO - FOUND: Autopayments");
		} else
		{
			System.out.println("NOT FOUND: Audit");
			Assert.assertTrue(false, "Assert NOT FOUND: Audit");
			log.error("ERROR - NOT FOUND: Audit");
		}
		/*      @Daniel Berman - Question, for the "New Admin Portal", when clicking on the Report -> "Events" on the left Nav bar, the title of the page says "Audit". Should the names be different or the same? What should be the page title? Please see the attachment...
		        SJ Hosin [4:35 PM]
				@Daniel Berman there are going to be more functions added under the events tab. Only audits is kind of available right now

				Audits should be a sub menu under events, this is a hierarchy presentation issue
				I think so, at least.

				Daniel Berman [4:37 PM]
				Okay, thanks! I will update the test case with this information

				SJ Hosin [4:38 PM]
				Confirm that it luis Trista and Dani please. I could be wrong. It looks like just bad ui

				Daniel Berman [4:39 PM]
				I think I'm going to create a bug, just in case to track this so we don't forget.  We can always close the bug if it is not a bug...
				But Luis and Dani, please advise...
		*/
		
		lp2.ReportsAuditAutopayments().click(); //bad
		Thread.sleep(500);
		if(driver.getPageSource().contains("Autopayments"))
		{
			System.out.println("FOUND: Autopayments");
			Assert.assertTrue(true, "Assert FOUND: Autopayments");
			log.info("INFO - FOUND: Autopayments");
		} else
		{
			System.out.println("NOT FOUND: Autopayments");
			Assert.assertTrue(false, "Assert NOT FOUND: Autopayments");
			log.error("ERROR - NOT FOUND: Autopayments");
		}
		
		
		lp2.Manage().click();
		Thread.sleep(500);
		if(driver.getPageSource().contains("Pricing Tables"))
		{
			System.out.println("FOUND: Pricing Tables");
			Assert.assertTrue(true, "Assert FOUND: Pricing Tables");
			log.info("INFO - FOUND: Pricing Tables");
		} else
		{
			System.out.println("NOT FOUND: Pricing Tables");
			Assert.assertTrue(false, "Assert NOT FOUND: Pricing Tables");
			log.error("ERROR - NOT FOUND: Pricing Tables");
		}
		
		lp2.ManageMerchants().click();
		Thread.sleep(500);
		if(driver.getPageSource().contains("Manage Merchant"))
		{
			System.out.println("FOUND: Manage Merchant");
			Assert.assertTrue(true, "Assert FOUND: Manage Merchant");
			log.info("INFO - FOUND: Manage Merchant");
		} else
		{
			System.out.println("NOT FOUND: Manage Merchant");
			Assert.assertTrue(false, "Assert NOT FOUND: Manage Merchant");
			log.error("ERROR - NOT FOUND: Manage Merchant");
		}
		
		
		lp2.ManageUsers().click();
		Thread.sleep(500);
		if(driver.getPageSource().contains("Manage User"))
		{
			System.out.println("FOUND: Manage User");
			Assert.assertTrue(true, "Assert FOUND: Manage User");
			log.info("INFO - FOUND: Manage User");
		} else
		{
			System.out.println("NOT FOUND: Manage User");
			Assert.assertTrue(false, "Assert NOT FOUND: Manage User");
			log.error("ERROR - NOT FOUND: Manage User");
		}

		lp2.ManagePartners().click();
		Thread.sleep(500);
		if(driver.getPageSource().contains("Manage Partners"))
		{
			System.out.println("FOUND: Manage Partners");
			Assert.assertTrue(true, "Assert FOUND: Manage Partners");
			log.info("INFO - FOUND: Manage Partners");
		} else
		{
			System.out.println("NOT FOUND: Manage Partners");
			Assert.assertTrue(false, "Assert NOT FOUND: Manage Partners");
			log.error("ERROR - NOT FOUND: Manage Partners");
		}

		lp2.ManageGroups().click();
		Thread.sleep(500);
		if(driver.getPageSource().contains("Manage Group"))
		{
			System.out.println("FOUND: Manage Group");
			Assert.assertTrue(true, "Assert FOUND: Manage Group");
			log.info("INFO - FOUND: Manage Group");
		} else
		{
			System.out.println("NOT FOUND: Manage Group");
			Assert.assertTrue(false, "Assert NOT FOUND: Manage Group");
			log.error("ERROR - NOT FOUND: Manage Group");
		}
				
		lp2.ManagePricingTables().click();
		Thread.sleep(500);
		if(driver.getPageSource().contains("Pricing Tables"))
		{
			System.out.println("FOUND: Pricing Tables");
			Assert.assertTrue(true, "Assert FOUND: Pricing Tables");
			log.info("INFO - FOUND: Pricing Tables");
		} else
		{
			System.out.println("NOT FOUND: Pricing Tables");
			Assert.assertTrue(false, "Assert NOT FOUND: Pricing Tables");
			log.error("ERROR - NOT FOUND: Pricing Tables");
		}

		lp2.ManageBranches().click();
		Thread.sleep(500);
		if(driver.getPageSource().contains("Manage Branches"))
		{
			System.out.println("FOUND: Manage Branches");
			Assert.assertTrue(true, "Assert FOUND: Manage Branches");
			log.info("INFO - FOUND: Manage Branches");
		} else
		{
			System.out.println("NOT FOUND: Manage Branches");
			Assert.assertTrue(false, "Assert NOT FOUND: Manage Branches");
			log.error("ERROR - NOT FOUND: Manage Branches");
		}
		
		lp2.ManageTickets().click();
		Thread.sleep(500);
		if(driver.getPageSource().contains("Tickets"))
		{
			System.out.println("FOUND: Tickets");
			Assert.assertTrue(true, "Assert FOUND: Tickets");
			log.info("INFO - FOUND: Tickets");
		} else
		{
			System.out.println("NOT FOUND: Tickets");
			Assert.assertTrue(false, "Assert NOT FOUND: Tickets");
			log.error("ERROR - NOT FOUND: Manage Tickets");
		}
		
		lp2.ManageAdmins().click();
		Thread.sleep(500);
		if(driver.getPageSource().contains("Manage Admins"))
		{
			System.out.println("FOUND: Tickets");
			Assert.assertTrue(true, "Assert FOUND: Manage Admins");
			log.info("INFO - FOUND: Manage Admins");
		} else
		{
			System.out.println("NOT FOUND: Manage Admins");
			Assert.assertTrue(false, "Assert NOT FOUND: Manage Admins");
			log.error("ERROR - NOT FOUND: Manage Manage Admins");
		}

		lp2.ManageLayout().click();
		Thread.sleep(500);
	    
		
		
		
		
		//BUG: We are getting an exception on this code with applications when the text aspect ration is 125% instead of 100% .  
		// We need to determine if the object exists before clicking on it without getting an exception
		lp2.Manage().click();
		Thread.sleep(500);
		lp2.Application().click();
		Thread.sleep(500);
		
		lp2.ApplicationApplication().click();
		Thread.sleep(500);
		
		if(driver.getPageSource().contains("Applications"))
		{
			System.out.println("FOUND: Applications");
			Assert.assertTrue(true, "Assert FOUND: Applications");
			log.info("INFO - FOUND: Applications");
		} else
		{
			System.out.println("NOT FOUND: Applications");
			Assert.assertTrue(false, "Assert NOT FOUND: Applications");
			log.error("ERROR - NOT FOUND: Applications");
		}

		

		

	}
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}

	
}
