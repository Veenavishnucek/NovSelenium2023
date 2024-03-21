package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {

	public static void main(String[] args) {
		String baseurl="https://www.google.com";
		ChromeDriver driver = new ChromeDriver();
		driver.get(baseurl);
		String src= driver.getPageSource();
		if(src.contains("Gmail"))
			{
			 System.out.println("Text is present");
			}
		else
		   {
			 System.out.println("Text not present");
		   }
		driver.quit();
	}
	

}
