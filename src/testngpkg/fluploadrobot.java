package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fluploadrobot {
	ChromeDriver driver;
	String baseurl="https://www.ilovepdf.com/word_to_pdf";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void uploadpgm() throws AWTException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	    fileupload("C:\\Users\\deepe\\Documents\\seleniumfldr\\demo.docx");
	}
	
	
	public void fileupload(String p) throws AWTException
	{
		StringSelection strgslctn= new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strgslctn, null);
		
	    Robot rt= new Robot();
	     
	    rt.delay(3000);
	    
	    rt.keyPress(KeyEvent.VK_CONTROL);
	    rt.keyPress(KeyEvent.VK_V);
	    rt.keyRelease(KeyEvent.VK_V);
	    rt.keyRelease(KeyEvent.VK_CONTROL);
	    
	    rt.delay(3000);
	    
	    rt.keyPress(KeyEvent.VK_ENTER);
	    rt.keyRelease(KeyEvent.VK_ENTER);
	    rt.delay(3000);
	}

}
