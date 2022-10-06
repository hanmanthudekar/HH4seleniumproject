package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JeevanSathi extends Launch_Browsers{
	public static void main(String [] args) throws InterruptedException {
		JeevanSathi a = new JeevanSathi();
		a.Launch_Chrome();
		d.navigate().to("https://www.jeevansathi.com/");
	 d.findElement(By.xpath("//div[@id=\"relationshipBlock\"]")).sendKeys("Self");Thread.sleep(3000);
		//Select s1= new Select(e1);
		//s1.selectByIndex(3);
		JavascriptExecutor j = ((JavascriptExecutor)d);
		j.executeScript("scroll(0,455)");
		Thread.sleep(3000);
		d.quit();

	}
}
