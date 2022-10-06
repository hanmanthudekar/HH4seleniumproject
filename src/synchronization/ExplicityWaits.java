package synchronization;

import java.time.Duration;

import org.apache.commons.exec.DaemonExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaits extends Launch_Browsers
{
	public void explicitywaits() throws InterruptedException  
	{
		ExplicityWaits a = new ExplicityWaits();
		Thread.sleep(2000);
		a.launchChromeDriver();
		d.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w= new WebDriverWait(d,Duration.ofSeconds(11));
		WebElement e=	d.findElement(By.xpath("//button[@id='alert']"));
		e.click();
		w.until(ExpectedConditions.alertIsPresent());
		d.switchTo().alert().accept();
		WebElement e1=d.findElement(By.xpath("//button[@id='populate-text']"));
		e1.click();
		w.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"), "Selenium Webdriver"));
		WebElement e2= d.findElement(By.xpath("//h2[@id='h2']"));
		String text = e2.getText();
		System.out.println(text);
		WebElement e3=d.findElement(By.xpath("//button[@id='enable-button']"));
		e3.click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));
		WebElement e4=	d.findElement(By.xpath("//button[@id='disable']"));
		boolean f = e4.isEnabled();
		e4.click();
		if(f==true)
		{
			System.out.println("Test Scenario Passed button is enabled");
		}
		else 
		{
			System.out.println("Test Scenario failed button is not enabled");
		}

		d.findElement(By.xpath("//button[@id='checkbox']")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ch']")));
		WebElement e5;
		e5=	d.findElement(By.xpath("//input[@id='ch']"));
		boolean c = e5.isEnabled();
		if(c==true)
		{
			System.out.println("Test Scenario Passed checkbox is enabled");
		}
		else
		{
			System.out.println("Test Scenario falied checkbox is not enabled");
		}
		e5.click();

		d.findElement(By.xpath("//button[@id='display-other-button']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
		WebElement e6 = d.findElement(By.xpath("//button[@id='hidden']"));
		e6.click();
		boolean g = e6.isEnabled();
		if(g==true) 
		{
			System.out.println("Test Scenario Passed button is enabled");
		}
		else {
			System.out.println("Test Scenario falied button is not enabled");
		}
		d.quit();
	}
	public static void main(String [] args) throws InterruptedException 
	{
		ExplicityWaits a = new ExplicityWaits();
		a.explicitywaits();
	}
}
