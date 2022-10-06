package selenium_Company;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Window_Position_Handle extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
	
		Launch_Browsers a =new Launch_Browsers();
		a.launchChromedriver();
		d.navigate().to("https://www.facebook.com/login/");
		Dimension b = new Dimension(600,700);
		d.manage().window().setSize(b);
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("8975015726");
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("Hanmant@Sandhya");
		d.findElement(By.xpath("//button[1]")).click();
		Point p = new Point(100,200);
		d.manage().window().setPosition(p);
		Thread.sleep(9000);
       d.close();
	}
}
