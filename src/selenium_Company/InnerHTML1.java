package selenium_Company;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InnerHTML1 extends Launch_Browsers {

	public static void main(String [] args) {
		InnerHTML1 a = new InnerHTML1();
		a.launchChromedriver();
		d.navigate().to("https://www.qafox.com/selenium/selenium-practice/");
		Actions s= new Actions(d);
		WebElement e1 = d.findElement(By.xpath("//li[@id='menu-item-1073']"));
		s.moveToElement(e1).perform();
		List<WebElement> e2 = d.findElements(By.xpath("//ul[@class='sub-menu']//a"));
		int count=e2.size();
		System.out.println(count);
		for(int i=0;i<count ;i++) {     
			WebElement e3 = e2.get(i);
			String text = e3.getAttribute("innerHTML");
			System.out.println(text);
			if(text.equalsIgnoreCase("Selenium Video Course")) {
				e3.click();
				System.out.println("Clicked");
			}
		}
		d.quit();
	}
}
