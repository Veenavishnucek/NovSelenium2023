package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addapgm {
	ChromeDriver driver;
	String baseurl="https://www.flipkart.com/";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void addatest()
	{
		driver.findElement(By.xpath("//div[@class='_2SmNnR']/input")).sendKeys("cycle",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='_5THWM1']/div[5]")).click();
	    driver.navigate().back();
	    
	}
	

}
