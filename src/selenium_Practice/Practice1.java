package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice1 extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Practice1 a = new Practice1();
		a.Launch_Chrome();
		d.navigate().to("https://testautomationpractice.blogspot.com/");
		d.switchTo().frame("frame-one1434677811");
		d.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Hanmant");
		d.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Hudekar");
		d.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("8975015452");
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		WebElement opt = d.findElement(By.xpath("//select[@id='speed']"));
		Select s= new Select(opt);
		s.selectByIndex(3);
		WebElement opt1 = d.findElement(By.xpath("//select[@id='files']"));
		Select s1= new Select(opt1);
		s1.selectByValue("3");
		WebElement ac1 = d.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Actions as= new Actions(d);
		Thread.sleep(3000);
		as.doubleClick(ac1).perform();
		JavascriptExecutor j=((JavascriptExecutor)d);
		j.executeScript("scroll(0,400)");
		WebElement e1 = d.findElement(By.xpath("//img[@src='https://2.bp.blogspot.com/-dw3qYanXdhM/Wg6dD9-99RI/AAAAAAAAMso/SSJ2vCg-f9QkXneDP3kp6AJPv4EeU1aSwCLcBGAs/s1600/male.png']"));
		WebElement e3 = d.findElement(By.xpath("//div[@id='trash']"));
		WebElement e2 = d.findElement(By.xpath("//img[@src='https://2.bp.blogspot.com/-0RK57BLh-V0/Wg6Vepxw4lI/AAAAAAAAMrw/6g6tLycY6EsUF8GnrwQlg3AFkjWOVOlGwCEwYBhgL/s1600/female-image.png']"));
		as.dragAndDrop(e1, e3).perform();
		as.dragAndDrop(e2, e3).perform();
		Thread.sleep(3000);
		d.quit();
	}
}
