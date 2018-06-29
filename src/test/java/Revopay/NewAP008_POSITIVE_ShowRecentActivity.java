// NOTE: This script is failing due to error in code.

package Revopay;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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


public class NewAP008_POSITIVE_ShowRecentActivity extends base
{
	public static Logger log = LogManager.getLogger(base.class.getName());

public HomePage h;	
public LandingPage lp2;


public static BigDecimal parse(final String amount, final Locale locale) throws ParseException {
    final NumberFormat format = NumberFormat.getNumberInstance(locale);
    if (format instanceof DecimalFormat) {
        ((DecimalFormat) format).setParseBigDecimal(true);
    }
    return (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]",""));
}

	
	@Test
	
	public void basePageNavigation2() throws IOException, InterruptedException, ParseException
	{
		
		h = new HomePage();
		
		// Verify we are at the login page
		
		//h.addTwoNumbers(5, 3);
		h.basePageNavigation("dberman", "Password1");
		driver.manage().window().maximize();

		log.info("Driver is initialized");
		lp2 = new LandingPage(h.driver);
		

		String dollarsA = lp2.RecentActivityAmericanExpressVolume().getText();
		
		BigDecimal RecentActivityAmericanExpressVolume = parse(dollarsA, Locale.US);
		
		System.out.println(RecentActivityAmericanExpressVolume);
		
		if(RecentActivityAmericanExpressVolume.compareTo(BigDecimal.ZERO) > 0 && lp2.RecentActivityAmericanExpressVolumeLabel().isDisplayed()) //   && (driver.getPageSource().contains("American Express Volume")))			
		{
			System.out.println("FOUND: American Express Volume > $0.00 and = " + RecentActivityAmericanExpressVolume); //NOTE: The actual text on the screen is upper case which is done by CSS. But pagesource is Upper/Lower
			Assert.assertTrue(true, "American Express Volume > $0.00 and = " + RecentActivityAmericanExpressVolume);
			log.info("INFO - FOUND:  American Express Volume > $0.00 and = " + RecentActivityAmericanExpressVolume);
		} else
		{
			System.out.println("NOT FOUND: American Express Volume > $0.00 and = " + RecentActivityAmericanExpressVolume);
			Assert.assertTrue(false, "Assert NOT FOUND: American Express Volume > $0.00 and = " + RecentActivityAmericanExpressVolume);
			log.error("ERROR - NOT FOUND: American Express Volume > $0.00 and = " + RecentActivityAmericanExpressVolume);
		}   
		
		
		dollarsA = lp2.RecentActivityCashVolume().getText();
		BigDecimal RecentActivityCashVolume = parse(dollarsA, Locale.US);
		System.out.println(RecentActivityCashVolume);
		System.out.println(lp2.RecentActivityCashVolumeLabel().getText());

		if(RecentActivityCashVolume.compareTo(BigDecimal.ZERO) > 0 && lp2.RecentActivityCashVolumeLabel().isDisplayed()) 			
		{
			System.out.println("FOUND: CashVolume > $0.00 and = " + RecentActivityCashVolume); //NOTE: The actual text on the screen is upper case which is done by CSS. But pagesource is Upper/Lower
			Assert.assertTrue(true, "CashVolume > $0.00 and = " + RecentActivityCashVolume);
			log.info("INFO - FOUND:  CashVolume > $0.00 and = " + RecentActivityCashVolume);
		} else
		{
			System.out.println("NOT FOUND: CashVolume > $0.00 and = " + RecentActivityCashVolume);
			Assert.assertTrue(false, "Assert NOT FOUND: CashVolume > $0.00 and = " + RecentActivityCashVolume);
			log.error("ERROR - NOT FOUND: CashVolume > $0.00 and = " + RecentActivityCashVolume);
		}   
		
		

		dollarsA = lp2.RecentActivityCreditCardVolume().getText();
		BigDecimal RecentActivityCreditCardVolume = parse(dollarsA, Locale.US);
		System.out.println(RecentActivityCreditCardVolume);
		System.out.println(lp2.RecentActivityCreditCardVolumeLable().getText());

		if(RecentActivityCreditCardVolume.compareTo(BigDecimal.ZERO) > 0 && lp2.RecentActivityCreditCardVolumeLable().isDisplayed()) 			
		{
			System.out.println("FOUND: RecentActivityCreditCardVolume > $0.00 and = " + RecentActivityCreditCardVolume); //NOTE: The actual text on the screen is upper case which is done by CSS. But pagesource is Upper/Lower
			Assert.assertTrue(true, "RecentActivityCreditCardVolume > $0.00 and = " + RecentActivityCreditCardVolume);
			log.info("INFO - FOUND:  RecentActivityCreditCardVolume > $0.00 and = " + RecentActivityCreditCardVolume);
		} else
		{
			System.out.println("NOT FOUND: RecentActivityCreditCardVolume > $0.00 and = " + RecentActivityCreditCardVolume);
			Assert.assertTrue(false, "Assert NOT FOUND: RecentActivityCreditCardVolume > $0.00 and = " + RecentActivityCreditCardVolume);
			log.error("ERROR - NOT FOUND: RecentActivityCreditCardVolume > $0.00 and = " + RecentActivityCreditCardVolume);
		}   
		
		
		dollarsA = lp2.RecentActivityECheckVolume().getText();
		BigDecimal RecentActivityECheckVolume = parse(dollarsA, Locale.US);
		System.out.println(RecentActivityECheckVolume);
		System.out.println(lp2.RecentActivityCreditCardVolumeLable().getText());

		if(RecentActivityECheckVolume.compareTo(BigDecimal.ZERO) > 0 && lp2.RecentActivityECheckVolumeLable().isDisplayed()) 			
		{
			System.out.println("FOUND: RecentActivityECheckVolume > $0.00 and = " + RecentActivityECheckVolume); //NOTE: The actual text on the screen is upper case which is done by CSS. But pagesource is Upper/Lower
			Assert.assertTrue(true, "RecentActivityECheckVolume > $0.00 and = " + RecentActivityECheckVolume);
			log.info("INFO - FOUND:  RecentActivityECheckVolume > $0.00 and = " + RecentActivityECheckVolume);
		} else
		{
			System.out.println("NOT FOUND: RecentActivityECheckVolume > $0.00 and = " + RecentActivityECheckVolume);
			Assert.assertTrue(false, "Assert NOT FOUND: RecentActivityECheckVolume > $0.00 and = " + RecentActivityECheckVolume);
			log.error("ERROR - NOT FOUND: RecentActivityECheckVolume > $0.00 and = " + RecentActivityECheckVolume);
		}   
		
		
		
		dollarsA = lp2.RecentActivityTotalVolume().getText();
		BigDecimal RecentActivityTotalVolume = parse(dollarsA, Locale.US);
		System.out.println(RecentActivityTotalVolume);
		System.out.println(lp2.RecentActivityTotalVolumeLabel().getText());

		if(RecentActivityTotalVolume.compareTo(BigDecimal.ZERO) > 0 && lp2.RecentActivityTotalVolumeLabel().isDisplayed()) 			
		{
			System.out.println("FOUND: RecentActivityECheckVolume > $0.00 and = " + RecentActivityTotalVolume); //NOTE: The actual text on the screen is upper case which is done by CSS. But pagesource is Upper/Lower
			Assert.assertTrue(true, "RecentActivityECheckVolume > $0.00 and = " + RecentActivityTotalVolume);
			log.info("INFO - FOUND:  RecentActivityECheckVolume > $0.00 and = " + RecentActivityTotalVolume);
		} else
		{
			System.out.println("NOT FOUND: RecentActivityECheckVolume > $0.00 and = " + RecentActivityTotalVolume);
			Assert.assertTrue(false, "Assert NOT FOUND: RecentActivityECheckVolume > $0.00 and = " + RecentActivityTotalVolume);
			log.error("ERROR - NOT FOUND: RecentActivityECheckVolume > $0.00 and = " + RecentActivityTotalVolume);
		}   
		
		Float totals = RecentActivityAmericanExpressVolume.floatValue() +RecentActivityCashVolume.floatValue() + RecentActivityCreditCardVolume.floatValue() + RecentActivityECheckVolume.floatValue();
		System.out.println(totals); 
		
		//search for Roundoff
		
		
		System.out.println(java.lang.Math.abs(RecentActivityTotalVolume.floatValue() - totals));
		
		
		//if (RecentActivityTotalVolume.floatValue() == totals) {
		if (java.lang.Math.abs(RecentActivityTotalVolume.floatValue() - totals) < 0.02) {
			System.out.println("Pass: The sum of the individual Payment Activities equal the Total of all Payment Activities " + RecentActivityTotalVolume + " =" + totals);
			Assert.assertTrue(true, "Pass: The sum of the individual Payment Activities equal the Total of all Payment Activities " +RecentActivityTotalVolume + " =" +  totals);
			log.info("INFO - Pass: The sum of the individual Payment Activities equal the Total of all Payment Activities " +RecentActivityTotalVolume + " =" +  totals);
		} else
		{
			System.out.println("Fail: The sum of the individual Payment Activities does not equal the Total of all Payment Activities " +RecentActivityTotalVolume + " =" + totals);
			Assert.assertTrue(false, "Fail: The sum of the individual Payment Activities does not equal the Total of all Payment Activities  " + RecentActivityTotalVolume + " !=" + totals);
			log.error("ERROR - The sum of the individual Payment Activities does not equal the Total of all Payment Activities  "  +RecentActivityTotalVolume + " =" + totals);
		}
			
		

		
	
//		String ActivesAutoPayments = lp2.ActivesAutoPayments().getText();
//		String[] parts = ActivesAutoPayments.split(" ");
//		String part1 = parts[0]; // 004
//		System.out.println(part1);
//		
//		int result = Integer.parseInt(part1);
//		

		
		
		
		
//		
//		
//		log.info("LandingPage is Loaded");
//		System.out.println(lp2.title().getText());
//		log.info("Get Title of LandingPage: " + lp2.title().getText());
//		String LandingPageTitle = lp2.title().getText();
//        Assert.assertEquals(LandingPageTitle, "Master Toolbox");  // NewAP-158 Step 2 Passed
//        

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

		
		
    }
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}

	
}
