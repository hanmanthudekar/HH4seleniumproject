package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ImplicitWaitsWithIsEnabled extends Launch_Browsers {

	public void implicitWaitsWithIsEnabled() throws InterruptedException {
		ImplicitWaitsWithIsEnabled a = new ImplicitWaitsWithIsEnabled();
		a.launchChromeDriver();
		d.navigate().to("https://www.flipkart.com/");
		//d.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS); old
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));//new 
		WebElement e1 = d.findElement(By.xpath("//input[@type='text']"));
		boolean c = e1.isEnabled();
		if(c==true) {
			System.out.println("Test scenario passed tab is enabled");
			e1.sendKeys("Iphone");
			Thread.sleep(3000);
		}
		else {
			System.out.println("Test scenario passed tab is not enabled");
		}
		d.quit();
	}
	public static void main(String [] args) throws InterruptedException {
		ImplicitWaitsWithIsEnabled a = new ImplicitWaitsWithIsEnabled();
		a.implicitWaitsWithIsEnabled();
	}
}
