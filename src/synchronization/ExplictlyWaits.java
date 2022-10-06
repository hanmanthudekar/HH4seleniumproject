package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictlyWaits extends Launch_Browsers {

	public void explicity() {
		ExplictlyWaits a= new ExplictlyWaits();
		a.launchChromeDriver();
		d.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait s= new WebDriverWait(d,Duration.ofSeconds(10));
		d.findElement(By.xpath("//button[@id='display-other-button']")).click();
		WebElement e2=s.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
		d.findElement(By.xpath("//button[@id='hidden']")).click();
	}
	public static void main(String [] args) {
		ExplictlyWaits a= new ExplictlyWaits();
		a.explicity();
	}

}
