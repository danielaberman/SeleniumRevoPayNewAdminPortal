package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.xpath("//*[@id=\'loginForm\']/button");
	
	
	
	
	public LoginPage(WebDriver driver)
	{
		//return driver.findElement(signin);
		this.driver=driver;
	}
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLoginButton()
	{
		return driver.findElement(loginButton);
	}
	
	
	

}
