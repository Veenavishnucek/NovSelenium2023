package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayalert {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/deepe/OneDrive/Desktop/Veena/displayalert.html";
	
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void dispalytest()
{
	driver.findElement(By.xpath("//input[1]")).click();
	Alert a= driver.switchTo().alert();
	String alerttext=a.getText();
	System.out.println("Alert text="+alerttext);
	a.accept();
    driver.findElement(By.name("firstname")).sendKeys("abcd");
	driver.findElement(By.name("lastname")).sendKeys("efgh");
	driver.findElement(By.xpath("//input[4]")).click();
	}

}
