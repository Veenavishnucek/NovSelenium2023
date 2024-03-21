package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaznpgm {
	ChromeDriver driver;
	String baseurl= "https://www.amazon.in/";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void amazn() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[1]")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/i")).click();
		Thread.sleep(3000);
	}

}
