package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FBlogin;

public class FBlogintest {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void teslogin()
	{
	FBlogin ob = new FBlogin(driver);
	ob.setValues("abc@gmail.com", "abc12");
	ob.login();
	
	}
}
