package selenium_Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Relative_Xpath_By_sir extends Launch_Browsers {

	public static void main(String[] args) throws InterruptedException {
		Launch_Browsers a=new Launch_Browsers();
		a.launchChromedriver();
		d.navigate().to("https://www.facebook.com/");
		d.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8975015726");
		d.findElement(By.xpath("//input[contains (@id,\"pass\")]")).sendKeys("Hanmant@Sandhya");
		//d.findElement(By.xpath("//button")).click();
			d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();	
		Thread.sleep(4000);
		//d.close();
	}
}

