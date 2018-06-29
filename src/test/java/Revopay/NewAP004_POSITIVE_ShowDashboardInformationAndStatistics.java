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


public class NewAP004_POSITIVE_ShowDashboardInformationAndStatistics extends base
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
        
		if(driver.getPageSource().contains("Payment Volume") && driver.getPageSource().contains("Your last year activities in a chart"))
		{
			System.out.println("FOUND: Payment Volume and Your last year activities in a chart");
			Assert.assertTrue(true, "Assert FOUND: Payment Volume and Your last year activities in a chart");
			log.info("INFO - FOUND: Payment Volume and Your last year activities in a chart");
		} else
		{
			System.out.println("NOT FOUND: Payment Volume and Your last year activities in a chart");
			Assert.assertTrue(false, "Assert NOT FOUND: Payment Volume and Your last year activities in a chart");
			log.error("ERROR - NOT FOUND: Payment Volume and Your last year activities in a chart");
		}   
        
        
		String NumOfPayments = lp2.PaymentVolumeCountLable().getText();
		
		// System.out.println(NumOfPayments); 
		
		String[] parts = NumOfPayments.split(" ");
		String part1 = parts[0]; // 004
		// System.out.println(part1); 
        
		
		int NumOfPaymentsInt = 0;
		
		
		  try {
				NumOfPaymentsInt = Integer.parseInt(part1);
		    } catch (Exception  e) {
		    	 e.printStackTrace();; // for example
		    }
		
		
		
		//System.out.println(NumOfPaymentsInt);
		
		if (NumOfPaymentsInt >=0) 
		{
			System.out.println("Payments is an Integer = " + NumOfPayments);
			Assert.assertTrue(true, "Payments is an Integer = " + NumOfPayments);
			log.info("INFO - Payments is an Integer = " + NumOfPayments);
		} else
		{
			System.out.println("NOT FOUND: Payments is not an Integer = " + NumOfPayments);
			Assert.assertTrue(false, "Payments is not an Integer = " + NumOfPayments);
			log.error("ERROR - Payments is not an Integer =  " + NumOfPayments);
		}  
		
		
	}
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}

	
}
