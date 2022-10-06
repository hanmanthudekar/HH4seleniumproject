package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ImplicityWaitsWithIsSelected extends Launch_Browsers{

	public void implicityWaitsWithIsSelected() {
		ImplicityWaitsWithIsSelected a = new ImplicityWaitsWithIsSelected();
		a.launchChromeDriver();
		d.navigate().to("https://www.facebook.com/reg/");
	//	d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement e1 = d.findElement(By.id("u_0_5_T3"));
		 e1.click();
	boolean	c= e1.isSelected();
	if(c==true) {
		System.out.println("Test scenario passed male is selected");
	}
	else {
		System.out.println("Test scenario failed male is not selected");
	}
	d.quit();
	}
	public static void main(String [] args) {
		ImplicityWaitsWithIsSelected a = new ImplicityWaitsWithIsSelected();
		a.implicityWaitsWithIsSelected();
	}
}
