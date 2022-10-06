package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetAttribute extends Launch_Browsers{

	public void a1() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e = d.findElement(By.xpath("//input[@id='email']"));
		e.sendKeys("8975015726");
		String op = e.getAttribute("innerHTML");
		System.out.println("Attribute value is "+op);
		Thread.sleep(3000);
		d.quit();
	}
	public void a2() {
		
	}
	public static void main(String [] args) throws InterruptedException {
		GetAttribute a =new GetAttribute();
		a.Launch_Chrome();
		d.navigate().to("https://www.facebook.com/login/");
		a.a1();
	}
}
