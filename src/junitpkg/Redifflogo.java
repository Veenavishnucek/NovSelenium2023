package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
    @Before
    public void setUp()
    {
    	driver=new ChromeDriver();
    	driver.get(baseurl);
    }
    
    @Test
    public void test()
    {
    	Boolean logo=driver.findElement(By.xpath("//div[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
      if(logo)
      {
    	  System.out.println("Logo is displayed");
      }
      else
      {
    	  System.out.println("Logo is not visible");
      }
      
      
      // radio button checked//
      Boolean radio= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
      if (radio)
      {
    	  System.out.println("Malebutton checked");
      }
      else
      {
    	  System.out.println("Malebutton not checked");
      } 
      
    }
}
