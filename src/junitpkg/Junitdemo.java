package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void Titleverification()
	{
		String exp="Google";
		String actual= driver.getTitle();
		if(actual.equals(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@After
	public void tearDown()
	{
	  driver.quit();	
	}
	

}
