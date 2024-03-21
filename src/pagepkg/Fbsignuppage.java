package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Fbsignuppage {
	WebDriver driver;
	By createpage= By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By signupbtn= By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	
	public Fbsignuppage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void click1()
	{
		driver.findElement(createpage).click();
	}
	
	public void click2()
	{
		driver.findElement(signupbtn).click();
	}
	
	public String title()
	{
		String actual=driver.getTitle();
		return actual;
//		if(expected.equals(actual))
//		{
//			System.out.println("Title verified");
//		}
//		else
//		{
//			System.out.println("Title not as expected");
//		}
		
		
	}

}
