package selenium_Company;

import org.openqa.selenium.By;

public class Google_Search extends Launch_Browsers{

	public static void main(String [] args) {
		
		Launch_Browsers a= new Launch_Browsers();
		a.launchChromedriver();
         d.findElement(By.xpath("https://www.google.co.in/"));
		d.findElement(By.xpath("//input[1][@name='q']")).sendKeys("fb");
		d.close();
	}
}
