package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Google_Autofill extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Google_Autofill a=new Google_Autofill();
		a.Launch_Chrome();
		d.navigate().to("https://www.google.co.in/");
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("Facebook");
		Thread.sleep(3000);
		List<WebElement> opt = d.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		int s=opt.size();
		System.out.println(s);
		
		opt.get(s-2).click();
	}
}
