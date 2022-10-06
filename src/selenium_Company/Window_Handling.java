package selenium_Company;

import org.openqa.selenium.By;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling extends Launch_Browsers{


	public static void main(String[] args) throws InterruptedException {
		Launch_Browsers a=new Launch_Browsers();
		a.launchChromedriver();
		
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.naukri.com/");
		String parentID = d.getWindowHandle();
		System.out.println("Parent Window ID is "+parentID);
		d.findElement(By.xpath("//a[@title='Jobseeker Register']")).click();
		Set<String> parentAndChildIDss = d.getWindowHandles();
		System.out.println("Parent Window ID is "+parentAndChildIDss);

		for(String ch:parentAndChildIDss ) {

			if(!parentID.equals(ch)) {
				System.out.println("Swtiched the Focus of Selenium From Main Page to Child Page");
				d.switchTo().window(ch);
				Thread.sleep(2000);
				d.findElement(By.xpath("//input[@id='name']")).sendKeys("Baba");
				Thread.sleep(2000);
				d.findElement(By.xpath("//input[@id='email']")).sendKeys("Lagin");
				Thread.sleep(2000);
				d.close();
			}
		}
		
		d.switchTo().window(parentID);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("Testing");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='qsbSubmit']")).click();
		Thread.sleep(2000);
		d.close();
	
	}
}
