// NOTE: This script is failing due to error in code.

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


public class NewAP007_POSITIVE_ShowActiveAutopaymentsReport extends base
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
		
		//System.out.println(lp2.ActivesAutoPayments().getText());
		
		String ActivesAutoPayments = lp2.ActivesAutoPayments().getText();
		String[] parts = ActivesAutoPayments.split(" ");
		String part1 = parts[0]; // 004
		System.out.println(part1);
		
		int result = Integer.parseInt(part1);
		
    	Thread.sleep(5000);
      
		if(result > 0)
		{
			System.out.println("FOUND: ActivesAutoPayments > 0 and = " + ActivesAutoPayments); //NOTE: The actual text on the screen is upper case which is done by CSS. But pagesource is Upper/Lower
			Assert.assertTrue(true, "ActivesAutoPayments > 0 and = " + ActivesAutoPayments);
			log.info("INFO - FOUND:  ActivesAutoPayments > 0 and = " + ActivesAutoPayments);
		} else
		{
			System.out.println("NOT FOUND: ActivesAutoPayments is not > 0 and = " + ActivesAutoPayments);
			Assert.assertTrue(false, "Assert NOT FOUND: ActivesAutoPayments is not > 0 and = " + ActivesAutoPayments);
			log.error("ERROR - NOT FOUND: ActivesAutoPayments is not > 0 and = " + ActivesAutoPayments);
		}   
		
		Thread.sleep(1000);
		
		lp2.ActivesAutoPaymentsGotoReportsLink().click();
		
		if(driver.getPageSource().contains("Global Search"))
		{
			System.out.println("FOUND: Global Search"); //NOTE: The actual text on the screen is upper case which is done by CSS. But pagesource is Upper/Lower
			Assert.assertTrue(true, "Assert FOUND: Global Search");
			log.info("INFO - FOUND: Global Search");
		} else
		{
			System.out.println("NOT FOUND: Global Search");
			Assert.assertTrue(false, "Assert NOT FOUND: Global Search");
			log.error("ERROR - NOT FOUND: Global Search");
		}  
		
		
		
		
//		
//		
//		log.info("LandingPage is Loaded");
//		System.out.println(lp2.title().getText());
//		log.info("Get Title of LandingPage: " + lp2.title().getText());
//		String LandingPageTitle = lp2.title().getText();
//        Assert.assertEquals(LandingPageTitle, "Master Toolbox");  // NewAP-158 Step 2 Passed
//        
//    	Thread.sleep(5000);
//        
//		if(driver.getPageSource().contains("Payors Total"))
//		{
//			System.out.println("FOUND: PAYORS TOTAL"); //NOTE: The actual text on the screen is upper case which is done by CSS. But pagesource is Upper/Lower
//			Assert.assertTrue(true, "Assert FOUND: PAYORS TOTAL");
//			log.info("INFO - FOUND: PAYORS TOTAL");
//		} else
//		{
//			System.out.println("NOT FOUND: PAYORS TOTAL");
//			Assert.assertTrue(false, "Assert NOT FOUND: PAYORS TOTAL");
//			log.error("ERROR - NOT FOUND: PAYORS TOTAL");
//		}   
//		
//		String PayorsTotalAdoptionRate = lp2.PayorsTotalAdoptionRate().getText();
//		
//		String[] parts = PayorsTotalAdoptionRate.split("%");
//		String part1 = parts[0]; // 004
//		System.out.println(part1);
//		
//		lp2.PayorsTotalGoToReportLink().click();
//		Thread.sleep(1000);
//		
//		if(driver.getPageSource().contains("Settlements"))
//		{
//			System.out.println("FOUND: Settlements Report"); 
//			Assert.assertTrue(true, "Assert FOUND: Settlements Report");
//			log.info("INFO - FOUND: Settlements Report");
//		} else
//		{
//			System.out.println("NOT FOUND: Settlements Report");
//			Assert.assertTrue(false, "Assert NOT FOUND: Settlements Report");
//			log.error("ERROR - NOT FOUND: Settlements Report");
//		}   
//		
//		driver.navigate().back();
//		
//		Thread.sleep(1000);
//		
//		if(!part1.equals("0.00"))
//		{
//			System.out.println("FOUND: Positive Adoption Rate= " + part1);
//			Assert.assertTrue(true, "Assert FOUND:  Positive Adoption Rate= " + part1);
//			log.info("INFO - FOUND:  Positive Adoption Rate= " + part1);
//		} else
//		{
//			System.out.println("NOT FOUND:  Positive Adoption Rate= " + part1 + " But it should be greater than 0.00%");
//			Assert.assertTrue(false, "Assert NOT FOUND:  Positive Adoption Rate= " + part1 + " But it should be greater than 0.00%");
//			log.error("ERROR - NOT FOUND:  Positive Adoption Rate= "+ part1 + " But it should be greater than 0.00%");
//		}   
//		
		
		
    }
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}

	
}
