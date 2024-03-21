package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlpgm {
	ChromeDriver driver;
	String baseurl= "https://www.google.com/";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void instatest() throws InterruptedException
	{
		     //not working//
		//driver.findElement(By.name("q")).sendKeys("books");// not working bcz the button is not clicking bcz of the suggestions
		//driver.findElement(By.name("btnK")).click();
		
		
		      //Method-1//
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("books",Keys.ENTER);
		
		      //Method-2//
		//WebElement search=driver.findElement(By.name("q"));
		//search.sendKeys("books");
		//search.submit();
		
		
		
		
	}
	

}
