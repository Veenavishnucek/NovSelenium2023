package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chromepopup {
	ChromeDriver driver;
   
    
    @BeforeTest
    public void setUp()
    {
   
   	 ChromeOptions option= new ChromeOptions();
   	 option.addArguments("--disable-notifications");
   	 driver=new ChromeDriver(option);
   	 
    }
	
    @Test
    public void test() 
    {
      	 driver.get("https://www.justdial.com");
      	 driver.manage().window().maximize();

    }

}
