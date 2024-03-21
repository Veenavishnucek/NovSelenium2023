package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void linkCount()
	{
		List <WebElement>  linklist=driver.findElements(By.tagName("a"));
		System.out.println("Linkcount="+linklist.size());
		int i=1;
		for(WebElement link:linklist)
		{
			System.out.println(i+++"."+link.getText()+"---"+link.getAttribute("href"));

		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	

}
