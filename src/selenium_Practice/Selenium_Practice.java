package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Practice  extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Selenium_Practice a = new Selenium_Practice();
		a.Launch_Chrome();
		d.navigate().to("https://testautomationpractice.blogspot.com/");
		d.switchTo().frame("frame-one1434677811");
		d.findElement(By.id("//input[@id='RESULT_TextField-1']")).sendKeys("Hanmant");
	//	d.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Hudekar");
	/*	d.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		WebElement opt1 = d.findElement(By.xpath("//select[@name='speed']"));
		Select s = new Select(opt1);
		s.selectByIndex(2);
		WebElement opt2= d.findElement(By.xpath("//select[@name='files']"));
		Select s1 = new Select(opt2);
	*/	//s1.selectByVisibleText("PDF file");
	}
}
