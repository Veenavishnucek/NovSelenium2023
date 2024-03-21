package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBlogin {
	
	WebDriver driver;
	By fbemail= By.id("email");
	By fbpassword=By.id("pass");
	By fbclick= By.name("login");
	
	public FBlogin(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	public void setValues(String username,String password)
	{
		driver.findElement(fbemail).sendKeys(username);
		driver.findElement(fbpassword).sendKeys(password);
		
	}
	
	public void login()
	{
		driver.findElement(fbclick).click();
	}

}
