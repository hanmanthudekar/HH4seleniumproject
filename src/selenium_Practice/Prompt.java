package selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Prompt extends Launch_Browsers {

	public static void main(String[] args) throws InterruptedException  {
		
		Launch_Browsers a= new Launch_Browsers();
		a.Launch_Chrome();
		d.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		d.findElement(By.xpath("//button[@id='promptBox']")).click();
		 Alert p = d.switchTo().alert();
	//	Thread.sleep(2000);
		p.sendKeys("Hanmant");
		Thread.sleep(2000);
		p.accept();
		d.quit();
	}
}
