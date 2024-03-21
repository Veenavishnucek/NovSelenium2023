package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoexercise {
	 ChromeDriver driver;
     String baseurl="https://automationexercise.com/login";
     
     @BeforeTest
     public void setUp()
     {
    	 driver= new ChromeDriver();
    	 driver.get(baseurl);
     }
	
     @Test
     public void automtnexercise() throws InterruptedException
     {
 	    WebElement email=driver.findElement(By.name("email"));
 	    email.sendKeys("veenavishnucek@gmail.com");
	    WebElement password=driver.findElement(By.name("password"));
	    password.sendKeys("Automation123");
        WebElement login=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        login.click();
        String actual=driver.getCurrentUrl();
        
        String expected = "https://automationexercise.com/";
        if(actual.equals(expected))
        {
        	System.out.println("Logged in successfully!!!");
        }
        else
        {
        	System.out.println("failed!!");

        }
        //Thread.sleep(2000);
    	 
     }
		// "xpath(\"//*[@id=\\\"form\\\"]/div/div/div[1]/div/form/input[2]
          //  xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]


}
