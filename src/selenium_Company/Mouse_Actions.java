package selenium_Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Mouse_Actions a = new Mouse_Actions();
		a.launchChromedriver();
		d.navigate().to("https://jqueryui.com/droppable/");
		d.switchTo().frame(0);
		WebElement e1= d.findElement(By.xpath("//div[@id='draggable']"));
		WebElement e2=d.findElement(By.xpath("//div[@id='droppable']"));
		Actions a1 = new Actions(d);
		//a1.clickAndHold(e1).moveToElement(e2).release().build().perform();
		a1.dragAndDrop(e1, e2).perform();
		d.switchTo().parentFrame();
		WebElement e3=d.findElement(By.xpath("//input[@name='s']"));
		a1.sendKeys(e3,"Selenium").perform();
		WebElement e4= d.findElement(By.xpath("//a[1][@href='https://jquery.org/support/']"));
		//a1.click(e4).perform();
		//a1.doubleClick(e4).perform();
		a1.contextClick(e4).perform();
		Thread.sleep(4000);
		d.quit();
	}
}
