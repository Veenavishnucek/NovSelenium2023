package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Question2 {
	ChromeDriver driver;
    String baseurl="https://www.amazon.in/";
    
    @BeforeTest
    public void setUp()
    {
   	 driver= new ChromeDriver();
   	 driver.get(baseurl);
    }
	
    @Test
    public void test() throws InterruptedException 
    {
    	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
    	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
    	driver.manage().window().maximize();
    	
    	String actual= driver.getTitle();
		System.out.println(actual);
        String expected= "Amazon.in : mobilephones";
    	if(actual.equals(expected))
    	{
    		System.out.println("Title verified");
    		
    	}
    	else
    	{
    		System.out.println("Title verification failed");

    	}
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //implicitly//

    	String parentWindow= driver.getWindowHandle();
		Thread.sleep(2000);

        JavascriptExecutor js= (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,500)","");
        WebElement list =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
        list.click();
        driver.manage().window().maximize();
        Set<String> allWindowHandle= driver.getWindowHandles();
    	
    	for( String handle: allWindowHandle)
    	{
    		if(!handle.equalsIgnoreCase(parentWindow))
    		{
    			driver.switchTo().window(handle);
    	    	js.executeScript("window.scrollBy(0,500)","");

    			WebElement firstlink= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input"));
    	    	Thread.sleep(2000);
    	    	firstlink.click();
    	    	Thread.sleep(3000);
    	    	
    	    	
    			driver.close();
    		}
			driver.switchTo().window(parentWindow);
    		
    		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
    }

}
}



