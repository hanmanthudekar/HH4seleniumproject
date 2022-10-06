package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ImplicityWaitsWithIsDisplayed extends Launch_Browsers{

	public void implicitWaits() throws InterruptedException {
		ImplicityWaitsWithIsDisplayed a =new ImplicityWaitsWithIsDisplayed();
		a.launchChromeDriver();
		d.navigate().to("https://paytm.com/");
		//d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement logo = d.findElement(By.xpath("//img[@src='//assetscdn1.paytm.com/frontendcommonweb/11272962.svg']"));
		boolean cond = logo.isDisplayed();
		if(cond==true) {
			System.out.println("Test scenario passed logo is displayed");
			logo.click();
			Thread.sleep(2000);
		}
		else {
			System.out.println("Test scenario is failed logo is not displayed");
		}
		d.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		ImplicityWaitsWithIsDisplayed a = new ImplicityWaitsWithIsDisplayed();
		a.implicitWaits();
	}
}
