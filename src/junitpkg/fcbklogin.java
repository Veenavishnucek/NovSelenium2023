package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fcbklogin {
	
ChromeDriver driver;
String baseurl="https://www.facebook.com/";

@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}

@Test
public void fblogin() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("abc$");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
}


@After
public void tearDown()
{
  driver.quit();	
}


}
