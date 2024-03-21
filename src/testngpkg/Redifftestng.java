package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifftestng {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest(alwaysRun=true)
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun=true)
	public void urlloadind()
	{
		driver.get(baseurl);
	}
	
	@Test(priority=1,enabled=false)
	public void titleverfctn()
	{
		String exp="Rediff";
		String act= driver.getTitle();
		System.out.println(act);
		if(exp.equals(act))
		{
			System.out.println("Title as expected");
		}
		else
		{
			System.out.println("Title not as expected");
		}
	}
	
	@Test(priority=4,groups= {"sanity"})
	public void createaccnt()
	{
		Boolean cr_my_acnt= driver.findElement(By.xpath("//input[@id='Register']")).isEnabled();
	    if(cr_my_acnt)
	    {
	    	System.out.println("Create my account button is enabled");
	    }
	    else
	    {
	    	System.out.println("Create my account button is not enabled");
	    }
	}
	
	@Test(priority=2,groups= {"smoke","sanity"})
	public void crtacntTextverfcn()
	{
		WebElement cr_my_acnt= driver.findElement(By.xpath("//input[@id='Register']"));
		String actualtext= cr_my_acnt.getAttribute("value");
		System.out.println(actualtext);
		String exp= "Create my account >>";
		if(actualtext.equals(exp))
		{
			System.out.println("Text verified");
		}
		else
		{
			System.out.println("Text not as expected");
		}

	}
	
	@Test(priority=3,groups= {"smoke"})
	public void fullnamefld()
	{
	String expctd=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[1]")).getText();
	String actual="Full Name";
	if(actual.equals(expctd))
	 {
		System.out.println("Full name text verified");
	 }
	else
	 {
		System.out.println("Full name text not as expected");
	 }
	
	}
	
	@Test(priority=5,groups= {"smoke"})
	public void logo()
	{
		Boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");

		}
	}

}
