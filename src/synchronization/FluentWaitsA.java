package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitsA extends Launch_Browsers{

	public void a1() {
		d.findElement(By.xpath("//button[@id='enable-button']")).click();
		FluentWait f = new FluentWait(d);
		f.withTimeout(Duration.ofSeconds(10));
		f.pollingEvery(Duration.ofSeconds(3));
		f.ignoring(Exception.class);
		FluentWait s = f.withMessage("Time exceeded");
		 WebElement e = d.findElement(By.xpath("//button[@id='disable']"));
		 e.click();
		 System.out.println(s);
		d.quit();

	}
	public static void main(String [] args) {
		FluentWaitsA s = new FluentWaitsA();
		s.launchChromeDriver();
		d.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		s.a1();
	}
}
