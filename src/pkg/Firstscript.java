package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		//chromedriver
		//Firefoxdriver
		//edgedriver
		
		ChromeDriver driver= new ChromeDriver();//to launch chrome browser
		driver.get("https://www.google.com");// to load URL
		//driver.get("https://thulasi.psc.kerala.gov.in/thulasi");
		
		String exp= "Google";
		String actual=driver.getTitle();
		if(exp.equals(actual))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.quit();
		

	}

}
