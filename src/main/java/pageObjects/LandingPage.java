package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By LogoutButton = By.cssSelector(".a_action_logout");
	By Dashboard = By.xpath("//*[@id='side-menu']/li[1]/a/span[1]");

	By Reports = By.xpath("//*[@id='side-menu']/li[2]/a/span[1]");
	By ReportsTransaction = By.xpath("/html/body/aside/div/div[1]/ul/li[2]/ul/li[1]/a");
	By ReportsEvents = By.cssSelector(".in > li:nth-child(7) > a:nth-child(1)"); // good
	By ReportsAuditAutopayments = By.xpath("/html/body/aside/div/div[1]/ul/li[2]/ul/li[8]/a");
	By ReportsSettlements = By.cssSelector(".in > li:nth-child(4) > a:nth-child(1)"); // missing
	By ReportsOutbounds = By.cssSelector(".in > li:nth-child(3) > a:nth-child(1)");  //good
	By ReportsAutoPayments = By.cssSelector(".in > li:nth-child(2)");  // good
	//By ReportsAutoPayments = By.cssSelector(".in > li:nth-child(2) > a:nth-child(1)");  // good
	By ReportsByCategories = By.cssSelector(".in > li:nth-child(5) > a:nth-child(1)"); //good
	By ReportsEMAFReports = By.cssSelector(".in > li:nth-child(6) > a:nth-child(1)"); //good

	By SearchByMerchant = By.cssSelector("#name_clients");
	By Application = By.xpath("//*[@id='side-menu']/li[4]/a/span[1]");
	By ApplicationApplication =  By.cssSelector(".in > li:nth-child(1) > a:nth-child(1)");
	By SupportMenu = By.xpath("//*[@id='side-menu']/li[5]/a/span[1]");
	
	By Manage = By.xpath("//*[@id='side-menu']/li[3]/a/span[1]");
	By ManageMerchants = By.cssSelector(".in > li:nth-child(4) > a:nth-child(1)");
	By ManageUsers =By.cssSelector(".in > li:nth-child(1) > a:nth-child(1)");
	By ManagePartners = By.cssSelector(".in > li:nth-child(2) > a:nth-child(1)");
	By ManageGroups =  By.cssSelector(".in > li:nth-child(3) > a:nth-child(1)");
	By ManagePricingTables = By.cssSelector(".in > li:nth-child(5) > a:nth-child(1)");
	By ManageBranches = By.cssSelector(".in > li:nth-child(6) > a:nth-child(1)");
	By ManageTickets = By.cssSelector(".in > li:nth-child(7) > a:nth-child(1)");
	By ManageAdmins = By.cssSelector(".in > li:nth-child(8) > a:nth-child(1)");
	By ManageLayout = By.cssSelector(".in > li:nth-child(9) > a:nth-child(1)");
	
	By SearchManageUserFirstName = By.id("first_name");
	By SearchManageUserLastName = By.id("last_name");
	By SearchManageUserSearchButton = By.xpath("//*[@id='filtersAndExportDiv']/div/form/input[1]");
    By SearchManageUserResetButton=By.xpath("//*[@class='filterreset btn btn-default']");
    By SearchManageUserAccountNumber = By.id("account_number");
	
    
    By SearchManageUserActionButton1=By.xpath("//*[@class='btn btn-xs btn-default dropdown-toggle']");
    
    ////////////////////
    By SearchManageMerchantActionButton1= By.xpath("//*[@class='btn btn-xs btn-default dropdown-toggle']");
    
    
    
    
    By ActionOpenProfileRow1 = By.cssSelector(".open > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    By ManageMerchanActionOpenRow1 = By.cssSelector("div.dropdown > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    
    
    
    
    By PaymentVolumeCountLable = By.id("payments-count");
    
    By ExpectedDepositsGoToReportLink = By.xpath("//*[@id='wrapper']/div/div[2]/div[2]/div[1]/div/div[2]/a");
    
    By PayorsTotalAdoptionRate = By.xpath("//*[@id='dashboardPayorsTotal']/div[2]/div[2]/h4");
    
    By PayorsTotalGoToReportLink = By.xpath("//*[@id=\'wrapper\']/div/div[2]/div[2]/div[2]/div/div[2]/a");
    
    By ActivesAutoPayments = By.xpath("//*[@id='payments-count']");
    By ActivesAutoPaymentsGotoReportsLink = By.xpath("//*[@id='wrapper']/div/div[2]/div[2]/div[3]/div/div[2]/a");
    
    By RecentActivityAmericanExpressVolume = By.xpath("//*[@id='dashboardRecentActivity']/div[3]/div[1]/h3");
    By RecentActivityAmericanExpressVolumeLabel = By.xpath("//*[@id=\'dashboardRecentActivity\']/div[3]/div[1]/small");
    By RecentActivityCashVolume = By.xpath("//*[@id=\'dashboardRecentActivity\']/div[3]/div[2]/h3");
    By RecentActivityCashVolumeLabel = By.xpath("//*[@id=\'dashboardRecentActivity\']/div[3]/div[2]/small");
    By RecentActivityCreditCardVolume = By.xpath("//*[@id=\'dashboardRecentActivity\']/div[3]/div[3]/h3");
    By RecentActivityCreditCardVolumeLable = By.xpath("//*[@id='dashboardRecentActivity']/div[3]/div[3]/small");

    By RecentActivityECheckVolume = By.xpath("//*[@id=\'dashboardRecentActivity\']/div[3]/div[4]/h3");
    By RecentActivityECheckVolumeLable = By.xpath("//*[@id=\'dashboardRecentActivity\']/div[3]/div[4]/small");
    
    By RecentActivityTotalVolume = By.xpath("//*[@id='dashboardRecentActivity']/div[3]/div[5]/h3");
    By RecentActivityTotalVolumeLabel=  By.xpath("//*[@id='dashboardRecentActivity']/div[3]/div[5]/small");
    
    
    // btn btn-xs btn-default dropdown-toggle
    
    // table.table-responsive > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(14) > div:nth-child(1) > button:nth-child(1)
    // html body.fixed-navbar.sidebar-scroll div#wrapper div.container-fluid div.content div.hpanel div.panel-body div.rpd-datagrid div.table-responsive table.table.table-responsive.table-striped.table-bordered.table-hover.dataTable.no-footer.reportaction tbody tr td div.dropdown.pull-right button.btn.btn-xs.btn-default.dropdown-toggle
    // /html/body/div[2]/div/div[3]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[14]/div/button
    
  //*[@id="wrapper"]/div/div[3]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[14]/div/button/span[1]
	
	//By Application =By.cssSelector("li.active:nth-child(4) > a:nth-child(1) > span:nth-child(1)");

	//By PreviousButton
	//By NextButton
	//By HideNavBar
	//By DropdownItemsPerPage
	//By ProfileButton
	//By
	
	
	
	By title = By.xpath("//*[@id='logo']/span");
	//By PanelHeader = By.xpath("//*[@id='wrapper']/div/div[2]/div[1]/div/div/div[1]");
	By PanelHeader = By.xpath(".col-lg-12 > div:nth-child(1) > div:nth-child(1)");
	

	public LandingPage(WebDriver driver)
	{
		//return driver.findElement(signin);
		this.driver=driver;
	}
	
	public WebElement LogoutButton()
	{
		return driver.findElement(LogoutButton);
	}

	public WebElement Dashboard()
	{
		return driver.findElement(Dashboard);
	}

	public WebElement Reports()
	{
		return driver.findElement(Reports);
	}
	
	public WebElement ReportsTransaction()
	{
		return driver.findElement(ReportsTransaction);
	}
	
	public WebElement ReportsAutoPayments()
	{
		return driver.findElement(ReportsAutoPayments);
	}
	
	public WebElement ReportsOutbounds()
	{
		return driver.findElement(ReportsOutbounds);
	}
	
	public WebElement ReportsSettlements()
	{
		return driver.findElement(ReportsSettlements);
	}
	
	public WebElement ReportsByCategories()
	{
		return driver.findElement(ReportsByCategories);
	}
	
	public WebElement ReportsEMAFReports()
	{
		return driver.findElement(ReportsEMAFReports);
	}
	
	public WebElement ReportsEvents()
	{
		return driver.findElement(ReportsEvents);
	}
	
	public WebElement ReportsAuditAutopayments()
	{
		return driver.findElement(ReportsAuditAutopayments);
	}
	
	public WebElement Manage()
	{
		return driver.findElement(Manage);
	}

	public WebElement ManageMerchants()
	{
		return driver.findElement(ManageMerchants);
	}
	
	public WebElement title()
	{
		return driver.findElement(title);
	}

	public WebElement PanelHeader()
	{
		return driver.findElement(PanelHeader);
	}

	public WebElement Application()
	{
		return driver.findElement(Application);
	}
	
	public WebElement SupportMenu()
	{
		return driver.findElement(SupportMenu);
	}

	public WebElement SearchByMerchant()
	{
		return driver.findElement(SearchByMerchant);
	}

	public WebElement ManageUsers()
	{
		return driver.findElement(ManageUsers);
	}
	
	public WebElement ManagePartners()
	{
		return driver.findElement(ManagePartners);
	}
	
	public WebElement ManageGroups()
	{
		return driver.findElement(ManageGroups);
	}


	public WebElement ManagePricingTables()
	{
		return driver.findElement(ManagePricingTables);
	}
	

	public WebElement ManageBranches()
	{
		return driver.findElement(ManageBranches);
	}

	public WebElement ManageTickets()
	{
		return driver.findElement(ManageTickets);
	}

	public WebElement ManageAdmins()
	{
		return driver.findElement(ManageAdmins);
	}

	public WebElement ManageLayout()
	{
		return driver.findElement(ManageLayout);
	}
	
	public WebElement ApplicationApplication()
	{
		return driver.findElement(ApplicationApplication);
	}
	
	public WebElement SearchManageUserFirstName()
	{
		return driver.findElement(SearchManageUserFirstName);
	}
	
	public WebElement SearchManageUserLastName()
	{
		return driver.findElement(SearchManageUserLastName);
	}
	
	public WebElement SearchManageUserSearchButton()
	{
		return driver.findElement(SearchManageUserSearchButton);
	}

	public WebElement SearchManageUserResetButton()
	{
		return driver.findElement(SearchManageUserResetButton);
	}

	public WebElement SearchManageUserAccountNumber()
	{
		return driver.findElement(SearchManageUserAccountNumber);
	}
	
	public WebElement SearchManageUserActionButton1()
	{
		return driver.findElement(SearchManageUserActionButton1);
	}
	
	public WebElement ActionOpenProfileRow1()
	{
		return driver.findElement(ActionOpenProfileRow1);
	}

	public WebElement PaymentVolumeCountLable()
	{
		return driver.findElement(PaymentVolumeCountLable);
	}

	public WebElement ExpectedDepositsGoToReportLink()
	{
		return driver.findElement(ExpectedDepositsGoToReportLink);
	}
	
	public WebElement PayorsTotalAdoptionRate()
	{
		return driver.findElement(PayorsTotalAdoptionRate);
	}
	
	public WebElement PayorsTotalGoToReportLink()
	{
		return driver.findElement(PayorsTotalGoToReportLink);
	}
	
	public WebElement ActivesAutoPayments()
	{
		return driver.findElement(ActivesAutoPayments);
	}
	
	public WebElement ActivesAutoPaymentsGotoReportsLink()
	{
		return driver.findElement(ActivesAutoPaymentsGotoReportsLink);
	} 
	
	public WebElement RecentActivityAmericanExpressVolume()
	{
		return driver.findElement(RecentActivityAmericanExpressVolume);
	} 

	public WebElement RecentActivityAmericanExpressVolumeLabel()
	{
		return driver.findElement(RecentActivityAmericanExpressVolumeLabel);
	} 

	public WebElement RecentActivityCashVolume()
	{
		return driver.findElement(RecentActivityCashVolume);
	} 

	public WebElement RecentActivityCashVolumeLabel()
	{
		return driver.findElement(RecentActivityCashVolumeLabel);
	} 

	public WebElement RecentActivityCreditCardVolume()
	{
		return driver.findElement(RecentActivityCreditCardVolume);
	} 
	
	public WebElement RecentActivityCreditCardVolumeLable()
	{
		return driver.findElement(RecentActivityCreditCardVolumeLable);
	} 

	public WebElement RecentActivityECheckVolume()
	{
		return driver.findElement(RecentActivityECheckVolume);
	} 

	public WebElement RecentActivityECheckVolumeLable()
	{
		return driver.findElement(RecentActivityECheckVolumeLable);
	} 

	public WebElement RecentActivityTotalVolume()
	{
		return driver.findElement(RecentActivityTotalVolume);
	} 
	
	public WebElement RecentActivityTotalVolumeLabel()
	{
		return driver.findElement(RecentActivityTotalVolumeLabel);
	} 

	public WebElement SearchManageMerchantActionButton1()
	{
		return driver.findElement(SearchManageMerchantActionButton1);
	} 
	
	public WebElement ManageMerchanActionOpenRow1()
	{
		return driver.findElement(ManageMerchanActionOpenRow1);
	} 
	
	
    	
	
}

