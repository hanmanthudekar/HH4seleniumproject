package innerHTML;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InnerHTML extends Launch_Browsers {

	public void a1() throws InterruptedException {
		WebElement e1 = d.findElement(By.xpath("//li[@id='menu-item-7572']"));
		Actions s = new Actions(d);
		s.moveToElement(e1).perform();
		List<WebElement> e2 = d.findElements(By.xpath("//ul[@class='sub-menu']//span"));
		int count =e2.size();
		System.out.println(count);
		for(WebElement ch:e2) {
			if((ch.getText()).equals("Python Examples")) {
				String text = ch.getText();
				ch.click();
				
				System.out.println("Clicked on "+text);
			}
		}

		Thread.sleep(3000);
		d.quit();
	}
	public static void main(String [] args) throws InterruptedException {
		InnerHTML a = new InnerHTML();
		a.launchChromeDriver();
		d.navigate().to("https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/");
		a.a1();
	}
}
