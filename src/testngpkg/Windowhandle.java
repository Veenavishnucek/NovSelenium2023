package testngpkg;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	ChromeDriver driver;
    String baseurl="https://demo.guru99.com/popup.php";
    
    @BeforeTest
    public void setUp()
    {
   	 driver= new ChromeDriver();
   	 driver.get(baseurl);
    }
	
    @Test
    public void test() 
    {
    	String parentWindow= driver.getWindowHandle();
    	
    	System.out.println("Parent window handle="+driver.getTitle());
    	driver.findElement(By.xpath("/html/body/p/a")).click();
    	
    	Set<String> allWindowHandle= driver.getWindowHandles();
    	
    	for( String handle: allWindowHandle)
    	{
    		if(handle.equalsIgnoreCase(parentWindow))
    		{
    			driver.switchTo().window(handle);
    			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("Abc@gmail.com");
    			driver.close();
    		}
    		
			driver.switchTo().window(parentWindow);

    	}
    	
    	
    }
	

}
