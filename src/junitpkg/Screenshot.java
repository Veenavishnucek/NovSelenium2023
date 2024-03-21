package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	String baseurl="https://facebook.com/";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void screenshot() throws IOException
	{
		//to take screenshot of a page//
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\deepe\\OneDrive\\Desktop\\Screeshot1\\fbscreenshot.png"));
	
		
		//To take screenshot of an element//
		WebElement loginbutton= driver.findElement(By.name("login"));
		File src1=loginbutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshot/loginbutton.png"));
		
		WebElement cr_nw_acnt=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		File src2= cr_nw_acnt.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./Screenshot/crtnewacnt.png"));
	
	}

}
