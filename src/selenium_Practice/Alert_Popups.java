package selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alert_Popups extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Alert_Popups a = new Alert_Popups();
		a.Launch_Chrome();
		d.navigate().to("https://demoqa.com/alerts");
		d.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		String Text=d.switchTo().alert().getText();
		System.out.println(Text);
		d.switchTo().alert().accept();
		Thread.sleep(300);
		d.findElement(By.xpath("//button[@id='promtButton']")).click();
	 d.switchTo().alert().sendKeys("Hanmant");
	 String Text1=d.switchTo().alert().getText();
	 System.out.println(Text1);
		d.switchTo().alert().accept();
		d.quit();

	}
}
