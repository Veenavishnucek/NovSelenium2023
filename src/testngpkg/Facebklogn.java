package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebklogn {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get(baseurl);
	}
	
	@Parameters({"username","password"})
	@Test
	public void test1(String username, String password)
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
