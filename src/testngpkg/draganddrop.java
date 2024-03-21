package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddrop {
 ChromeDriver driver;
 String baseurl="https://demo.guru99.com/test/drag_drop.html";
 
 
 @BeforeTest
 public void setUp()
 {
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	 
 }
 
 @Test
 public void dragdropmthd()
 {
	WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement amoutsrc= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement acountdest = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement amountdest = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	
	 Actions act= new Actions(driver); 
	 act.dragAndDrop(bank, acountdest);
	 act.dragAndDrop(amoutsrc, amountdest);
	 
	
	WebElement sales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement amoutsrc2= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement acountdest2 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement amountdest2 = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
	
	act.dragAndDrop(sales, acountdest2);
	act.dragAndDrop(amoutsrc2, amountdest2);
	act.perform();

	 
	Boolean perfect= driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed();
    
	if(perfect)
	{
		System.out.println("Perfect displayed");
	}
	else
	{
		System.out.println("Perfect not displayed");
	}
 
 }
 
}
