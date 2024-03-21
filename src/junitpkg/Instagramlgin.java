package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramlgin {
	
	ChromeDriver driver;
	String baseurl="https://www.instagram.com/";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void instatest() throws InterruptedException
	{
		//Method 1//
	driver.findElement(By.xpath("//form[@method='post']/div/div/div/label/input")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//form/div/div[2]/div/label/input")).sendKeys("1234");
	driver.findElement(By.xpath("//form/div/div[3]")).submit();
    Thread.sleep(3000);
    
          //Method-2//
    //driver.findElement(By.xpath("//form[@method='post']/div/div/div/label/input")).sendKeys("abc@gmail.com");
    //WebElement search=driver.findElement(By.xpath("//form/div/div[2]/div/label/input"));
	//search.sendKeys("1234");
	//search.submit();
    //Thread.sleep(3000);
	
	  
	}

}
