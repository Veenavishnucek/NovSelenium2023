package testngpkg;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Goibibo {
	ChromeDriver driver;
    String baseurl="https://www.goibibo.com/";
    
    @BeforeTest
    public void setUp()
    {
   	 driver= new ChromeDriver();
   	 driver.get(baseurl);
   	 driver.manage().window().maximize();
    }
	
    @Test
    public void test() throws InterruptedException 
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.navigate().refresh();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]")).click();
    	
    	while(true)
    	{
    		WebElement month = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
    		String monthname = month.getText();
    		System.out.println(monthname);
    		Thread.sleep(2000);
    		if(monthname.equals("May 2024"))
    		{
    			break;
    		}
    		else 
    		{
    			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
    		   
    		}
    	}
    	
    	List<WebElement> lst= driver.findElements(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div/div/p"));
    	//Thread.sleep(5000);
    	for(WebElement element:lst)
    	{
    		String date= element.getText();
    		System.out.println(date);
            if(date.equals("23"))
    		{
    			element.click();
    		}
    	}
    	
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
    	
    	

    }

}
