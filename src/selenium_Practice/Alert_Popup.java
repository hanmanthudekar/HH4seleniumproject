package selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alert_Popup extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Alert_Popup a= new Alert_Popup();
		a.Launch_Chrome();
		d.navigate().to("https://demoqa.com/alerts");
		d.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		d.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		d.switchTo().alert().accept();
	    d.findElement(By.xpath("//button[@id='promtButton']")).click();
	   Alert prompt = d.switchTo().alert();
	   Thread.sleep(2000);
	    prompt.sendKeys("Hanmant");
	    Thread.sleep(3000);
	 prompt .accept();
		Thread.sleep(3000);
		d.quit();
	}
}
