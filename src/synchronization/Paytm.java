package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paytm extends Launch_Browsers{

	public void paytm() {
		Paytm a=new Paytm();
		a.launchChromeDriver();
		d.navigate().to("https://paytm.com/recharge");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
		d.findElement(By.xpath("//input[@value='postpaid']")).click();
		//w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@autocomplete='new-password']")));
		d.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("8975015726");
	}
	public static void main(String [] args) {
		
		Paytm a=new Paytm();
		a.paytm();
	}
}
