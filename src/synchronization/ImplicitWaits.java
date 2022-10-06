package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaits extends Launch_Browsers{

	public void implicit() {
		d.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait w=new WebDriverWait(d,Duration.ofSeconds(20));
		d.findElement(By.xpath("//button[@id='populate-text']")).click();
		w.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"), "Selenium Webdriver"));
		WebElement e1 = d.findElement(By.xpath("//h2[@id='h2']"));
		boolean c = e1.isDisplayed();
		if(c==true) {
			System.out.println("Test scenario passed Selenium Webdriver is displayed");
		}
		else {
			System.out.println("Test scenario failed Selenium Webdriver is not displayed");
		}
		d.quit();
	}
	public void fb() {
		d.navigate().to("https://www.facebook.com/signup");
		WebElement e1 = d.findElement(By.xpath("//input[@name='firstname']"));
		boolean c = e1.isEnabled();
		if(c==true) {
			System.out.println("Test scenario passed fn Enabled");
		}
		else {
			System.out.println("Test scenario failed fn is not enabled");
		}
		e1.sendKeys("Hanmant");
	WebElement e2 = d.findElement(By.xpath("(//input)[11]"));
	e2.click();
	boolean s=e2.isSelected();
	if(s==true) {
		System.out.println("Test scenario passed male is selected");
	}
	else {
		System.out.println("Test scenario failed male is not selected");
	}
		d.quit();
	}
	public static void main(String [] args) {
		ImplicitWaits b = new ImplicitWaits();
		b.launchChromeDriver();
		//b.implicit();
		b.fb();
	}
}
