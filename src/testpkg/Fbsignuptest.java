package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbsignuppage;

public class Fbsignuptest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void test()
	{
		Fbsignuppage ob= new Fbsignuppage(driver);
		ob.click1();
		String actual= ob.title();
		Assert.assertEquals(actual,"Facebook");
		ob.click2();	
	}
	

}
