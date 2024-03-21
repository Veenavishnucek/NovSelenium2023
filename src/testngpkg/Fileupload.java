package testngpkg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/upload";
	
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void fluploadmthd()
{
	WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	upload.sendKeys("C:\\Users\\deepe\\Documents\\seleniumfldr\\demo.docx");
    WebElement chkbx=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
    chkbx.click();
    Boolean chk=chkbx.isSelected();
    if(chk)
    {
    	System.out.println("Checkbox selected");
    }
    else
    {
    	System.out.println("Checkbox not selected");
    }
    
    String text=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
    System.out.println(text);
    driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
}
	

}
