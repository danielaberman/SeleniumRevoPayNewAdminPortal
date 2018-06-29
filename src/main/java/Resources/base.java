package Resources;

import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

//import org.apache.commons.io;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import com.google.common.io.Files;
import java.util.Date;

public class base {
	
	public static WebDriver driver; 
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		//chrome
		//
		//WebDriver
		//Properties prop = new Properties();
		prop = new Properties();
		//FileInputStream fis=new FileInputStream("C:\\Users\\Revo Laptop 03\\RevopayProject\\src\\main\\java\\Revopay\\data.properties");
		FileInputStream fis=new FileInputStream("C:\\Users\\Revo Laptop 03\\RevopayProject\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);  
		String browserName=prop.getProperty("browsers");
		//System.out.print(prop.getProperty("url"));
		//String URLName=prop.getProperty("url");
		
		if(browserName.equals("chrome"))
		{
			// execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.get("https://sandbox.revopay.com/login");  //sandbox  vkatikaneni:test1234
			//driver.get(browserName=prop.getProperty("url")); //qa3 dberman:Password1
		}
		
		
		if(browserName.equals("firefox"))
		{
			// execute in firefox driver			
			//System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		if(browserName.equals("IE"))
		{
			// execute in IE driver
			//System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			//driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
//	public void getScreenshot(String result) throws IOException
//	//public void getScreenshot() throws IOException
//	{
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
//		FileUtils.copyFile(src, new File("C://Users//Revo Laptop 03//test//screenshot.png"));
//	}
	

//	public void getScreenshot(String result) throws IOException
//	{
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//FileUtils.copyFile(src, destFile;)
//		//Files.copy(src, new File("C:\\users\\Revo Laptop 03\\test\\"+result+"screenshot.png"));
//		//FileUtils.copyFile(src, new File("C:\\Users\\Danny\\screenshots\\screenshot.png"));
//		Files.copy(src, new File("C:\\users\\Danny\\screenshots\\"+result+"screenshot.png"));
//	}
//	

	
	
	//good
	public void getScreenshot(WebDriver driver) throws IOException
	{
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy-HHmmss");
		Date date = new Date();
		String datetime = dateFormat.format(date);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\users\\Revo Laptop 03\\test\\screenshot"+datetime+".png"));
		System.out.println("getScreenshot");
	}
		
	
	
	
	
//	public void getScreenShot(String Name)
//	{
//	      Calendar calendar = Calendar.getInstance();
//	      SimpleDateFormat formater  = new SimpleDateFormat("dd_MM_yyy_hh_mm_ss");     
//	      File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	      try
//	      {
//	      String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()+ "/src/main/java/com/test/Synapse4/screenshot/";
//	      File destFile = new File((String) reportDirectory + Name +" "+ formater.format(calendar.getTime())+ ".png");    
//	          Files.copy(scrFile, destFile);
//	          //.copyFile(scrFile, destFile);
//	          Reporter.log("<a herf ='"+destFile.getAbsolutePath()+"'><img src='"+destFile.getAbsolutePath()+"'height='200' Width='100'/></a>");
//	      }        
//	      catch(Exception e)
//	      {
//	      e.printStackTrace();
//	      }     
//	}
	
	
	

}
