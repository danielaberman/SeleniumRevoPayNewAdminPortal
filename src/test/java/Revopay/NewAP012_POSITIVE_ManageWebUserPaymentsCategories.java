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
import pageObjects.MerchantToolBox;


public class NewAP012_POSITIVE_ManageWebUserPaymentsCategories extends base
{
	public static Logger log = LogManager.getLogger(base.class.getName());

public HomePage h;	
public LandingPage lp2;
public LandingPage lp3;


//public static BigDecimal parse(final String amount, final Locale locale) throws ParseException {
//    final NumberFormat format = NumberFormat.getNumberInstance(locale);
//    if (format instanceof DecimalFormat) {
//        ((DecimalFormat) format).setParseBigDecimal(true);
//    }
//    return (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]",""));
//}

	
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
		
        lp2.Manage().click();
        lp2.ManageUsers().click();
        
        
        lp2.SearchManageUserFirstName().sendKeys("Lisa");
        lp2.SearchManageUserLastName().sendKeys("Holland");
        lp2.SearchManageUserSearchButton().click();

		lp2.SearchManageUserActionButton1().click();  // SearchManageUserActionButton1
		lp2.ActionOpenProfileRow1().click();
		Thread.sleep(2000);
        ManageUsersOpenProfilePage mop = new ManageUsersOpenProfilePage(driver); 
        
        System.out.println("Payment History Tab was displayed: " + mop.PaymentHistoryTab().isDisplayed());
        Assert.assertTrue(mop.PaymentHistoryTab().isDisplayed(), "Payment History Tab was displayed");
        
        System.out.println("Scheduled Payments Tab was displayed: " + mop.ManageUsersSchedulePaymentsTab().isDisplayed());
        Assert.assertTrue(mop.ManageUsersSchedulePaymentsTab().isDisplayed(), "Scheduled Payments Tab was displayed");
        
        System.out.println("Invoice Tab Was displayed: " + mop.ManageUsersInvoiceTab().isDisplayed());
        Assert.assertTrue(mop.ManageUsersInvoiceTab().isDisplayed(), "Invoice Tab Was displayed");
        
        System.out.println("Ticket History Tab was displayed: " + mop.ManageUsersTicketHistoryTab().isDisplayed());
        Assert.assertTrue(mop.ManageUsersTicketHistoryTab().isDisplayed(), "Ticket History Tab was displayed");
        
        System.out.println("Payments Catagories Tab was displayed: " + mop.ManageUsersPaymentCategories().isDisplayed());
        Assert.assertTrue(mop.ManageUsersPaymentCategories().isDisplayed(), "Payments Catagories Tab was displayed");
        
        mop.ManageUsersPaymentCategories().click();
        
        System.out.println( "Manage Categories button is displayed: " + mop.ManageUsersPaymentCategoriesManageCategoriesButton().isDisplayed());
        Assert.assertTrue(mop.ManageUsersPaymentCategoriesManageCategoriesButton().isDisplayed(), "Manage Categories button is displayed");
        
        System.out.println(driver.findElements(By.xpath("//*[@id='web-user-categories-div']/div/div[1]/table/tbody/tr")).size());
        int CountOfPymtCats= driver.findElements(By.xpath("//*[@id='web-user-categories-div']/div/div[1]/table/tbody/tr")).size();
        
        mop.ManageUsersPaymentCategoriesManageCategoriesButton().click();
        mop.ManageUsersPaymentCategoriesCodeField().sendKeys("QATestCode");
        mop.ManageUsersPaymentCategoriesAmountField().sendKeys("101");
        mop.ManageUsersPaymentCategoriesDescriptionField().sendKeys("QATestDescription");
        mop.ManageUsersPaymentCategoriesPlusButton().click();
        mop.ManageUsersPaymentCategoriesSaveButton().click();
        System.out.println(driver.findElements(By.xpath("//*[@id='web-user-categories-div']/div/div[1]/table/tbody/tr")).size());
        int NewCountOfPymtCats= driver.findElements(By.xpath("//*[@id='web-user-categories-div']/div/div[1]/table/tbody/tr")).size();
        
        mop.ManageUsersPaymentCategoriesManageCategoriesButton().click();
        Thread.sleep(2000);
        mop.ManageUsersPaymentCategoriesTrashCanButton1stRow().click();
        mop.ManageUsersPaymentCategoriesSaveButton().click();
        System.out.println(driver.findElements(By.xpath("//*[@id='web-user-categories-div']/div/div[1]/table/tbody/tr")).size());
        int FinalCountOfPymtCats= driver.findElements(By.xpath("//*[@id='web-user-categories-div']/div/div[1]/table/tbody/tr")).size();
        
        
        if (NewCountOfPymtCats == CountOfPymtCats + 1)
        {
        	Assert.assertTrue(true, "Category was added successfully: Start Count = " + CountOfPymtCats + " NewCount = " + NewCountOfPymtCats);
        	System.out.println("Category was added successfully: Start Count = " + CountOfPymtCats + " NewCount = " + NewCountOfPymtCats);
        } else
        {
        	Assert.assertTrue(false, "Category was not added successfully StartingNumOfCategories = " + CountOfPymtCats + "New Count =  " + NewCountOfPymtCats);
        	System.out.println("Category was not added successfully StartingNumOfCategories = " + CountOfPymtCats + "New Count =  " + NewCountOfPymtCats);
        }	
        	
        
        
        if (FinalCountOfPymtCats == CountOfPymtCats)
        {
        	Assert.assertTrue(true, "Category was deleted successfully");
        	System.out.println("Category was deleted successfully. Before Delete Count = " + NewCountOfPymtCats + " Final Count =  " + FinalCountOfPymtCats);
        }
        
        
        
        
        
//        lp2.ManageMerchants().click();
//        lp2.SearchByMerchant().sendKeys("Sunset Plaza Condo");
//        lp2.SearchManageUserSearchButton().click();
//        lp2.SearchManageMerchantActionButton1().click();
//        lp2.ManageMerchanActionOpenRow1().click();
//        
//                
//		//Switch Tabs to the new tab
//		Set<String>ids=driver.getWindowHandles();
//		Iterator<String> it=ids.iterator();
//		String parentid=it.next();
//		String childid=it.next();
//		driver.switchTo().window(childid);
//		System.out.println(driver.getTitle());
//        
//		MerchantToolBox mtb = new MerchantToolBox(driver); 
//		Thread.sleep(2000);
//		mtb.PaytoolsMenu().click();
//		Thread.sleep(2000);
//		mtb.PaytoolsMenuInvoices().click();
//		
//		
////		8.) Click on "+New Invoices"
//		mtb.PaytoolsMenuInvoicesNewInvoiceButton().click();
////		9.) In the To Field select "Yarisel Perez"
//		Thread.sleep(2000);
//		//mtb.PayToolsMenuPayToField().sendKeys("Yarisel");
//		mtb.PayToolsMenuPayToField().click();
//		mtb.PayToolsMenuPayToEntryField().sendKeys("Yarisel" + Keys.ENTER);
//		
////		11.) Due Date = 01/01/2028
//		mtb.PayToolsMenuInvoiceDueDateField().sendKeys("01/01/2021" + Keys.TAB);
//		
////		10.) Invoice Date = Today        
//		mtb.PayToolsMenuInvoiceDateField().sendKeys("01/01/2020" + Keys.TAB);
//		
//		//mtb.PayToolsMenuInvoiceDateField().sendKeys("01/01/2020" + Keys.TAB);
////		13.) Subject = Please Pay Now
//		mtb.PaytoolsMenuSubjectField().sendKeys("Please Pay at your own convienience" + Keys.TAB);
//
////		12.) Item = "Gass Gass bill" for 26.75
//		mtb.PaytoolsMenuItemField().click();
//		mtb.PaytoolsMenuItemField().sendKeys("Gas" + Keys.TAB);
//		// Get the Total Price and store in variable and compare to the final confirmation price to make sure that text price is visible on the page
//		//String InvoiceItemTotalPrice = mtb.NewInvoiceItemTotalPrice().getText();
//		//int ItemTotalCostInt = Integer.parseInt(InvoiceItemTotalPrice);	
//		//System.out.println(ItemTotalCostInt);
//		
////		14.) Click "Create New Invoice" Button
//		mtb.PaytoolsMenuCreateNewInvoiceButton().click();
////		15.) For the top Draft Invoice that was just created, select Actions->Send
//		Thread.sleep(1000);
//		mtb.PaytoolsMenuInvoiceActionsRow1().click();
//		Thread.sleep(1000);
//		mtb.PaytoolsMenuInvoiceActionRow1Send().click();
//		Thread.sleep(2000);
//		
////		16.) Still logged in as the Merchant, select Manage->Users
//		mtb.Manage().click();
//		Thread.sleep(2000);
//		mtb.ManageUsers().click();
//		Thread.sleep(2000);
//
//
//		
//		
////		17.) Search for Yarisel and select Actions -> "Open Profile"
//		mtb.ManageUsersSearchByFirstName().sendKeys("Yarisel");
//		Thread.sleep(2000);
//		mtb.ManageUserSearchButton().click();
//		Thread.sleep(2000);
//		mtb.ManageUserActionButton1stRow().click();
//		Thread.sleep(2000);
//		mtb.ManageUserActionButtonOpenProfile().click();
//		Thread.sleep(3000);
//
////		18.) Click on the "Invoice Tab"
//		mtb.ManageUserInvoiceTab().click();
//		Thread.sleep(3000);
//		
////		19.) Verify that you see the invoice for $26.75 or the value you selected and you see the pay button.
//        mtb.ManageUserInvoicesPayButton1stRow().click();
//        Thread.sleep(3000);
//        mtb.MerchantToolBoxPayToolsEterminalReviewAndApproveButton().click();
//        Thread.sleep(3000);
//        mtb.GoBackandEditButton().click();
//        Thread.sleep(3000);
//        mtb.MerchantToolBoxPayToolsEterminalReviewAndApproveButton().click();
//        Thread.sleep(3000);
//        mtb.ApprovePayment().click(); 
//      
//        
//        
//        //Now we need to switch to the eterinal tab
//		Set<String>ids2=driver.getWindowHandles();
//		Iterator<String> it2=ids2.iterator();
//		String parentid2=it2.next();
//		String childid2=it2.next();
//		driver.switchTo().window(childid2);
//		System.out.println(driver.getTitle());
//        
//        
//        
//        //Assert that we see both the "Authorization Code" text as well as the price of the bill = 26.75
//		if(driver.getPageSource().contains("Authorization Code:")  && driver.getPageSource().contains("26.75"))
//		{
//			System.out.println("FOUND: Gas @ 26.75"); 
//			Assert.assertTrue(true, "Gas @ 26.75");
//			log.info("INFO - FOUND: Gas @ 26.75");
//		} else
//		{
//			System.out.println("NOT FOUND: Gas @ 26.75");
//			Assert.assertTrue(false, "Assert NOT FOUND: Gas @ 26.75");
//			log.error("ERROR - NOT FOUND: Gas @ 26.75");
//		}   
        
        
        
        
//		20.) Click on the Pay button.
//		21.) Verify that you are taken to the eTerminal Screen
//		22.) Click the "Review and Approve" Button.
//		23.) Click "Approve Payment" 
//		     FAIL - The progress indicator keeps on spinning.
		
    }
	

	@AfterTest
	public void cleanup()
	{
		h.driver.quit();
		h.driver=null;
	}

	
}
