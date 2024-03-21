package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pscpage {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		String site="https://thulasi.psc.kerala.gov.in/thulasi";
		driver.get(site);
		
		String titlexp ="Kerala Public Service Commission";
		String actual = driver.getTitle();
		System.out.println(driver.getTitle());
		
		if(titlexp.equals(actual))
		{
			System.out.println("Title pass");
		}
		else
		    {
			  System.out.println("Title fail");
			}
		
		  driver.quit();
		

	}

}
