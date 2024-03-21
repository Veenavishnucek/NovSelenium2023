package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago {
	EdgeDriver driver;
    String baseurl= "https://www.trivago.in/"  ;  
    @BeforeTest
    public void setUp()
    {
   	 driver= new EdgeDriver();
   	 driver.get(baseurl);
   	 driver.manage().window().maximize();
 	 //driver.navigate().refresh();

    }
	
    @Test
    public void test() throws InterruptedException
    {
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[1]")).click();
        //Thread.sleep(2000);
    	//driver.navigate().refresh();
    	 
    	while(true) 
    	{
        	WebElement month =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
            String mnthname=month.getText();
            if(mnthname.equals("May 2024"))
            {
            	System.out.println(mnthname);
            	break;
            }
            else
            {
            	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
            }
    	}
    	
    	List<WebElement> lis= driver.findElements(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
    	 
        for(WebElement ele: lis)
        {
        	String date= ele.getText();
        	if(date.equals("23"))
        	{
            	System.out.println(date);
        		ele.click();
        		break;
        	}
        	
        }
        
        List<WebElement> lis1= driver.findElements(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
   	 
        for(WebElement ele: lis1)
        {
        	String date= ele.getText();
        	if(date.equals("25"))
        	{
            	System.out.println(date);
        		ele.click();
        		break;
        	}
        	
        }
    }

}
