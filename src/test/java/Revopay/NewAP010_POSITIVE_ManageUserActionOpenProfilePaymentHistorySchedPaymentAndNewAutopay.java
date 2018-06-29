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


public class NewAP010_POSITIVE_ManageUserActionOpenProfilePaymentHistorySchedPaymentAndNewAutopay extends base
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
        
		lp2.SearchManageUserActionButton1().click();  // SearchManageUserActionButton1
		lp2.ActionOpenProfileRow1().click();
		Thread.sleep(2000);
		
        ManageUsersOpenProfilePage mop = new ManageUsersOpenProfilePage(driver); 
		mop.PaymentHistoryTab().click();
		
		
		if(mop.ManageUsersPaymentHistoryMakePaymentButton().isDisplayed())
		{
			System.out.println("FOUND: ManageUsersPaymentHistoryMakePaymentButton");
			Assert.assertTrue(true, "Assert FOUND:ManageUsersPaymentHistoryMakePaymentButton");
			log.info("INFO - FOUND: ManageUsersPaymentHistoryMakePaymentButton");
		} else
		{
			System.out.println("NOT FOUND: ManageUsersPaymentHistoryMakePaymentButton");
			Assert.assertTrue(false, "Assert NOT FOUND: ManageUsersPaymentHistoryMakePaymentButton");
			log.error("ERROR - NOT FOUND: ManageUsersPaymentHistoryMakePaymentButton");
		}
		
		mop.ManageUsersPaymentHistoryMakePaymentButton().click();
		
		//System.out.println(driver.findElement(By.xpath("//*[@class='btn group-btn-focused group-btn1 btn-info ']")).isDisplayed());
		//driver.findElement(By.xpath("//*[@class='btn group-btn-focused group-btn1 btn-info ']")).click();
		System.out.println(mop.ManageUsersPaymentHistoryMakePaymentOneTimeButton().isDisplayed());
		
		
		if(mop.ManageUsersPaymentHistoryMakePaymentOneTimeButton().isDisplayed())
		{
			System.out.println("FOUND: ManageUsersPaymentHistoryMakePaymentOneTimeButton");
			Assert.assertTrue(true, "Assert ManageUsersPaymentHistoryMakePaymentOneTimeButton");
			log.info("INFO - FOUND: ManageUsersPaymentHistoryMakePaymentOneTimeButton");
		} else
		{
			System.out.println("NOT FOUND: ManageUsersPaymentHistoryMakePaymentOneTimeButton");
			Assert.assertTrue(false, "Assert NOT FOUND: ManageUsersPaymentHistoryMakePaymentOneTimeButton");
			log.error("ERROR - NOT FOUND: ManageUsersPaymentHistoryMakePaymentOneTimeButton");
		}
		
		
		
		if(mop.ManageUsersPaymentHistoryMakePaymentSchedAutopayButton().isDisplayed())
		{
			System.out.println("FOUND: ManageUsersPaymentHistoryMakePaymentSchedAutopayButton");
			Assert.assertTrue(true, "Assert ManageUsersPaymentHistoryMakePaymentSchedAutopayButton");
			log.info("INFO - FOUND: ManageUsersPaymentHistoryMakePaymentSchedAutopayButton");
		} else
		{
			System.out.println("NOT FOUND: ManageUsersPaymentHistoryMakePaymentSchedAutopayButton");
			Assert.assertTrue(false, "Assert NOT FOUND: ManageUsersPaymentHistoryMakePaymentSchedAutopayButton");
			log.error("ERROR - NOT FOUND: ManageUsersPaymentHistoryMakePaymentSchedAutopayButton");
		}	
		
	}
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}

	
}
