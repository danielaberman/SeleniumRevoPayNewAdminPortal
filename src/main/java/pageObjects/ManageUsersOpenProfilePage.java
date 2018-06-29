package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageUsersOpenProfilePage {
	
	public WebDriver driver;
	
	By accountNumField= By.id("account_number");
	By fnameField = By.id("first_name");
	By lnameField = By.id("last_name");
	By CancelButton = By.xpath("//*[@class='btn btn-default']");
	By PaymentHistoryTab = By.xpath("//*[@aria-controls='paymenth']");
	By ManageUsersSchedulePaymentsTab = By.xpath("//*[@href=\'#schpayment\']");
	By ManageUsersInvoiceTab = By.xpath("//*[@href=\'#invoices\']");
	By ManageUsersTicketHistoryTab = By.xpath("//*[@href=\'#ticketh\']");
    By ManageUsersPaymentCategories = By.id("paymentcattab");
	By ManageUsersPaymentCategoriesManageCategoriesButton = By.id("add_cat_btn");
	By ManageUsersPaymentCategoriesCodeField = By.id("newcode");
	By ManageUsersPaymentCategoriesAmountField =  By.id("newamount");
	By ManageUsersPaymentCategoriesDescriptionField =  By.id("newdescription");
	By ManageUsersPaymentCategoriesPlusButton = By.xpath("//*[@class='btn btn-success btn-outline btn-block btnnewcategory']");
	By ManageUsersPaymentCategoriesCloseButton =   By.xpath("//*[@class='btn btn-default btn-block']");
	By ManageUsersPaymentCategoriesSaveButton  =   By.xpath("//*[@type='submit' and @class='btn btn-primary btn-block']");
	
	By ManageUsersPaymentCategoriesTrashCanButton1stRow = By.xpath("//*[@class='fa fa-trash rmvcategory']");
	
	
	
	

	
	

	
	
	//By ManageUsersSchedulePaymentsTab = By.xpath("//*[@href=\'#schpayment\']");
	//By ManageUsersSchedulePaymentsTab = By.xpath("//*[@id=\'wrapper\']/div/div[3]/div/ul/li[3]/a");
	
	//By ManageUsersScheduleInvoiceTab = By.xpath("//*[@id=\'wrapper\']/div/div[3]/div/ul/li[4]/a");
	
//	$x("//*[@aria-controlls=\'schpayment\']")
//	$x("//*[@href=\'#schpayment\']")
//	
	
    By ManageUsersPaymentHistoryMakePaymentButton= By.xpath("//*[@class='btn btn-primary btn-sm']");
    By ManageUsersPaymentHistoryMakePaymentOneTimeButton = By.xpath("//*[@class='btn group-btn-focused group-btn1 btn-info ']");
    By ManageUsersPaymentHistoryMakePaymentSchedAutopayButton = By.xpath("//*[@class='btn btn-default  group-btn-focused group-btn2 ']");
    
    

    
    
    //btn btn-default  group-btn-focused group-btn2 
    
	//WebElement fname = driver.findElement(By.id("first_name"));
	
	public ManageUsersOpenProfilePage(WebDriver driver)
	{
		//return driver.findElement(signin);
		this.driver=driver;
	}
	
	public WebElement accountNumField()
	{
		return driver.findElement(accountNumField);
	}

	public WebElement fnameField()
	{
		return driver.findElement(fnameField);
	}
	
	public WebElement lnameField()
	{
		return driver.findElement(lnameField);
	}

	public WebElement CancelButton()
	{
		return driver.findElement(CancelButton);
	}
	
	public WebElement PaymentHistoryTab()
	{
		return driver.findElement(PaymentHistoryTab);
	}
	
	public WebElement ManageUsersPaymentHistoryMakePaymentButton()
	{
		return driver.findElement(ManageUsersPaymentHistoryMakePaymentButton);
	}

	public WebElement ManageUsersPaymentHistoryMakePaymentOneTimeButton()
	{
		return driver.findElement(ManageUsersPaymentHistoryMakePaymentOneTimeButton);
	}
	
	public WebElement ManageUsersPaymentHistoryMakePaymentSchedAutopayButton()
	{
		return driver.findElement(ManageUsersPaymentHistoryMakePaymentSchedAutopayButton);
	}
	
	public WebElement ManageUsersSchedulePaymentsTab()
	{
		return driver.findElement(ManageUsersSchedulePaymentsTab);
	}

	public WebElement ManageUsersInvoiceTab()
	{
		return driver.findElement(ManageUsersInvoiceTab);
	}

	public WebElement ManageUsersTicketHistoryTab()
	{
		return driver.findElement(ManageUsersTicketHistoryTab);
	}
	
	public WebElement ManageUsersPaymentCategories()
	{
		return driver.findElement(ManageUsersPaymentCategories);
	}
	

	public WebElement ManageUsersPaymentCategoriesManageCategoriesButton()
	{
		return driver.findElement(ManageUsersPaymentCategoriesManageCategoriesButton);
	}



	public WebElement ManageUsersPaymentCategoriesCodeField()
	{
		return driver.findElement(ManageUsersPaymentCategoriesCodeField);
	}
	
	

	public WebElement ManageUsersPaymentCategoriesAmountField()
	{
		return driver.findElement(ManageUsersPaymentCategoriesAmountField);
	}
	

	public WebElement ManageUsersPaymentCategoriesDescriptionField()
	{
		return driver.findElement(ManageUsersPaymentCategoriesDescriptionField);
	}
	
	

	public WebElement ManageUsersPaymentCategoriesPlusButton()
	{
		return driver.findElement(ManageUsersPaymentCategoriesPlusButton);
	}
	
	
	public WebElement ManageUsersPaymentCategoriesCloseButton()
	{
		return driver.findElement(ManageUsersPaymentCategoriesCloseButton);
	}
	
	

	public WebElement ManageUsersPaymentCategoriesSaveButton()
	{
		return driver.findElement(ManageUsersPaymentCategoriesSaveButton);
	}
	
	

	public WebElement ManageUsersPaymentCategoriesTrashCanButton1stRow()
	{
		return driver.findElement(ManageUsersPaymentCategoriesTrashCanButton1stRow);
	}
	
	
	
	
	

}
