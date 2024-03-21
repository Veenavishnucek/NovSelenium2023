package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolltobottom {
	ChromeDriver driver;
    String baseurl="https://www.ebay.com/";
    
    @BeforeTest
    public void setUp()
    {
   	 driver= new ChromeDriver();
   	 driver.get(baseurl);
    }
	
    @Test
    public void test() 
    {
    	JavascriptExecutor js= (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[1]/a")).click();
    }
	
	
}
