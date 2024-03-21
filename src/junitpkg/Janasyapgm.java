package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasyapgm {
	ChromeDriver driver;
	String baseurl="https://janasya.com/";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void janasyapgm()
	{
		
	String exp="Janasya";
	String actual=driver.getTitle();
	System.out.println(actual);
	if(exp.equals(actual))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li[1]/a/span")).click();
	driver.findElement(By.xpath("//div[@id='halo-sidebar']/div[2]/div[1]/div/h3")).click();
	driver.findElement(By.xpath("//div[@id='halo-sidebar']/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
	driver.navigate().back();
    driver.findElement(By.xpath("//ul[@id='main-collection-product-grid']/li[2]/div/div/div[2]/div/a/span")).click();
	driver.navigate().back();
	driver.navigate().back();
	List <WebElement>  linklist=driver.findElements(By.tagName("a"));
    System.out.println("Linkcount="+linklist.size());
	 
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
