package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MerchantToolBox {
	
	public WebDriver driver;
	
	By PaytoolsMenu = By.xpath("//*[@id=\'side-menu\']/li[4]/a/span[1]");
	
	//By PaytoolsMenuInvoices = By.cssSelector("li.active:nth-child(3) > a:nth-child(1)");
	By PaytoolsMenuInvoices = By.xpath("/html/body/aside/div/div[1]/ul/li[4]/ul/li[3]/a");
	//By PaytoolsMenuInvoicesNewInvoiceButton = By.cssSelector("btn btn-success margint-10");
	By PaytoolsMenuInvoicesNewInvoiceButton = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/a");
	
	By PayToolsMenuPayToField = By.id("select2-chosen-1");
	By PayToolsMenuPayToEntryField = By.id("s2id_autogen1_search");
	By PayToolsMenuInvoiceDateField = By.id("invoicedate");
	By PayToolsMenuInvoiceDueDateField = By.id("invoiceduedate");
	By PaytoolsMenuSubjectField = By.xpath("//*[@name='subject']");
	By PaytoolsMenuItemField = By.xpath("//*[@class='form-control item']");
	By PaytoolsMenuCreateNewInvoiceButton = By.id("submitbtn");
	By PaytoolsMenuInvoiceActionsRow1 = By.xpath("//*[@class='btn btn-xs btn-default dropdown-toggle']");
	By PaytoolsMenuInvoiceActionRow1Send = By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[14]/div/ul/li[4]/a");
    
	By Manage = By.xpath("//*[@id='side-menu']/li[5]/a/span[1]");
	By ManageUsers = By.xpath("//*[@id='side-menu']/li[5]/ul/li[1]/a");
	By ManageUsersSearchByFirstName = By.id("first_name");
	By ManageUsersSearchByLastName = By.id("last_name");
	By ManageUserSearchButton = By.xpath("//*[@type='submit']");
	By ManageUserActionButton1stRow = By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[12]/div/button/span[1]");
	By ManageUserActionButtonOpenProfile = By.xpath("//*[@id='wrapper']/div/div[3]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[12]/div/ul/li[2]/a");
	By ManageUserInvoiceTab = By.xpath("//*[@href='#invoices']");
	
	
	By ManageUserInvoicesPayButton1stRow = By.xpath("//*[@id='web-users-invoice-history-pg']/tbody/tr[1]/td[11]/div/form/button");
	//By MerchantToolBoxPayToolsEterminalReviewAndApproveButton = By.id("xnext_step2");
	
	By MerchantToolBoxPayToolsEterminalReviewAndApproveButton = By.xpath("//*[@id='xnext_step2' and @class='btn btn-primary']");
    
	By ApprovePayment = By.id("approve_button");
	
	//By GoBackandEditButton = By.xpath("//*[@class='btn btn-default btn-block']");
	
	By GoBackandEditButton = By.xpath("//*[@id='myModal_Sapprove']/div/div/div[4]/div/div[1]/button");
	
	//By NewInvoiceItemTotalPrice = By.id("totalprice1");
	//By NewInvoiceItemTotalPrice = By.xpath("//*[@id='totalprice1']");
	By NewInvoiceItemTotalPrice = By.xpath("//*[@class='form-control totalprice']");
	
	public MerchantToolBox(WebDriver driver)
	{
		//return driver.findElement(signin);
		this.driver=driver;
	}
	
	public WebElement PaytoolsMenu()
	{
		return driver.findElement(PaytoolsMenu);
	}

	public WebElement PaytoolsMenuInvoices()
	{
		return driver.findElement(PaytoolsMenuInvoices);
	}
	
	public WebElement PaytoolsMenuInvoicesNewInvoiceButton()
	{
		return driver.findElement(PaytoolsMenuInvoicesNewInvoiceButton);
	}

	public WebElement PayToolsMenuPayToField()
	{
		return driver.findElement(PayToolsMenuPayToField);
	}
	


	public WebElement PayToolsMenuInvoiceDateField()
	{
		return driver.findElement(PayToolsMenuInvoiceDateField);
	}
	

	public WebElement PayToolsMenuInvoiceDueDateField()
	{
		return driver.findElement(PayToolsMenuInvoiceDueDateField);
	}
	

	public WebElement PaytoolsMenuSubjectField()
	{
		return driver.findElement(PaytoolsMenuSubjectField);
	}
	

	public WebElement PaytoolsMenuItemField()
	{
		return driver.findElement(PaytoolsMenuItemField);
	}
	

	public WebElement PaytoolsMenuCreateNewInvoiceButton()
	{
		return driver.findElement(PaytoolsMenuCreateNewInvoiceButton);
	}

	
	public WebElement PayToolsMenuPayToEntryField()
	{
		return driver.findElement(PayToolsMenuPayToEntryField);
	}
	
	public WebElement PaytoolsMenuInvoiceActionsRow1()
	{
		return driver.findElement(PaytoolsMenuInvoiceActionsRow1);
	}	 	

	public WebElement PaytoolsMenuInvoiceActionRow1Send()
	{
		return driver.findElement(PaytoolsMenuInvoiceActionRow1Send);
	}	 		
	
	

	public WebElement Manage()
	{
		return driver.findElement(Manage);
	}	 	
	

	public WebElement ManageUsers()
	{
		return driver.findElement(ManageUsers);
	}	 	
	

	public WebElement ManageUsersSearchByFirstName()
	{
		return driver.findElement(ManageUsersSearchByFirstName);
	}	 	
	

	public WebElement ManageUsersSearchByLastName()
	{
		return driver.findElement(ManageUsersSearchByLastName);
	}	 	
	

	public WebElement ManageUserSearchButton()
	{
		return driver.findElement(ManageUserSearchButton);
	}	 	
	
	public WebElement ManageUserActionButton1stRow()
	{
		return driver.findElement(ManageUserActionButton1stRow);
	}	 	
	

	public WebElement ManageUserActionButtonOpenProfile()
	{
		return driver.findElement(ManageUserActionButtonOpenProfile);
	}	 	
	
	public WebElement ManageUserInvoiceTab()
	{
		return driver.findElement(ManageUserInvoiceTab);
	}	 	
	
	public WebElement ManageUserInvoicesPayButton1stRow()
	{
		return driver.findElement(ManageUserInvoicesPayButton1stRow);
	}

	public WebElement MerchantToolBoxPayToolsEterminalReviewAndApproveButton()
	{
		return driver.findElement(MerchantToolBoxPayToolsEterminalReviewAndApproveButton);
	}
	
	public WebElement ApprovePayment()
	{
		return driver.findElement(ApprovePayment);
	}

	public WebElement GoBackandEditButton()
	{
		return driver.findElement(GoBackandEditButton);
	}

	public WebElement NewInvoiceItemTotalPrice()
	{
		return driver.findElement(NewInvoiceItemTotalPrice);
	}
	
	
	
}
