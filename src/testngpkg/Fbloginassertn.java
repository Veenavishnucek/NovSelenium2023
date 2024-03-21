package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbloginassertn {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void Titleverification()
	{
		String exp="Facebook";
		String actual= driver.getTitle();
		Assert.assertEquals(actual,exp);
		System.out.println("Test1");
	}

}
