package selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Alert_Popups_Handeling extends Launch_Browsers{
	
	public static void main(String [] args) throws InterruptedException, IOException {
	Alert_Popups_Handeling a=new Alert_Popups_Handeling();
	a.Launch_Chrome();
	d.navigate().to("https://demoqa.com/alerts");
	d.findElement(By.xpath("//button[@id='alertButton']")).click();
	Thread.sleep(3000);
	d.switchTo().alert().accept();
	Thread.sleep(3000);
	d.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	Thread.sleep(6000);
	d.switchTo().alert().accept();
	 WebElement sc = d.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
File src = sc.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\Tool.png");
FileHandler.copy(src, dest);
	d.quit();
	}
}
