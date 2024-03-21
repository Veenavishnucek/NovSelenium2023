package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
	
	@Test
	public void loginxpath() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button")).click();
		//Thread.sleep(3000);	
	}
	
	@After
	public void close()
	{
		driver.quit();
	}
	

}
