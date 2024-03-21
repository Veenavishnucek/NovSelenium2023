package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclk {
	ChromeDriver driver;
	 String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	 
	 
	 @BeforeTest
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl);
		 
	 }
	 
	 @Test
	 public void rightclkmthd()
	 {
		WebElement rghtclk = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act= new Actions(driver);
		act.contextClick(rghtclk);
		act.perform();
		WebElement cpy = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]"));
        cpy.click();
        Alert a1= driver.switchTo().alert();
        a1.accept(); // OR  driver.switchTo().alert().accept();
		WebElement dblclk = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dblclk);
		act.perform();
		Alert a2= driver.switchTo().alert();
		String alerttext=a2.getText();
		System.out.println("Alert text="+alerttext);
		a2.accept();	
	 }	
	

}
