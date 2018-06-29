package Revopay;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
//import java.util.logging.Logger;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.LandingPage;



public class RevopaySmokeTest1 extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	public HomePage h;	
	public LandingPage lp2;
	
	
	@Test
	public void VerifyDashboardPage() throws IOException, InterruptedException
	{
		h = new HomePage();
		h.basePageNavigation("dberman", "Gideon1936");
		log.info("Driver is initialized");
		lp2 = new LandingPage(h.driver);
		log.info("LandingPage is Loaded");
		String x = h.prop.getProperty("url");
		String LandingPageTitle = lp2.title().getText();
		System.out.println("The LandingPageTitle= " + LandingPageTitle);

		if(driver.getPageSource().contains("Dashboard information and statistics"))
		{
			System.out.println("FOUND: Dashboard information and statistics");
			Assert.assertTrue(true, "Assert FOUND: Dashboard information and statistics");
			log.info("INFO - FOUND: Dashboard information and statistics");
		}

		else
		{
		    System.out.println("NOT FOUND: Dashboard information and statistics");
		    Assert.assertTrue(false, "Assert Not FOUND: Dashboard information and statistics");
		    log.error("ERROR - NOT FOUND: Dashboard information and statistics");
		}
	    	
		
		//List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Dashboard information and statistics" + "')]"));
		//System.out.println("TEST1" + driver.findElement(By.xpath("//*[@id='wrapper']/div/div[2]/div[1]/div/div/div[1]")).getText());
		
		
		
//		if (list.size() == 0)
//		{
//			System.out.println("The text \"Dashboard information and statistics\" not found on page");
//			log.error("The text \"Dashboard information and statistics\" not found on page");
//		} else
//		{
//			System.out.println("The text \"Dashboard information and statistics\" found on page");
//			log.info("The text \"Dashboard information and statistics\" found on page");
//		}
//		
//		Assert.assertTrue(list.size() > 0, "Text found!");
	
	}
	
	
	
//	@Test
//	public void VerifyTransactionPage() throws IOException, InterruptedException
//	{
//		h = new HomePage();
//		h.basePageNavigation("dberman", "Password1");
//		log.info("Driver is initialized");
//		lp2 = new LandingPage(h.driver);
//		log.info("LandingPage is Loaded");
//		String x = h.prop.getProperty("url");
//		String LandingPageTitle = lp2.title().getText();
//		
//		
//		//TestCase 001
//		//click on reports
//		Thread.sleep(2000);
//		lp2.Reports().click();
//		//click on transactions
//		Thread.sleep(1000);
//		lp2.ReportsTransaction().click();
//		//Make the page title is "Transactions
//		
//		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Transactions" + "')]"));
//		
//		
//		
//		if (list.size() == 0)
//		{
//			System.out.println("Text Transactions not found on page");
//			log.error("Text Transactions not found on page");
//			Assert.assertTrue(list.size() > 0, "Text not found!");
//		} else
//		{
//			System.out.println("Text Transactions found on page");
//			log.info("Text Transactions ot found on page");
//			Assert.assertTrue(list.size() > 0, "Text found!");
//		}
//		
//		
//	}
//	

	
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}
	
}
