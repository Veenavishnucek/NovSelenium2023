package junitpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksvalidation {
	
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);	
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(4000);
		List <WebElement> li= driver.findElements(By.tagName("a"));
		System.out.println("Total number of links="+li.size());
		
		for(WebElement element:li)
		{
			String link= element.getAttribute("href");
			verify(link);
		}
		
	}

	private void verify(String link) {
		
		try {
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Responsecode is 200--successful");
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("Broken link");
			}
			else
			{
				System.out.println("Not Expected");
			}
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
